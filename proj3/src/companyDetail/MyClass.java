package companyDetail;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	{
		//Variable declaration
		Employee emp= new Employee();
		Employee emp1= new Employee();
		
		emp.readData();
		emp1.readData();
		emp.printData();
		
		emp1.printData();
		System.out.println(Employee.company);
		
		
		

	}

}
