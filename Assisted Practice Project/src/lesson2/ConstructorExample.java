package lesson2;
	class Std{
		int id;
		String name;

		Std (int i,String n)
		{
		this.id=i;
		this.name=n;
		}

		void display() {
		System.out.println(id+" "+name);
		}
	}
	public class ConstructorExample {
	
	public static void main(String[] args) {

		int a=5,b=10;
		
		Std obj= new Std(a,"priya");
		Std obj2= new Std(b,"sam");
		

		obj2.display();
		obj.display();
			}
	}


