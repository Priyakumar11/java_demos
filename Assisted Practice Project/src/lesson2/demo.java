package lesson2;

 class methoddemo {

public int addnumbers(int a,int b) {
	int z=a+b;
	return z;
}
}


public class demo {

	public static void main(String[] args) {
		
		methoddemo b=new methoddemo();
		int ans= b.addnumbers(7,3);
		System.out.println("Addition is : "+ans);

	}

}
