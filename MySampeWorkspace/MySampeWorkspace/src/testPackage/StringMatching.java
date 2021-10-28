package src.testPackage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatching {
	Scanner sc = new Scanner(System.in);
	String[] arr = new String[20];

	
	public void stringMatch()
	{
		Integer tc;
		Integer pos = 0;
		String temp1,temp2;
		
		List<String> str = new ArrayList<String>();
		List<String> strsrch = new ArrayList<String>();
		System.out.println("Enter the number of string for input : ");
		tc = sc.nextInt();
		System.out.println("Enter the tc string and the string to be matched seperated by whitespace: ");
		for(int i = 0;i <= tc; i++)
		{
			String input = sc.nextLine();
			 arr = input.split(" ");
			 System.out.println(arr[0]);
			 
			 			
		}
//		for(String st : str)
//		{
//			System.out.println(st);
//		}
//		for(String st2 : strsrch)
//		{
//			System.out.println(st2);
//		}
		
		
		
	
		
	//System.out.println(strsrch.get(pos));
	//	System.out.println(str.get(pos));
//			for(String s:str)
//			{
//			Integer res = s.indexOf(strsrch.get(pos));
//				if(res == -1)
//				{
//					System.out.println("No");
//				}
//				else
//				{
//					System.out.println("Yes");
//				}
//				pos++;
//			}
	}

}
