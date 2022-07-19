package Lesson1;

 class pubaccessspecifiers {

	public void display() 
    { 
        System.out.println("This is Public Access Specifiers- Access from different class "); 
    } 
}

public class AccessSpecifiers_public {

	public static void main(String[] args) {
		pubaccessspecifiers obj = new pubaccessspecifiers(); 
        obj.display();  
	}

}
