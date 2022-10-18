import java.util.Scanner;  //import the scanner util

public class DeCypher {
    
	public static void main(String[] args) {

			//prompt the user to enter the 14 character long message to decypher it			

			System.out.println("Please enter the 14 space long message you want to decypher => ");

			//get the message from the user
			
			Scanner scan3 = new Scanner(System.in);
			String toDecypher = scan3.nextLine();

			//get each individual characters numeric value and assign it
			
			int toDecypher0 = toDecypher.charAt(0);
			int toDecypher1 = toDecypher.charAt(1);
			int toDecypher2 = toDecypher.charAt(2);
			int toDecypher3 = toDecypher.charAt(3);
			int toDecypher4 = toDecypher.charAt(4);
			int toDecypher5 = toDecypher.charAt(5);
			int toDecypher6 = toDecypher.charAt(6);
			int toDecypher7 = toDecypher.charAt(7);
			int toDecypher8 = toDecypher.charAt(8);
			int toDecypher9 =  toDecypher.charAt(9);
			int toDecypher10 = toDecypher.charAt(10);
			int toDecypher11 = toDecypher.charAt(11);
			int toDecypher12 = toDecypher.charAt(12);
			int toDecypher13 = toDecypher.charAt(13);

						
			//to decypher the message, subtract 3 from the numeric value of the character
			

			if(toDecypher0 >= 100 && toDecypher0 < 123 && toDecypher.charAt(0) != 32){
				toDecypher0 = - 3 + toDecypher0 ;
			}else if (toDecypher.charAt(0) == 32){
				toDecypher0 = 0 + toDecypher0 ;
			}else if(toDecypher0 < 100){
				toDecypher0 += 23;
			}
			
			if(toDecypher1 >= 100 && toDecypher1 < 123 && toDecypher.charAt(1) != 32){
				toDecypher1 = -3 + toDecypher1 ;
			}else if (toDecypher.charAt(1) == 32){
				toDecypher1 = 0 + toDecypher1 ;
			}else if(toDecypher1 < 100){
				toDecypher1 += 23;
			}
			if(toDecypher2 >= 100 && toDecypher2 < 123 && toDecypher.charAt(2) != 32){
				toDecypher2 = -3 + toDecypher2 ;
			}else if (toDecypher.charAt(2) == 32){
				toDecypher2 = 0 + toDecypher2 ;
			}else if(toDecypher2 < 100){
				toDecypher2 += 23;
			}
			if(toDecypher3 >= 100 && toDecypher3 < 123 && toDecypher.charAt(3) != 32){
				toDecypher3 = -3 + toDecypher3 ;
			}else if (toDecypher.charAt(3) == 32){
				toDecypher3 = 0 + toDecypher3 ;
			}else if(toDecypher3 < 100){
				toDecypher3 += 23;
			}
			if(toDecypher4 >= 100 && toDecypher4 < 123 && toDecypher.charAt(4) != 32){
				toDecypher4 = -3 + toDecypher4 ;
			}else if (toDecypher.charAt(4) == 32){
				toDecypher4 = 0 + toDecypher4 ;
			}else if(toDecypher4 < 100){
				toDecypher4 += 23;
			}
			if(toDecypher5 >= 100 && toDecypher5 < 123 && toDecypher.charAt(5) != 32){
				toDecypher5 = -3 + toDecypher5 ;
			}else if (toDecypher.charAt(5) == 32){
				toDecypher5 = 0 + toDecypher5 ;
			}else if(toDecypher5 < 100){
				toDecypher5 += 23;
			}
			if(toDecypher6 >= 100 && toDecypher6 < 123 && toDecypher.charAt(6) != 32){
				toDecypher6 = -3 + toDecypher6 ;
			}else if (toDecypher.charAt(6) == 32){
				toDecypher6 = 0 + toDecypher6 ;
			}else if(toDecypher6 < 100){
				toDecypher6 += 23;
			}
			if(toDecypher7 >= 100 && toDecypher7 < 123 && toDecypher.charAt(7) != 32){
				toDecypher7 = -3 + toDecypher7 ;
			}else if (toDecypher.charAt(7) == 32){
				toDecypher7 = 0 + toDecypher7 ;
			}else if(toDecypher7 < 100){
				toDecypher7 += 23;
			}
			if(toDecypher8 >= 100 && toDecypher8 < 123 && toDecypher.charAt(8) != 32){
				toDecypher8 = -3 + toDecypher8 ;
			}else if (toDecypher.charAt(8) == 32){
				toDecypher8 = 0 + toDecypher8 ;
			}else if(toDecypher8 < 100){
				toDecypher8 += 23;
			}
			if(toDecypher9 >= 100 && toDecypher9 < 123 && toDecypher.charAt(9) != 32){
				toDecypher9 = -3 + toDecypher9 ;
			}else if (toDecypher.charAt(9) == 32){
				toDecypher9 = 0 + toDecypher9 ;
			}else if(toDecypher9 < 100){
				toDecypher9 += 23;
			}
			if(toDecypher10 >= 100 && toDecypher10 < 123 && toDecypher.charAt(10) != 32){
				toDecypher10 = -3 + toDecypher10 ;
			}else if (toDecypher.charAt(10) == 32){
				toDecypher10 = 0 + toDecypher10 ;
			}else if(toDecypher10 < 100){
				toDecypher10 += 23;
			}
			if(toDecypher11 >= 100 && toDecypher11 < 123 && toDecypher.charAt(11) != 32){
				toDecypher11 = -3 + toDecypher11 ;
			}else if (toDecypher.charAt(11) == 32){
				toDecypher11 = 0 + toDecypher11 ;
			}else if(toDecypher11 < 100){
				toDecypher11 += 23;
			}
			if(toDecypher12 >= 100 && toDecypher12 < 123 && toDecypher.charAt(12) != 32){
				toDecypher12 = -3 + toDecypher12 ;
			}else if (toDecypher.charAt(12) == 32){
				toDecypher12 = 0 + toDecypher12 ;
			}else if(toDecypher12 < 100){
				toDecypher12 += 23;
			}
			if(toDecypher13 >= 100 && toDecypher13 < 123 && toDecypher.charAt(13) != 32){
				toDecypher13 = -3 + toDecypher13 ;
			}else if (toDecypher.charAt(13) == 32){
				toDecypher13 = 0 + toDecypher13 ;
			}else if(toDecypher13 < 100){
				toDecypher13 += 23;
			}


			//combine each of the decyphered characters to get the decyphered message			

			toDecypher = ( "==> " + (char)toDecypher0 + (char)toDecypher1 + (char)toDecypher2 + (char)toDecypher3 + (char)toDecypher4 + (char)toDecypher5 + (char)toDecypher6 + (char)toDecypher7 + (char)toDecypher8 + (char)toDecypher9 + (char)toDecypher10 + (char)toDecypher11 + (char)toDecypher12 + (char)toDecypher13);
			
			//return the message to the user

			System.out.println(toDecypher);
			
	
		}}