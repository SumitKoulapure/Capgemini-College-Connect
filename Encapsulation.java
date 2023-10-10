package com.edu.datatypes;

import java.util.Scanner;

class Employee{
	//variables declare in class is called instances variables
	String name;
	int age;
	float salary;
	char gen;
	
	void inputData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		name=sc.nextLine();
		
		System.out.println("Enter age");
		age=sc.nextInt();
		
		
		System.out.println("Enter Salary:");
		salary=sc.nextFloat();
		
		System.out.println("Enter gender (M/F):");
		gen=sc.next().charAt(0);
		
		
	}
	void displayData() {
		System.out.println("Employee Details:");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Gender:"+gen);
		
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		System.out.println("main Method");
		//create and object
		Employee employee=new Employee();
		
		employee.inputData();//call the method
		employee.displayData();
		
		
		

	}

}
