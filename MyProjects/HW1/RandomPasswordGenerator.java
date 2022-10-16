import java.util.Random; //importing the random util to get random numbers and characters

class RandomPasswordGenerator {

	public static void main(String[] args) { //create the main class

		//create the random number

		int randomNumber1 = (int)(Math.random()* 10);

		//convert the random number to string

		String rN1 = Integer.toString(randomNumber1);

		//to initialize the password, add an empty string

		String empty1 = "";	

		//create random lowercase letters using the random util

		Random randomChar = new Random();
		char char1 = (char)(randomChar.nextInt(26) + 'a');	
		char char2 = (char)(randomChar.nextInt(26) + 'a');

 		//create random uppercase letters using the random util

		char char3 = (char)(randomChar.nextInt(26) + 'A');	
		char char4 = (char)(randomChar.nextInt(26) + 'A');
		char char5 = (char)(randomChar.nextInt(26) + 'A');
		char char6 = (char)(randomChar.nextInt(26) + 'A');
	
		//connect the parts to get the password

		String password = (empty1 + char1 + char2 + rN1 + char3 + char4 + char5 + char6);

		System.out.print("Here is the new password ==>  ");

       // print out the password

		System.out.print(password);

		}
}
