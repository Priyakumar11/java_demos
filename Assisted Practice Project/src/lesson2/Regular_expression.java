package lesson2;
import java.util.regex.*;
public class Regular_expression 
{
	public static void main(String[] args) 
	{

		String pattern = "[a-z]+";
		String check = " Welcome Java";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
	}
		
}
