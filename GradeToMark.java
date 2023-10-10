package com.edu;

import java.util.Scanner;

public class GradeToMark {
	
	char grade;
	
	public void inputGrade() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Grade(A,B,C,F):");
		grade=sc.next().toUpperCase().charAt(0);
	}
  public void displayMarks() {
    	if(grade=='A') {
    		System.out.println("Marks is 80 to 100");
    	}else if(grade=='B') {
    		System.out.println("Marks is 60 to 79");
    	}else if(grade=='C') {
    		System.out.println("Marks is 40 to 59");
    	}else if(grade=='F') {
    		System.out.println("Marks is 0 to 39");
    	}else {
    		System.out.println("invalid input");
    	}
    }
	public static void main(String[] args) {
		GradeToMark g=new GradeToMark();
		g.inputGrade();
		g.displayMarks();
		
	}

}
