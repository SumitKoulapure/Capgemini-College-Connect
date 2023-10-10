package com.increament;



import java.util.Scanner;

public class LargestTernary {

	public static void main(String[] args) {
		int n1,n2, n3,l,n4;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 4 numbers");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		
		//l = (n1>n2) ?n1:n2;
		//l=(n1>n2 && n1>n3)?n1: (n2>n1 && n2>n3)?n2: n3; 
		l=(n1>n2 && n1>n3 && n1>n4)?n1: (n2>n3 && n2>n4)?n2: (n3>n4)?n3: n4;
		System.out.println("The largest of "+n1+ ","+n2+" and "+n3+ " is "+l);
		

	}

}