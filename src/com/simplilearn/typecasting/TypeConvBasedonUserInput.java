package com.simplilearn.typecasting;
import java.util.Scanner;

public class TypeConvBasedonUserInput {

	public static void main(String[] args) {
		// Take input from user
		Scanner userIn = new Scanner(System.in);
		String userSt = userIn.nextLine();
		int userInt = Integer.parseInt(userSt);
		double userDouble = Double.parseDouble(userSt);
		long userLong = Long.parseLong(userSt);
		System.out.println("Integer value Is:"+userInt);
		System.out.println("double value Is:"+userDouble);
		System.out.println("Long value Is:"+userLong);
		
		
		
	}

}
