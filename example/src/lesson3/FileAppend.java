package lesson3;

import java.io.*;


public class FileAppend {

	public static void main(String[] args) {
		modifyFile("C:\\javafsd\\java_demos\\FileHandling1.txt");
		System.out.println("done");
	}

	static void modifyFile(String filePath) {
		File fileToBeModified = new File(filePath);
		FileWriter writer = null;
		try {
			writer = new FileWriter(fileToBeModified);
			writer.write("Welcomee");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
