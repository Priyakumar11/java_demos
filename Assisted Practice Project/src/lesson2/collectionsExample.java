package lesson2;
import java.util.*;

 class collectionsExample {
	
	public static void main(String[] args)
	{
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> name=new ArrayList<String>();   
	      name.add("sam");//
	      name.add("siva");    	   
	      System.out.println(name);  
		
		
			//creating linkedlist
		      System.out.println("\n");
		      System.out.println("LinkedList\n");
		      LinkedList<String> names=new LinkedList<String>();  
		      names.add("Alpha");  
		      names.add("Gammaa");
		      names.add("Beta");
		      Iterator<String> itr=names.iterator();  
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		      }
		       //creating hashset
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> set=new HashSet<Integer>();  
		       set.add(1);  
		       set.add(3);  
		       set.add(2);
		       set.add(4);
		       System.out.println(set);


	}
 }
	
