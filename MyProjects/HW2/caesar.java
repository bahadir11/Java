import java.util.Scanner; 

public class caesar {
    
	public static void main(String[] args) {
	
 		System.out.println("To cypher enter '1', to decypher enter '2'");
		Scanner scan = new Scanner(System.in);
	 
		int choice = scan.nextInt();
		
		if(choice == 1)
		{
			System.out.println("Please enter the 14 space long message you want to cypher => ");
			Scanner scan1 = new Scanner(System.in);
			String toCypher = scan1.nextLine();
			
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


			

			toCypher = ( "==> " + (char)toCypher0 + (char)toCypher1 + (char)toCypher2 + (char)toCypher3 + (char)toCypher4 + (char)toCypher5 + (char)toCypher6 + (char)toCypher7 + (char)toCypher8 + (char)toCypher9 + (char)toCypher10 + (char)toCypher11 + (char)toCypher12 + (char)toCypher13);
			
			

			System.out.println(toCypher);
			
			

		}else if(choice == 2)
		{
			System.out.println("Please enter the 14 space long message you want to decypher => ");

			
			Scanner scan3 = new Scanner(System.in);
			String toDecypher = scan3.nextLine();
			
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


			

			toDecypher = ( "==> " + (char)toDecypher0 + (char)toDecypher1 + (char)toDecypher2 + (char)toDecypher3 + (char)toDecypher4 + (char)toDecypher5 + (char)toDecypher6 + (char)toDecypher7 + (char)toDecypher8 + (char)toDecypher9 + (char)toDecypher10 + (char)toDecypher11 + (char)toDecypher12 + (char)toDecypher13);
			
			

			System.out.println(toDecypher);
			
	
		}

}	
	
}