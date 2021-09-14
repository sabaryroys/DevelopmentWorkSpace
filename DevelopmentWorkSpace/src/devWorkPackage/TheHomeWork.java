package devWorkPackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class TheHomeWork {
	String temp="";
	String input = "";
	String[] result;
	int i=0;
	void homework()
	{
		
		
//		System.out.println("Enter the number of testcases");
//		Scanner sc1 = new Scanner(System.in);
//		Integer tcs = sc1.nextInt();
//		int j=1;
//		while(j<=tcs)
//		{
			Scanner sc = new Scanner(System.in);
//			System.out.println("TestCase #"+ j);
							System.out.println("Enter the number of digits in spaces:");
							   	 input = sc.nextLine();
							   ///	j++;
							   		
							   		
						   					
			List<Integer>  array = new ArrayList<Integer>(); // for finding the highest number that can be formed 
			
		 result = input.split(" ");
		
		for( i =0;i<result.length;i++)
		{
			array.add(Integer.parseInt(result[i]));
		}
		
		
					Collections.sort(array,Collections.reverseOrder());
					
				for(Integer list:array)
				{
					temp = temp+ list.toString();
				}
				sc.close();
					
					
		
		System.out.println(temp);
		reset();
	}
	int reset()
	{
		 temp = "";
		 input = "";
		 i = 0;
		
		return 0;
	}
	
	

}
