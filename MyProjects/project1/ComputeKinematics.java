import java.util.Scanner;  //import the scanner util

class ComputeKinematics { // create computekinematics class
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter the initial velocity of the object ==> ");
		float initialV = myObj.nextFloat(); //get the input from the user
		double hMax = initialV / (2 * 9.81); // calculate the max height from the formula
		double time = 2*(initialV / 9.81); // calculate the total time from the formula
		//print out the results 
		System.out.println("Dear sister, no need to worry.");
		System.out.println("The max height is ==> " + hMax );
		System.out.println("The duration is ==> " + time);
	}
}