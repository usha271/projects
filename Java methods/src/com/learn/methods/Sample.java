package com.learn.methods;

public class Sample {
	public void display(){
		
	System.out.println("welcome to java..");
	}
	
	public int add(int a,int b)
	{
		int num1=a+b;
		int num2=a*b;
		return num1+num2;
	}
	public boolean valid(int age)
	{
		if (age>18)
			return true;
		else 
			return false;
	}
	public String fullName(String fname,String lname)
	{
		return fname+" "+lname;
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		s.display();
		int result=s.add(2, 4);
		System.out.println("result"+result);
		System.out.println(s.valid(67));
		System.out.println("my full name is "+s.fullName("usha","sri"));
	}

}
