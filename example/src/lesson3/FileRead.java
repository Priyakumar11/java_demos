package lesson3;

import java.io.*;
import java.util.*;

class FileRead {
	public static void main(String[] args) {
		try {

			File f1 = new File("C:\\javafsd\\java_demos\\FileHandling1.txt");
			Scanner dataReader = new Scanner(f1);
			while (dataReader.hasNextLine()) {
				String fileData = dataReader.nextLine();
				System.out.println(fileData);
			}
			dataReader.close();
		} catch (FileNotFoundException exception) {
			System.out.println("Unexcpected error occurred!");
			exception.printStackTrace();
		}
	}
}