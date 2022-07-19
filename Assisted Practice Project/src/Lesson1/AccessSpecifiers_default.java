package Lesson1;


class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("Example of defalut access specifier - -Calling from differnt class of same package"); 
     } 
} 



public class AccessSpecifiers_default {

	public static void main(String[] args) {
		
		System.out.println("Default Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		
		 obj.display(); 
		
	}

}
