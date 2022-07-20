//Write a program by using method overriding Calculate SI for saving account and current account
package Polymorphism;

import java.util.Scanner;

public class interest_overriding {
//declared variable...........
	double r,SI;
	int t,p;
	//create scanner......
	Scanner sc=new Scanner(System.in);
	//create method........
	public void accept() {
		// get the input from user...... 
		System.out.print("Enter the  principal amount:");
		p=sc.nextInt();
		System.out.print("Enter the rate of interest %:");
		r=sc.nextDouble();
		System.out.print("Enter the Time in years : ");
		t=sc.nextInt();
	}
	//create method for calculate the simple interest............
	public void Simple_Interest() {
		SI=(p*r*t)/100;
		System.out.println("formula of SI=P*R*T)/100");
		System.out.println("The Saving account of simple interest is :"+SI);
	}


}
