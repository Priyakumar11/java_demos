package lesson2;

public class methodOverloading {

	public void add(int b,int h)
    {
         System.out.println("Addition of two numbers : "+(b+h));
    }
    public void add(int r,int s,int t) 
    {
         System.out.println("Addition of three numbers : "+(r+s+t));
    }

    public static void main(String args[])
   {

    	methodOverloading ob=new methodOverloading();
       ob.add(10,10);
       ob.add(10,10,10);
   }
	
	
}
