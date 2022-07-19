package lesson2;
import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		
		
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Sam");    
	      hm.put(2,"Manu");    
	      hm.put(3,"Yoga");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet())
	      {    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	      //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Vaish");  
	      ht.put(5,"Suba");  
	      ht.put(6,"Jhon");  
	      ht.put(7,"Priya");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet())
	      {    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Dot");    
	      map.put(9,"Cat");    
	      map.put(10,"Goat");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet())
	      {    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}


	
	

