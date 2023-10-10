package com.edu.datatypes;

import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		int age;
		String name;
		float salary;
		char gen;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		name=sc.nextLine();
		
		System.out.println("Enter age");
		age=sc.nextInt();
		
		
		System.out.println("Enter Salary:");
		salary=sc.nextFloat();
		
		System.out.println("Enter gender (M/F):");
		gen=sc.next().charAt(0);
		
		System.out.println("Employee Details:");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Gender:"+gen);
		
		

	}

}
