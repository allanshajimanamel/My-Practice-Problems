package mytest.inheritance.pkg2;

import mytest.inheritance.pkg1.BaseClass;

public class ChildClass extends BaseClass{
	int defaultVal;
	public int publicVal;
	private int privateVal;
	protected int protectedVal;
	int val = 8;

	ChildClass(int a, int b, int c, int d){
		super(a,b,c,d);
		this.defaultVal = a;
		this.publicVal = b;
		this.privateVal = c;
		this.protectedVal = d;
	}

	void methodA(){
		System.out.println(" child method A with values"+defaultVal+" "+publicVal+" "+privateVal+" "+protectedVal);
	}

	@Override
	public void methodB(){
		System.out.println(" child method B with values"+defaultVal+" "+publicVal+" "+privateVal+" "+protectedVal);
		System.out.println(val);
	}

	private void methodC(){
		System.out.println(" child method C with values"+defaultVal+" "+publicVal+" "+privateVal+" "+protectedVal);
	}

	@Override
	protected void methodD(){
		System.out.println(" child method D with values"+defaultVal+" "+publicVal+" "+privateVal+" "+protectedVal);
	}
}
