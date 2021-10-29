package src.testPackage;
import java.sql.*;
import java.util.Scanner;
import java.io.*;



public class jdbcConnection {
	private String filePath = "C:\\Users\\Sabari Roy\\Desktop\\files\\";
	private String fileName = "loc_nbr.txt";
	private String fieldSeperator = ";";
	private Integer loc_updater_value = 5;
	public void mainFunc()
	{
		callJdbcCon();
		readFile();
	}
	
		public void callJdbcCon()
		{
			try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sc_dev","root","tiger");
			Statement smt = con.createStatement();
			//smt.execute("insert into sc_dev.fct_target_dtl values(104,'NEW JERSY','Y',157982,157980,157890)");
			System.out.println("Connected to db successfully");
			ResultSet rs = smt.executeQuery("select loc_nbr,loc_name from sc_dev.fct_target_dtl");
			createFile();
			
			while(rs.next())
			{ 		
			writeFile(rs.getInt(1),rs.getString(2));
			}
			con.close();
			}
			
			catch(Exception e)
			{
				System.out.println("Connection to database failed");
				System.out.println(e);
				//handle db connectivity
			}
		}
		private void createFile() 
		//function to create a new file on given name 
		{
			try {
				File obj = new File(filePath+fileName);
					if(obj.createNewFile())
						{
							System.out.println("File "+obj.getName()+ " created ");
					
						}
					else
							{
								System.out.println("File already exists!");
					
										//debugging line
							}
				
				}
				catch(IOException e)
					{
						e.printStackTrace();
					}
		}
		private void writeFile(Integer loc_nbr,String loc_name)
		{
			try {
			Writer writer = new BufferedWriter(new FileWriter(filePath+fileName,true));
				//FileWriter writerObj = new FileWriter(filePath+fileName);
						if(fileEmptyCheck())
			{
				writer.write("LOC_NBR"+fieldSeperator+"LOC_NAME"+fieldSeperator+"LOCATIOON_NUMBER_UPDATED"+"\r\n");
			}
			{
			writer.append(loc_nbr.toString()+fieldSeperator+loc_name+fieldSeperator+loc_nbr * loc_updater_value +"\r\n");
			  		writer.close();
		
			//writer.append("Hello hello\\r\\n");
			}
			
		}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		
	}
		private boolean fileEmptyCheck()
		{
			
			File file = new File(filePath+fileName);
			if(file.length() == 0)
			{
			return true;
			}
			else
			{
				return false;
			}
			}
		private void readFile()
		{
			String s1 = "";
			
			
			File file = new File(filePath+fileName);
			
				if (file.exists())
				{
					try 
					{
						Scanner sc = new Scanner(file);
						sc.nextLine();
						while(sc.hasNextLine())
							
						{
							s1 = sc.nextLine();
							String[] arr = s1.split(fieldSeperator);
							
								System.out.println("LOCATION NUMBER : "+arr[0]);
									System.out.println("LOCATION NAME : "+arr[1]);
							
						}
						sc.close();
					} 
					catch (FileNotFoundException e) 
					{
					 System.out.println("File not found");
						//e.printStackTrace();
					}
					
				}
					
			
			
		}
		}




