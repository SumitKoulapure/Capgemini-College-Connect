package com.edu;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		
		int m=n%2;
		
		switch(m) {
		case 0:
			System.out.println("The "+n+" is Even");
			break;
		case 1:
			System.out.println("the "+n+" is odd");
			break;
		default:
			System.out.println("Invalid input");
			
		}
		

	}

}
