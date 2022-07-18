package proj4;
import java.util.Scanner;

public class factorialProj4 
{
	static int factorial(int n)
	{
		int i,fact=1;
		for(i=1; i<=n ;i++);
		fact=fact*i;
		return fact;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n=4;
		int n2=5;
		
		System.out.println(factorial(n));
		System.out.println(factorial(n2));

	}

}
