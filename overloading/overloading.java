//Write a program by using method overloadind 
//Calculate ACir Arec Acyl ASqu ATri
package Polymorphism;

import java.util.Scanner;

public class overloading {
  //gobally declared variable.....
	static int r,l,b,h,side;
  static double pie=3.14,x,y;
  static Scanner sc=new Scanner(System.in);

  public static void  Area ( int r,double pie,double Acir) {//
	  System.out.println("calculate the area of circle=2*pie*radius");
	  System.out.print("Enter the value of radius :");//get value from user
	  r=sc.nextInt();
	 
	  //calculate the area of circle......
	  Acir= (2*pie*r);
	  System.out.println("The area of circle is :"+Acir);  
	  System.out.println();
	  
  }
  
  public static void Area(int l,int b,int Arec) {
	  System.out.println("calculate the area of rectangle=l*b");
	  System.out.print("Enter the value of length:");//get value from user
	  l=sc.nextInt();
	  System.out.print("Enter the value of Breadth:");//get value from user
	  b=sc.nextInt();
	  
	  //calculate the area of rectangle......
	  Arec=l*b;
	  System.out.println("The area of rectanle is :"+Arec);
	  System.out.println();
  }  
  public static void Area(double pie,int r,int h,double Acyl ) {
	  System.out.println("calculate the area of cylinder=2*pie*radius*height");
	  System.out.print("Enter the value of Height:");//get value from user
	  h=sc.nextInt();
	  System.out.print("Enter the value of radius :");//get value from user
	  r=sc.nextInt();

	  //calculate the area of cylinder......
	  Acyl=2*pie*r*h; //2*pie*r*h
	  System.out.println("The area of cylindr is :"+Acyl);
	  System.out.println();
  }
  public static void Area( int side,int Asqu) {
	  System.out.println("calculate the area of square=side*side");
	  System.out.print("Enter the value of side:");//get value from user
	  side=sc.nextInt();
	  
	  //calculate the area of square......
	  Asqu=side*side;
	  System.out.println("The area of square is :"+Asqu);
	  System.out.println();
  }
  public static void Area(double x,double y,double Atri) {
	  System.out.println("calculate the area of Triangle = 1/2(b*h) ");// let x=breadth ,y=height
	  System.out.println("Enter decimal values");
	  System.out.print("Enter the value of breadth: ");//get value from user
	  x=sc.nextDouble();
	  System.out.print("Enter the value of height: ");//get value from user
	  y=sc.nextDouble();
	  
	  //calculate the area of triangle......
	  Atri=(x*y)/2;
	  System.out.println("The area of triangle is :"+Atri);
	  System.out.println();
  }
  public static void main(String agrs[]) {
	  overloading obj=new overloading ();//crate object for calling the methods.....
       
       obj.Area(r, pie, r);
       obj.Area(l, b, r);
      obj.Area(pie, r, h, l);
       obj.Area(side, b);
       obj.Area(x, y, r);
      
       
       
	  
	  
  }
}
