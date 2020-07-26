package com.simplilearn.typecasting;
import java.util.Scanner;

public class TcExcersice1 {

	public static void main(String[] args) {
		//Take input as String
		Scanner input = new Scanner(System.in);
		int inputInt = input.nextInt();
		float inputFloat = inputInt;
		double inputDouble = inputFloat;
		byte inputByte = (byte) inputInt;
		
		System.out.println("Float value is:"+inputFloat);
		System.out.println("Double value is:"+inputDouble);
		System.out.println("Byte value is:"+inputByte);
		
		

	}

}
