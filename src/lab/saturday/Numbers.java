package lab.saturday;
/*
Calculates the arithmetic operations
SaturdayLab1: Data types. Variables. Constants.
Problem 3
Save file as Numbers.java  
-- arithmetic operations with int and double operands (i.e. variables)
 -- mixed addition
 -- integer division. double division. mixed division */

public class Numbers {


	
	public static void main(String[] args) {
		
		//declare variable of type int
		int iNumOne, iNumTwo, iResult;
		
		//declare variable  of type double 
		double dNumOne, dNumTwo, dResult;
		
		//assign/store
		iNumOne = 5;
		iNumTwo = 2;
		
		dNumOne = 10.0;
		dNumTwo = 11.5;
		
		//addition task
		iResult = iNumOne + (int) dNumOne;
		dResult = dNumTwo + iNumOne;
		
		System.out.println("int result :" + iResult);
		System.out.println("double result :" + dResult);
		
		//multiplication task

		iResult = (int) dNumOne * iNumTwo;
		dResult = iNumOne * dNumTwo;
		
		System.out.println("int result :" + iResult);
		System.out.println("double result :" + dResult);
		
		//devision task
		
		iResult = (int )dNumTwo / iNumTwo;
		dResult = dNumTwo / iNumOne;
		
		System.out.println("int result :" + iResult);
		System.out.println("double result :" + dResult);
		
		//substraction task
		
		iResult = (int) dNumTwo - (int) dNumOne;
		dResult = dNumTwo / iNumOne;
		
		System.out.println("int result :" + iResult);
		System.out.println("double result :" + dResult);
		
				
		
	}

}
