package com;

public class VariableNoOfArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sumOfNumbers(0,12,32,45);
		sumOfNumbers(0,12,23,34,45);
		sumOfNumbers(0);
		sumOfNumbers(12.5f,37.2f);
	}
	
	// variable no of argument method is used to avoid overloading with same type variables
	// Var-arg value should be last in arguments
	// only one var-arg parameter is allowed
	
	public static void sumOfNumbers(int sum,int...  x) //3 dots only should be there 
	{
		 
		
		for(int y:x)
		{
			sum=sum+y;
		
		}
		System.out.println("Sum of Numbers is:"+sum);
	}
	
	public static void sumOfNumbers(float...  x)
	{
		float sum=0;
		
		for(float y:x)
		{
			sum=sum+y;
		
		}
		System.out.println("Sum of Numbers is:"+sum);
	}

}
