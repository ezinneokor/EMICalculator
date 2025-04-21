package day4;

import java.util.Scanner;

public class EMICalculator {

	public static void main(String[] args) {
//		 EMI = P * r * (1 + r)^n / ((1 + r)^n - 1)
//		where P is the principal loan amount, r is the monthly interest 
//		rate (annual rate divided by 12), and n is the loan tenure in months. 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your loan amount in USD");
		double principal = scanner.nextDouble();
		
		System.out.println("Enter anual interest rate (in %)");
		double annualInterestRate= scanner.nextDouble();
		
		double monthlyInterestRate = annualInterestRate/(12*100);
		
		System.out.println("Enter loan tenure in years");
		int tenureYear = scanner.nextInt();
		int tenureMonth = tenureYear *12;
		
//		 EMI = P * r * (1 + r)^n / ((1 + r)^n - 1)
		double emi = (principal*monthlyInterestRate*Math.pow(1 + monthlyInterestRate, tenureMonth))
				     /(Math.pow(1+ monthlyInterestRate, tenureMonth) - 1);
		
		System.out.println("Your monthly EMI is : " + emi);

	}

}
