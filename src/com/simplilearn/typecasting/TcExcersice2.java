package com.simplilearn.typecasting;

import java.util.Scanner;

public class TcExcersice2 {

	public static void main(String[] args) {
		//Take input as String
				Scanner input = new Scanner(System.in);
				String inputString = input.nextLine();
				int inputInt = Integer.parseInt(inputString);
				float inputFloat = Float.parseFloat(inputString);
				double inputDouble = Double.parseDouble(inputString);
				byte inputByte = Byte.parseByte(inputString);
				
				System.out.println("Integer value is:"+inputInt);
				System.out.println("Float value is:"+inputFloat);
				System.out.println("Double value is:"+inputDouble);
				System.out.println("Byte value is:"+inputByte);

	}

}
