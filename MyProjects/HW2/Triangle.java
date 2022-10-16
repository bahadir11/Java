/*
 * This project prompts the user to enter 3 sides of a triangle, and determines whether it is one or not.
 * Author : Bahadır
 */


import java.util.Scanner;

public class Triangle {

	public static void Triangle(){

		System.out.println("Please enter the values of the three sides.");
			
		Scanner scan = new Scanner(System.in);

		//Prompt the user to enter the 3 values

		float side1 = scan.nextFloat();
		float side2 = scan.nextFloat();
		float side3 = scan.nextFloat();

		//Determine if the three sides add up to be lower than the third or
		//if the two sides subtracted are more than the trird it is not a triangle

		if(side1 + side2 > side3 && Math.abs(side1 - side2) < side3)
		{
				if(side2 + side3 > side1 && Math.abs(side2 - side3) < side1)
				{
					if(side1 + side3 > side2 && Math.abs(side1 - side3) < side2)
					{
			
						System.out.println("This is a triangle!!!");

						//If the user wants to try again, he enters 1
						System.out.println("To try again, enter '1'");
			
						Scanner scan2 = new Scanner(System.in);
						int choice = scan2.nextInt();
						if(choice == 1)
						{
							//call the triangle function
  							Triangle1();
						}


					}else{
						//Tell the user that the entered values does not form a triangle
						System.out.println("Sorry, not a triangle :(");
						//If the user wants to try again, he enters 1

						System.out.println("To try again, enter '1'");
			
						Scanner scan2 = new Scanner(System.in);
						int choice = scan2.nextInt();
						if(choice == 1){

							//call the triangle function
							
  							Triangle1();
						}

					}



				}else{
						//Tell the user that the entered values does not form a triangle

						System.out.println("Sorry, not a triangle :(");
						//If the user wants to try again, he enters 1

						System.out.println("To try again, enter '1'");
			
						Scanner scan2 = new Scanner(System.in);
						int choice = scan2.nextInt();
						if(choice == 1){
							//call the triangle function
  							Triangle1();
						}


				}



		}else{
			//Tell the user that the entered values does not form a triangle

			System.out.println("Sorry, not a triangle :(");
			//If the user wants to try again, he enters 1

			System.out.println("To try again, enter '1'");
			
			Scanner scan2 = new Scanner(System.in);
			int choice = scan2.nextInt();
			if(choice == 1){
				//call the triangle function

  				Triangle1();
			}
		}




}
 
//To call the method within eachother

public static void Triangle1(){

	Triangle();

}
public static void main(String[] args){

	Triangle();

}

}