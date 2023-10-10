package com.edu;

import java.util.Scanner;

class Area{

	static Scanner sc = new Scanner(System.in);
	void circle() {
		System.out.println("Please enter radius of circle: ");
		double r = sc.nextDouble();
		double areaCircle = 3.14 * r * r;
		System.out.println("Area of circle is: " + areaCircle);
		
	}
	void square() {
		System.out.println("Please enter size of square: ");
		double size = sc.nextDouble();
		double areasquare = size * size;
		System.out.println("Area of ractangle is: " + areasquare);
		
		
	}
	void rectangle() {

		System.out.println("Please enter length and breadth of rectangle: ");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		double areaRectangle = l * b;
		System.out.println("Area of ractangle is: " + areaRectangle);
		
		
	}
	void triangle() {
		System.out.println("Please enter base and height of triangle: ");
		double b = sc.nextFloat();
		double h = sc.nextFloat();
		double areaTriangle = (b* h) / 2;
		System.out.println("Area of triangle is: " + areaTriangle);
		
		
	}
}

public class SwitchArea {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MENU:");
		System.out.println("1.Area of circle");
		System.out.println("2.Area of square");
		System.out.println("3.Area of rectangle");
		System.out.println("4.Area of triangle");
		System.out.println("Please enter any of the above option: ");
		int num = Area.sc.nextInt();
		
		Area a=new Area();
		switch(num)
		{
			case 1:
				a.circle();
			
			break;
			
			case 2:
				a.square();
			break;
			
			
			case 3:
				a.rectangle();
				break;
			
			case 4:
				a.triangle();
			break;
			
			default:System.out.println("invalid input");
			break;
		}
	

	}

}

