import java.util.Scanner;  //import scanner util to get input from user

class StandardizeMeasurements {  //create class

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter the temparature in fahrenheit => ");

		//get the temparature in the form of fahreneit from the user

		float fahreneit = myObj.nextFloat();

		//convert fahreneit to celcius using the formula

		float celcius = (fahreneit - 32)* 5 / 9;

		//print out the results

		System.out.println("  " + fahreneit + " fahrenheit in celcius is ==> " + celcius + "c");
	
		System.out.println("Please enter distance in feet, the machine will convert it to meters.");

		//get the distance in the form of feet from the user

		double feet = myObj.nextDouble();

		//convert feet to meters using the formula

		double meters = feet / 3.281;

		//print out the results
		
		System.out.println( "  " + feet + " feet in meters is ==> " + meters + "m");
	}
}