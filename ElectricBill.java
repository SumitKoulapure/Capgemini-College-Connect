package com.edubridge.lab5;

import java.util.Scanner;

class Bill{
	String n;
	int units;
	double bill;
	
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		n=sc.nextLine();
		System.out.println("Enter the units consumed:");
		units=sc.nextInt();
		
		
	}
	
	void calculate() {
		if(units<=100) {
			bill=units*2;
		}else if(units<=300) {
			bill=200+((units-100)*3);
		}else {
			double amount=200+600+((units-300)*5);
			double surchcharge=(amount*2.5)/100;
			bill=amount+surchcharge;
		}
		
		
		
	}
	void print() {
		System.out.println("Name of the customer:"+n);
		System.out.println("Number of units consumed:"+units);
		System.out.println("Bill amount:"+bill);
		
	}
}

public class ElectricBill {

	public static void main(String[] args) {
		Bill bill=new Bill();
		
		bill.accept();
		bill.calculate();
		bill.print();
		
	

	}

}
