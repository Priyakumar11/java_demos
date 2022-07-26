package lesson3;
class PolymorphismExample
{
    public int PolymorphismExample(int x, int y) 
    { 
        return (x + y); 
    } 
    public int PolymorphismExample(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double PolymorphismExample(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
    	PolymorphismExample s = new PolymorphismExample(); 
        System.out.println(s.PolymorphismExample(10, 20)); 
        System.out.println(s.PolymorphismExample(10, 20, 30)); 
        System.out.println(s.PolymorphismExample(10.5, 20.5)); 
    } 
}
