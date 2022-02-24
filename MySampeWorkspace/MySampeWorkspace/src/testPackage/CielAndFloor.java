package src.testPackage;

import java.math.BigDecimal;

import java.math.RoundingMode;

import java.util.Scanner;

public class CielAndFloor {
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inputValue = sc.nextDouble();
		sc.close();
		cAf(inputValue);
		
  
	}
	
	public static Integer cAf(double inputValue)
	{ 	
		
		BigDecimal value = new BigDecimal(inputValue);
		BigDecimal ciel = value.setScale(0,RoundingMode.CEILING);
		BigDecimal floor = value.setScale(0,RoundingMode.FLOOR);
		
		System.out.println(ciel+" "+floor);
		return 0;
	}

}
