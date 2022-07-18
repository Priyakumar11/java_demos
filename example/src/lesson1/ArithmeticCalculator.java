package lesson1;
import java.util.Scanner;

final class Calculator {
	
	 double a,b;
	static double result = 0.0;
	 Calculator (double a1, double b1)
	{
		this.a=a1;
		this.b=b1;
	}
	public double func( int operator)
	{
		switch (operator)
		{
		
		
	 case 1 :
	        result = a + b; break;
	 case 2:
	        result = a - b; break;
     case 3:
	        result = a * b;break;
     case 4:
	        result = a / b; break;
	 default:
	          System.out.println("Invalid operator!");
	           break;
		}
		return result;
	}
	
}
public class ArithmeticCalculator {

	public static void main(String[] args) {
		
	
	int a,b,c;
	double answer;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number ");
		a= input.nextInt();
		System.out.println("Enter second number ");
		b= input.nextInt();
  Calculator obj = new Calculator (a,b);
  System.out.println("Enter the number for the operation to be done\n1)add 2) sub 3) multilpy 4)division \n");
	
  c=input.nextInt();
  answer = obj.func(c);
  System.out.println("The final answer\n " + answer);
	}
	

}
