import java.util.Scanner; //import the scanner util to get input from the user

class ComputeDistances {  //create the class

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		//ask the user to enter two points

		System.out.println("Enter a point");
		int x1 = myObj.nextInt();
		int y1 = myObj.nextInt();
		System.out.println("Enter a point");
		int x2 = myObj.nextInt();
		int y2 = myObj.nextInt();

		//calculate the manhattan distance using the formula
		
		float Manhattan = Math.abs((x1 - x2) + (y1 - y2));

		//print out the result

		System.out.println("Manhattan distance is equal to ==>  " + Manhattan);

		//calculate the Euclidean distance using the formula

		double Euclidean = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));

		//print out the result

		System.out.println("Euclidean distance is equal to ==>  " + Euclidean);

		//calculate the Cosine distance using the formula
	
		double Cosine = 1 - (x1 * x2 + y1 * y2) / (Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2)) * (Math.sqrt(Math.pow(x2,2) + Math.pow(y2,2)) ));

		//print out the result

		System.out.println("Cosine distance is equal to ==>  " + Cosine);

	}
}