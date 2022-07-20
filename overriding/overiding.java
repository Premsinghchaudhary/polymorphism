package Polymorphism;

public class overiding extends interest_overriding{// use the inheritance properties..
 //calculate the simple interest for current account...
	public void Simple_Interest() 
	 {
		SI=(p*r*t)/100;
		System.out.println("formula of SI=P*R*T)/100");
		System.out.println("The Current account of simple interest is :"+SI);
		
	 } 
	//create the main method for calling the methods.....
	public static void main(String agrs[])
	{
		 overiding obj=new overiding();
		 obj.accept();
		 obj.Simple_Interest();
		 System.out.println();//use for space......
		 interest_overriding obj1=new overiding();//create object for interest_overriding class beacuse call the method of pervious class...
		obj1.accept();
		 obj1.Simple_Interest();
		 
	 }
}
