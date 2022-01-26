package com.learn.methods;

public class MethodOverload {
	 
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public float add(float a,float b)
	{
		return a+b;
	}
	public float add(float a,float b,float c)
	{
		return a+b+c;
	}
	public double add(double a,double b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		MethodOverload m=new MethodOverload();
		System.out.println("add 2 int "+m.add(3,4));
		System.out.println("add 3 int "+m.add(3, 4,6));
		System.out.println("add 2 float "+m.add(3.0f,4.0f));
		System.out.println("add 3 float "+m.add(3.0f,4.0f,6.0f));

	}

}
