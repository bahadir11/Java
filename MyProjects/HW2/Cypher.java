import java.util.Scanner;  //import the scanner util

public class Cypher {
    
	public static void main(String[] args) {	

			//prompt the user to enter the 14 character long message to cypher it

			System.out.println("Please enter the 14 space long message you want to cypher => ");
			Scanner scan1 = new Scanner(System.in);

			//get the input

			String toCypher = scan1.nextLine();

			//get each individual character to assign it to its numeric value
			
			int toCypher0 = toCypher.charAt(0);
			int toCypher1 = toCypher.charAt(1);
			int toCypher2 = toCypher.charAt(2);
			int toCypher3 = toCypher.charAt(3);
			int toCypher4 = toCypher.charAt(4);
			int toCypher5 = toCypher.charAt(5);
			int toCypher6 = toCypher.charAt(6);
			int toCypher7 = toCypher.charAt(7);
			int toCypher8 = toCypher.charAt(8);
			int toCypher9 =  toCypher.charAt(9);
			int toCypher10 = toCypher.charAt(10);
			int toCypher11 = toCypher.charAt(11);
			int toCypher12 = toCypher.charAt(12);
			int toCypher13 = toCypher.charAt(13);

						
	
			//to shift the charaters by 3 spaces , add 3 to the numeric value of the character

			if(toCypher0 < 120 && toCypher.charAt(0) != 32){
				toCypher0 = 3 + toCypher0 ;
			}else if (toCypher.charAt(0) == 32){
				toCypher0 = 0 + toCypher0 ;
			}else if(toCypher0 >= 120){
				toCypher0 -= 23;
			}
			
			if(toCypher1 < 120 && toCypher.charAt(1) != 32){
				toCypher1 = 3 + toCypher1 ;
			}else if (toCypher.charAt(1) == 32){
				toCypher1 = 0 + toCypher1 ;
			}else if(toCypher1 >= 120){
				toCypher1 -= 23;
			}
			if(toCypher2 < 120 && toCypher.charAt(2) != 32){
				toCypher2 = 3 + toCypher2 ;
			}else if (toCypher.charAt(2) == 32){
				toCypher2 = 0 + toCypher2 ;
			}else if(toCypher2 >= 120){
				toCypher2 -= 23;
			}
			if(toCypher3 < 120 && toCypher.charAt(3) != 32){
				toCypher3 = 3 + toCypher3 ;
			}else if (toCypher.charAt(3) == 32){
				toCypher3 = 0 + toCypher3 ;
			}else if(toCypher3 >= 120){
				toCypher3 -= 23;
			}
			if(toCypher4 < 120 && toCypher.charAt(4) != 32){
				toCypher4 = 3 + toCypher4 ;
			}else if (toCypher.charAt(4) == 32){
				toCypher4 = 0 + toCypher4 ;
			}else if(toCypher4 >= 120){
				toCypher4 -= 23;
			}
			if(toCypher5 < 120 && toCypher.charAt(5) != 32){
				toCypher5 = 3 + toCypher5 ;
			}else if (toCypher.charAt(5) == 32){
				toCypher5 = 0 + toCypher5 ;
			}else if(toCypher5 >= 120){
				toCypher5 -= 23;
			}
			if(toCypher6 < 120 && toCypher.charAt(6) != 32){
				toCypher6 = 3 + toCypher6 ;
			}else if (toCypher.charAt(6) == 32){
				toCypher6 = 0 + toCypher6 ;
			}else if(toCypher6 >= 120){
				toCypher6 -= 23;
			}
			if(toCypher7 < 120 && toCypher.charAt(7) != 32){
				toCypher7 = 3 + toCypher7 ;
			}else if (toCypher.charAt(7) == 32){
				toCypher7 = 0 + toCypher7 ;
			}else if(toCypher7 >= 120){
				toCypher7 -= 23;
			}
			if(toCypher8 < 120 && toCypher.charAt(8) != 32){
				toCypher8 = 3 + toCypher8 ;
			}else if (toCypher.charAt(8) == 32){
				toCypher8 = 0 + toCypher8 ;
			}else if(toCypher8 >= 120){
				toCypher8 -= 23;
			}
			if(toCypher9 < 120 && toCypher.charAt(9) != 32){
				toCypher9 = 3 + toCypher9 ;
			}else if (toCypher.charAt(9) == 32){
				toCypher9 = 0 + toCypher9 ;
			}else if(toCypher9 >= 120){
				toCypher9 -= 23;
			}
			if(toCypher10 < 120 && toCypher.charAt(10) != 32){
				toCypher10 = 3 + toCypher10 ;
			}else if (toCypher.charAt(10) == 32){
				toCypher10 = 0 + toCypher10 ;
			}else if(toCypher10 >= 120){
				toCypher10 -= 23;
			}
			if(toCypher11 < 120 && toCypher.charAt(11) != 32){
				toCypher11 = 3 + toCypher11 ;
			}else if (toCypher.charAt(11) == 32){
				toCypher11 = 0 + toCypher11 ;
			}else if(toCypher11 >= 120){
				toCypher11 -= 23;
			}
			if(toCypher12 < 120 && toCypher.charAt(12) != 32){
				toCypher12 = 3 + toCypher12 ;
			}else if (toCypher.charAt(12) == 32){
				toCypher12 = 0 + toCypher12 ;
			}else if(toCypher12 >= 120){
				toCypher12 -= 23;
			}
			if(toCypher13 < 120 && toCypher.charAt(13) != 32){
				toCypher13 = 3 + toCypher13 ;
			}else if (toCypher.charAt(13) == 32){
				toCypher13 = 0 + toCypher13 ;
			}else if(toCypher13 >= 120){
				toCypher13 -= 23;
			}


			//return the cyphered text by combining the individual characters

			toCypher = ( "==> " + (char)toCypher0 + (char)toCypher1 + (char)toCypher2 + (char)toCypher3 + (char)toCypher4 + (char)toCypher5 + (char)toCypher6 + (char)toCypher7 + (char)toCypher8 + (char)toCypher9 + (char)toCypher10 + (char)toCypher11 + (char)toCypher12 + (char)toCypher13);
			
			

			System.out.println(toCypher);

}
}