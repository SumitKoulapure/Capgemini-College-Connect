// instances variable default value 
//int 0, float 0.0, 
package com.edu.datatypes;

import java.util.Scanner;

class Student{
	int age;
	String name;
	// static variable ,class variable
	static String collegename="Sharad Institude of Technology";
	
	void inputStudentData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter age:");
		age=sc.nextInt();
	}
	void displayStudentData() { 		//this refer to present object 		
		/*System.out.println("Name = "+this.name);  //null 		
		 * System.out.println("Age = "+this.age);  //0 		
		 * System.out.println("College Name="+this.collegename); 		*/ 		 		
		System.out.println("Name = "+name);  //null 		
		System.out.println("Age = "+age);  //0 		
		System.out.println("College Name="+collegename); 	 	 
	}
}

public class StudentMainApp {
	public static void main(String[] args)
	{
		Student student1 = new Student(); //Object class constructor 	
		Student student2 = new Student(); 		
		student1.inputStudentData(); 		
		student2.inputStudentData(); 		
		String  n; //local 		 		
		student1.displayStudentData(); 		
		student2.displayStudentData(); 		 		
		
	}

}
