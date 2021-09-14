package devWorkPackage;
import java.util.Scanner;

public class TextEditor {
	String retValue ="";
	
	void textEditor()
	{
		Scanner sc = new Scanner(System.in);
		Integer inputCount;
		System.out.println("Enter the number of words:");
		inputCount=sc.nextInt();
		String[] words = new String[inputCount+1];
		System.out.println("Enter the words to be converted to uppercase");
		for(int i=0;i<=inputCount;i++)
		{
			words[i] = sc.nextLine();	 
				
		}
			for(int i=0;i<=words.length - 1;i++)
			{
				retValue = words[i];
				
				System.out.println(retValue.toUpperCase());
			}
		sc.close();
		
	}
		
}
