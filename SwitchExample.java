package com.edu;

import java.util.Scanner;

class Calculator{
double n1,n2,ans;
    static Scanner sc=new Scanner(System.in);
	
	void inputData() {
		System.out.println("Enter 2 number");
		n1=sc.nextDouble();
		n2=sc.nextDouble();
		
	}
	
	void addition() {
		ans=n1+n2;
		System.out.println("The sum of "+n1+" and "+n2+" is "+ans);
	}
	void subtraction() {
		ans=n1-n2;
		System.out.println("The diferences of "+n1+" and "+n2+" is "+ans);
	
    }
	void multiplication() {
		ans=n1*n2;
		System.out.println("The multiplication of "+n1+" and "+n2+" is "+ans);
	
     } 
	void division() {
		if (n2==0) {
			System.out.println(" the  number is does not divisible by 0");
		}
		else {
		ans=n1/n2;
		System.out.println("The division of "+n1+" and "+n2+" is "+ans);
	
}}}
public class SwitchExample {

	public static void main(String[] args) {
		System.out.println("*****My Menu*****");
		System.out.println("Enter your choice");
		System.out.println("1:for Addition");
		System.out.println("2:for subtraction");
		System.out.println("3: for multiplication");
		System.out.println("4:for division");
	     int choice =Calculator.sc.nextInt();	
	
		Calculator c=new Calculator();
		c.inputData();
		
		
		switch (choice) {
		case 1: {
			c.addition();
			break;
			
		}
		case 2: {
			c.subtraction();
			break;
			
		}
		case 3: {
			c.multiplication();
			break;
			
		}
		case 4: {
			c.division();
			break;
			
		}
		default:
			System.out.println("nvalid input");
			
		}
		
		
		
	}
		

	}


