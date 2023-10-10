package com.edubridge.lab5;


import java.util.Scanner;

class NegativePositive{
	int num;
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		num=sc.nextInt();
		
	}
	void displayResult() {
		if(num==0) {
			System.out.println("nether negative nor positive");
		}
		else { if(num>0) {
			System.out.println(num+"is positive");
		}else {
			System.out.println(num+"is negative");
		}
	}
}



public class LargestNo {
	public static void main(String[] args) {
		NegativePositive negativePositive=new NegativePositive();
		negativePositive.inputData();
		negativePositive.displayResult();

	}
}

}
