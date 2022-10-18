/*
 * This program calculates the areas of the chosen shapes
 * Author: Bahadır
 * 
 */



import java.util.Scanner;

public class Geo {

	public static void Geo() {

		//Ask the user which shape they want to calculate the area of

		System.out.println(" This program calculates the areas of 2 dimentional shapes.");
		System.out.println(" For triangle, enter 1.\n For square, enter 2.\n For rectangle, enter 3.\n For parallelogram, enter 4.\n For trapezoid, enter 5.");

		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();

		if(choice == 1){
			//to calculate the area of a triangle, get the base and the height of it
			System.out.println("Please enter the base and height value of the triangle =>");
			System.out.print("Base => ");
			Scanner scan3 = new Scanner(System.in);
			float base = scan3.nextFloat();

			System.out.print("Height => ");
			Scanner scan4 = new Scanner(System.in);
			float height = scan4.nextFloat();
			//calculate the area of the triangle
			float triangleArea = ( base * height ) / 2;	

			//return the result to the user

			System.out.println("The area of the triangle is => " + triangleArea);

			//ask if the user wants to go again	

			System.out.println("To find another shapes area, enter '1' ");
			int reChoice = scan.nextInt();
			if(reChoice == 1)
			{
				Geo1(); 
			}
			
		}else if(choice == 2){
			System.out.println("Please enter the value of one side of the square.");

			//get the value of one of the side of the square 

			Scanner scan2 = new Scanner(System.in);
			float square = scan2.nextFloat();

			//to get the area , multiply the sides 

			float squareArea = square * square;

			//display the result to the user

			System.out.println("The area of the square is => " + squareArea);

			//ask if the user wants to go again	

			System.out.println("To find another shapes area, enter '1' ");
			int reChoice = scan.nextInt();
			if(reChoice == 1)
			{
				Geo1(); 
			}

		}else if(choice == 3){

			System.out.println("Please enter the value of the length and the width of the rectangle.");

			//to calculate the rectangle area , get the lenght and the width of the rectangle

			System.out.print("Length => ");
			Scanner scan5 = new Scanner(System.in);
			float length = scan5.nextFloat();

			System.out.print("Width => ");
			Scanner scan6 = new Scanner(System.in);
			float width = scan6.nextFloat();

			//multiply the length and width to get the area

			float rectangleArea = length * width ; 

			//display the result to the user

			System.out.println("The area of the square is => " + rectangleArea);

			//ask if the user wants to go again	

			System.out.println("To find another shapes area, enter '1' ");
			int reChoice = scan.nextInt();
			if(reChoice == 1)
			{
				Geo1(); 
			}


		}else if(choice == 4){

			System.out.println("Please enter the base and height value of the parallelogram =>");

			//to get the area of the parallelogram , get the base and height value of it

			System.out.print("Base => ");
			Scanner scan7 = new Scanner(System.in);
			float pBase = scan7.nextFloat();

			System.out.print("Height => ");
			Scanner scan8 = new Scanner(System.in);
			float pHeight = scan8.nextFloat();

			//multiply the base with the height to get the area

			float parallelogramArea = pBase * pHeight ;	

			//return the result to the user

			System.out.println("The area of the parallelogram is => " + parallelogramArea);

			//ask if the user wants to go again	

			System.out.println("To find another shapes area, enter '1' ");
			int reChoice = scan.nextInt();
			if(reChoice == 1)
			{
				Geo1(); 
			}

 		}else if(choice == 5){

			//to get the trapezoid area, promt the user to enter the bottom base top base and the height

			System.out.println("Please enter the bottom base, top base, and height value of the trapezoid =>");
			System.out.print("Top Base => ");
			Scanner scan9 = new Scanner(System.in);
			float topBase = scan9.nextFloat();

			System.out.print("Bottom Base => ");
			Scanner scan11 = new Scanner(System.in);
			float bottomBase = scan11.nextFloat();

			System.out.print("Height => ");
			Scanner scan10 = new Scanner(System.in);
			float tHeight = scan10.nextFloat();

			//add the bottombase to the top base and divide it by 2 and then multiply it with the height to get the trapezoid area

			float trapezoidArea = (( bottomBase + topBase ) / 2 )* tHeight ;	

			//return the result to the user

			System.out.println("The area of the trapezoid is => " + trapezoidArea);

			//ask if the user wants to go again	

			System.out.println("To find another shapes area, enter '1' ");
			int reChoice = scan.nextInt();
			if(reChoice == 1)
			{
				Geo1(); 
			}

		}

		 

		 



}

public static void Geo1() {
		Geo();
}

public static void main(String[] args){
	Geo1();
}




}