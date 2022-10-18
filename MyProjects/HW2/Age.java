/*
 * This program calculates at which age the famous person has said the quote
 * Author: Bahadır
 */

import java.util.Scanner;

public class Age {

	public static void main(String[] args){

		System.out.println("Please enter the name and surname of a famous person.");
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		Scanner scan4 = new Scanner(System.in);

		//Prompt the user to enter the name and surname of the famous person

		String name = scan.nextLine();
		System.out.println("Please enter the birth year of the famous person.");
		//Prompt the user to enter the birthyear of the famous person
		int birthYear = scan2.nextInt();
		System.out.println("Please enter a quote of this famous person.");
		//Prompt the user to enter a quote of this famous person
		String quote = scan3.nextLine();
		System.out.println("Please enter the year of the quote.");
		//Prompt the user to enter the year that the quote is said
		int quoteYear = scan4.nextInt();
		//Calculate at which age the famous person made the quote
		int age = quoteYear - birthYear;
		//Merge the name, surname and the quote with the new found age the famous person said
		System.out.println(name + " said: \"" + quote + "\" when he was " + age + " years old.");
		
		


}
}