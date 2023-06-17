package com.lpu.beans;
import java.util.Scanner;

public class ExeptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Num 1");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("Num 2");
		int b=sc.nextInt();
		
//		try {//any  bock of code where you think their might be an error
//			int res=a/b;
//			System.out.println("Result "+res);
//		}
//		catch(ArithmeticException ae) {
//			ae.printStackTrace();//show the error message
//			
//		}
//		finally {
//			System.out.println("OK Done!");
//			
//		}
		
		if(a<b) {
			ArithmeticException ae= new ArithmeticException("Insufficient money baby only you have Rs "+ a );
			throw ae;
		}
		int res = a-b;
		System.out.println("Money "+ res);
		

		
	}

}
