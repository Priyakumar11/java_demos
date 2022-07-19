package Lesson1;

class privateaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
   
   
} 

public class AccessSpecifiers_private {

	public static void main(String[] args) {
		
		System.out.println("Private Access Specifier - Calling from different class cant't access");
		privateaccessspecifier  obj = new privateaccessspecifier(); 
		
		//obj.display();
	}

}
