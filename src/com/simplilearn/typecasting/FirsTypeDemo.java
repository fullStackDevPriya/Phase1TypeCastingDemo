package com.simplilearn.typecasting;

public class FirsTypeDemo {

	public static void main(String[] args) {
	  //widening and implicity type casting 
		int count = 109;
		long countBig = count;
		float countFloat = countBig;
		double conutD = countFloat;
		
		System.out.println("int Value:"+count);
		System.out.println("long Value:"+countBig);
		System.out.println("int Value:"+countFloat);

	}
}
