package package1;

public class Mypackage1BaseClass {
	public int a;
	private int b;
	protected int c;
	int d;
	public void myPackage1BaseClassMethod()
	{
		a=5;
		b=10;
		c=11;
		d=12;
	}
	}

class MyPackage1DerivedClass extends Mypackage1BaseClass
{
	public void myPackage1DerivedClassMethod()
	{
		a=5;
		b=10;
		c=11;
		d=12;
	}
}

class MyPackage1OtherClass
{
	public void myPackage1OtherClassMethod()
	{
		Mypackage1BaseClass obj=new Mypackage1BaseClass();
		obj.a=5;
		obj.b=10;
		obj.c=11;
		obj.d=12;
	}
	
	
}