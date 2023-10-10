package lab1.edu;
import java.util.Scanner;

public class Area_of_circle {

	    public static void main(String[] args) 
	    {
	        float r;
	        double pi = 3.14, area;
	        
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the radius of circle: ");
	        r = sc.nextFloat();
	        area = pi * r * r;
	        System.out.println("The area of the circle: "+area);
	        sc.close();
	    }            
	}


