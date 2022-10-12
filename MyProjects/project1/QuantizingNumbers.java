import java.util.Scanner; // import the scanner util to get input from the user

	class QuantizingNumbers {  //create the class

		public static void main(String[] args) {

			Scanner myObj = new Scanner(System.in);
			System.out.println("Please enter six numbers...");

			//get the six numbers from the user

			float n1 = myObj.nextFloat();
			float n2 = myObj.nextFloat();
			float n3 = myObj.nextFloat();
			float n4 = myObj.nextFloat();
			float n5 = myObj.nextFloat();
			float n6 = myObj.nextFloat();

			//calculate the maximum value
			
			float n1Max = Math.max(n1,n2);
			float n2Max = Math.max(n3,n4);
			float n3Max = Math.max(n5,n6);
			float n4Max = Math.max(n1Max,n2Max);
			float nMax = Math.max(n4Max,n3Max);	

			//calculaete the minimum value
			
			float n1Min = Math.min(n1,n2);
			float n2Min = Math.min(n3,n4);
			float n3Min = Math.min(n5,n6);
			float n4Min = Math.min(n1Min,n2Min);
			float nMin = Math.min(n4Min,n3Min);

			//calculate the new Quantized Numbers using the given formula

			n1 = (n1 - nMin) / (nMax - nMin) ;
			n2 = (n2 - nMin) / (nMax - nMin) ;
			n3 = (n3 - nMin) / (nMax - nMin) ;
			n4 = (n4 - nMin) / (nMax - nMin) ;
			n5 = (n5 - nMin) / (nMax - nMin) ;
			n6 = (n6 - nMin) / (nMax - nMin) ;

			//print out the results

			System.out.println("New value of n1 i s : " + n1);
			System.out.println("New value of n2 i s : " + n2);
			System.out.println("New value of n3 i s : " + n3);
			System.out.println("New value of n4 i s : " + n4);
			System.out.println("New value of n5 i s : " + n5);
			System.out.println("New value of n6 i s : " + n6);

	}
}