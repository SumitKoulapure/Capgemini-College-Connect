package com.edu.datatypes;

import java.util.Scanner;

class Product{
	
	int pid;
	String pname;
	float pprise;
	
	void inputProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Name the product:");
		pname=sc.nextLine();
		
		System.out.println("ID od product:");
		pid=sc.nextInt();
		
		System.out.println("prise of product:");
		pprise=sc.nextFloat();
		
	}
	void displayproduct() {
		System.out.println("Name="+this.pname);
		System.out.println("ID:"+this.pid);
		System.out.println("Price:"+this.pprise);
	}
}
public class MainProduct {

	public static void main(String[] args) {
		Product product1=new Product();
		Product product2=new Product();
		Product product3=new Product();
		Product product4=new Product();
		Product product5=new Product();
		
		product1.inputProduct();
		product2.inputProduct();
		product3.inputProduct();
		product4.inputProduct();
		product5.inputProduct();
		
		product1.displayproduct();
		product2.displayproduct();
		product3.displayproduct();
		product4.displayproduct();
		product5.displayproduct();

	}

}
