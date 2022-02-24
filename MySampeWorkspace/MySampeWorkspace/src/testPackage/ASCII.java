package src.testPackage;

import java.util.Scanner;

public class ASCII {
	public static char ascii;
	public static Integer value;

	public static void main(String[] args) {
		asciiFunction();

	}
	public static Integer asciiFunction() {
		Scanner sc = new Scanner(System.in);
		ascii = sc.next().charAt(0);
		sc.close();
		value = (int) ascii;
		if(value >= 65 && value <= 122)
		{
		System.out.println(value);
		
		}
		else
		{
			System.out.println("Out of limits");
		}
		
		return value;
	}

}
