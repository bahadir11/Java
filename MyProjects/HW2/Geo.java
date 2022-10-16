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

			System.out.println("The area of the triangle is => " + triangleArea);	

			System.out.println("To find another shapes area, enter '1' ");
			int reChoice = scan.nextInt();
			if(reChoice == 1)
			{
				Geo1(); 
			}
			
		}else if(choice == 2){
			System.out.println("Please enter the value of one side of the square.");
			Scanner scan2 = new Scanner(System.in);
			float square = scan2.nextFloat();
			float squareArea = square * square;

			System.out.println("The area of the square is => " + squareArea);

			System.out.println("To find another shapes area, enter '1' ");
			int reChoice = scan.nextInt();
			if(reChoice == 1)
			{
				Geo1(); 
			}

		}else if(choice == 3){

			System.out.println("Please enter the value of the length and the width of the rectangle.");
			System.out.print("Length => ");
			Scanner scan5 = new Scanner(System.in);
			float length = scan5.nextFloat();

			System.out.print("Width => ");
			Scanner scan6 = new Scanner(System.in);
			float width = scan6.nextFloat();

			float rectangleArea = length * width ; 

			System.out.println("The area of the square is => " + rectangleArea);

			System.out.println("To find another shapes area, enter '1' ");
			int reChoice = scan.nextInt();
			if(reChoice == 1)
			{
				Geo1(); 
			}


		}else if(choice == 4){

			System.out.println("Please enter the base and height value of the parallelogram =>");
			System.out.print("Base => ");
			Scanner scan7 = new Scanner(System.in);
			float pBase = scan7.nextFloat();

			System.out.print("Height => ");
			Scanner scan8 = new Scanner(System.in);
			float pHeight = scan8.nextFloat();

			float parallelogramArea = pBase * pHeight ;	

			System.out.println("The area of the parallelogram is => " + parallelogramArea);

			System.out.println("To find another shapes area, enter '1' ");
			int reChoice = scan.nextInt();
			if(reChoice == 1)
			{
				Geo1(); 
			}

 		}else if(choice == 5){

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


			float trapezoidArea = (( bottomBase + topBase ) / 2 )* tHeight ;	

			System.out.println("The area of the trapezoid is => " + trapezoidArea);

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