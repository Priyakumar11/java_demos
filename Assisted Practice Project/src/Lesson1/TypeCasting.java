package Lesson1;

public class TypeCasting {

	public static void main(String[] args) {
		
		//Implicit conversion
		System.out.println("Implicit Type Casting");
		char x='A';
		System.out.println("Value of a: "+x);
		
		int y=x;
		System.out.println("Convering character into integer - Value of b: "+y);
		
		float c=x;
		System.out.println("Converting integer into float - Value of c: "+c);
		
		long d=x;
		System.out.println("Converting float into double - Value of d: "+d);
		
		double e=x;
		System.out.println("Value of e: "+e);
		
		
		//explicit conversion
		System.out.println("\nExplicit Type Casting");
		
		
		double a=45.5;
		int b=(int)a;
		System.out.println("Value of a: "+a);
		System.out.println("Conerting double into integer - Value of b: "+b);
		
		
	}

}
