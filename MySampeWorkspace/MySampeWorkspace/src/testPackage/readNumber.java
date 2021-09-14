package testPackage;

import java.util.Scanner;

public class readNumber
{
	
	String tmp,input;
	Integer digits,count;
	
	void calculateWord()
	{
		System.out.println("Enter the sentence");
		Scanner sc = new Scanner(System.in);
		{
		input=sc.nextLine();
		sc.close();
		}
		String[]  words = input.split(" ");
			
			for(int i=0; i<words.length;i++)
			{
				tmp = words[i].toString();
				int temp = tmp.length();
				for(int j=0;j<temp;j++)
				if(Character.isDigit(tmp.charAt(j)))
				{
					System.out.print(tmp.charAt(j)+" ");
				}
			
				
			}
			
	}
}
