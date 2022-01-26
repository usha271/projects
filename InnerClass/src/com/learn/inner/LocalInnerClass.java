package com.learn.inner;

public class LocalInnerClass {
	void validate(int age)
	{
		if(age>=18)
		{
			class Inner{
				void test() {
					System.out.println("Now authenticate user using aadhar");
				}
			}
			Inner inner=new Inner();
			inner.test();
		}
		else {
			System.out.println("No need to authenticate");
		}
	}
	public static void main(String[] args) {
		LocalInnerClass local=new LocalInnerClass();
		local
	}

}
