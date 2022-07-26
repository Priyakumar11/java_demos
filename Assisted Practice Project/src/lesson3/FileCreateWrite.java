package lesson3;

import java.io.*;

public class FileCreateWrite
{

	public static void main(String[] args)
	{
		File file = new File("C:\\javafsd\\java_demos\\FileHandling1.txt");
		boolean result;
		try {
			result = file.createNewFile();
			if (result) 
			{
				System.out.println("file created " + file.getCanonicalPath());
			} else 
			{
				System.out.println("File already exist at location: " + file.getCanonicalPath());
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		try
		{
			FileWriter fw = new FileWriter("C:\\javafsd\\java_demos\\FileHandling1.txt");
			fw.write("Welcome to File Handlig Practice Project.");
			fw.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Done");
	}

}
