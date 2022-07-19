package lesson2;

public class Local_InnerClass {

	private String msg="Local Inner Class";

	 void display()
	 {  
		 class Inner
		 {  
			 void msg()
			 {
				 System.out.println(msg+", Class inside class inside a method");
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		Local_InnerClass ob=new Local_InnerClass ();  
		ob.display();  
		}
	
}
