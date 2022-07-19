package lesson2;

public class CallbyValue {
	int val=150;

	int func(int val) {
		val =val*10/100;
		return(val);
	}

	public static void main(String args[]) {
		CallbyValue d = new CallbyValue();
		System.out.println("Before calling function - value of data is "+d.val);
		d.func(100);
		System.out.println("After calling function -  value of data is "+d.val);
		System.out.println("Function won't affect the actual value");
		}

	
}
