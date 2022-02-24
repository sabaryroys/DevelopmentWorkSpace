package src.testPackage;

import java.util.Scanner;

public class FindingNemo {
	public Integer Nemo()
	{
		Integer pos = null;
			Integer n;
				System.out.println("Enter the number of words");
						Scanner sc = new Scanner(System.in);
							n = sc.nextInt();
							
						String[] nemo = new String[n + 1];
						
							for(int i = 0 ; i < nemo.length ;i++)
							{
								nemo[i] = sc.nextLine();
							
							}
						
							 for(int i = 0 ; i < nemo.length;i++)
						      	{
								 if(nemo[i].equals("Nemo"))
								 {
									 pos = i;
							
								 }
								
						      	}
							 
							 sc.close();
							 if(pos == null)
								 return 0;
							 else						 
		return pos;
		
	}

}
