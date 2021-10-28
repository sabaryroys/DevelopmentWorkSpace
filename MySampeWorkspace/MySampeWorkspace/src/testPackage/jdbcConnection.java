package src.testPackage;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;



public class jdbcConnection {
	private String filePath = "C:\\Users\\Sabari Roy\\Desktop\\files\\";
	private String fileName = "loc_nbr.txt";
	
	
		public void callJdbcCon()
		{
			try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sc_dev","root","tiger");
			Statement smt = con.createStatement();
			//smt.execute("insert into sc_dev.fct_target_dtl values(104,'NEW JERSY','Y',157982,157980,157890)");
			System.out.println("Connected to db successfully");
			ResultSet rs = smt.executeQuery("select loc_nbr from sc_dev.fct_target_dtl");
			createFile();
			
			while(rs.next())
			{
			Integer loc_nbr;
			loc_nbr = rs.getInt(1);		
			writeFile(loc_nbr);
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
		private void writeFile(Integer loc_nbr)
		{
			try {
			Writer writer = new BufferedWriter(new FileWriter(filePath+fileName,true));
				//FileWriter writerObj = new FileWriter(filePath+fileName);
						if(fileEmptyCheck())
			{
				writer.write("LOC_NBR"+"\r\n");
			}
			{
			writer.append(loc_nbr.toString()+" \r\n");
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
		}




