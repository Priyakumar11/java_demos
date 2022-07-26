package lesson3;

public class TryCatchExample {

	public static void main(String[] args) {
		int i = 7, j=0;
        try 
        {
           int y=i/j;
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Integer can not be divide by zero"); 
        }
        finally 
        {
        	   System.out.println("Give different eqaution " );
        }
	}
		
	}


