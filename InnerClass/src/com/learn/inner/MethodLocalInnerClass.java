package com.learn.inner;

public class MethodLocalInnerClass {
	public void diplay()
	{
		class Inner
		{
			void myMethod()
			{
				System.out.println("Method from InnerClass");
			}
		}
		Inner inner=new Inner();
		inner.myMethod();
	}
	public static void main(String[] args) {
		RegularInnerClass outer=new RegularInnerClass();
	}

}
