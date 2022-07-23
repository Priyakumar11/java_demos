package lesson2;

import java.util.ArrayList; 
import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		String search;

		ArrayList<String> email_ID = new ArrayList<String>();

		Scanner input = new Scanner(System.in);

		email_ID.add("priya@gmail.com");
		email_ID.add("yoga@gmail.com");
		email_ID.add("sam@yahoo.com");
		email_ID.add("varun@yahoo.com");
		email_ID.add("john@gmail.com");
		email_ID.add("suba@yahoo.com");

		System.out.println("Enter the emailID to be search");
		search = input.nextLine();

		if (email_ID.contains(search)) {
			System.out.println("email ID " + search + " found");
		} else {
			System.out.println("email ID " + search + " not found");
		}

	}

}
