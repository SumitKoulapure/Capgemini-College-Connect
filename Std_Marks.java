package com.edu;

import java.util.Scanner;

class Grade{
	int marks;
	void inputMarks() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks");
		marks=sc.nextInt();
	}
	
	void displayGrade() {
		if(marks<0&& marks>100) {
			System.out.println("Invalid input");
			
		}else if(marks>=80&& marks<=100) {
			System.out.println("Grade A");
		}else if(marks>=60&& marks<=79) {
			System.out.println("Grade A");
		}else if(marks>=40&& marks<=59) {
			System.out.println("Grade A");
		}else if(marks>=0&& marks<=39) {
			System.out.println("Grade A");
		}else {
			System.out.println("Invalid input");
		}
	}

}


public class Std_Marks {
	
	public static void main(String[] args) {
		
		Grade g=new Grade();
		g.inputMarks();
		g.displayGrade();

	}

}
