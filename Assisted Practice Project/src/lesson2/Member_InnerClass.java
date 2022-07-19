package lesson2;

public class Member_InnerClass {
 private String msg="Member Inner class"; 
	 
	 class Inner
	 {  
	  void hello()
	  {
		  System.out.println(msg+", class inside class outside method");
		  
	  }  
	 }  


	public static void main(String[] args) {

		Member_InnerClass obj=new Member_InnerClass();
		Member_InnerClass.Inner in=obj.new Inner();  
		in.hello();  
	}
}
