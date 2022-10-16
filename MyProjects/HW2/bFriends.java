/*
 * This program calculates the ages of Mr. Bıdık and his 4 friends
 * and figures who is the oldest and the youngest and returns the results
 * 
 * Author: Bahadır
 */


import java.util.Scanner;

public class bFriends {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hey guys!!! \n Please enter your birthyear.");
		//Get the birthyears of the five friends
		System.out.print("Enter your birthyear Mr. Bidik => ");
		
		int bidik = scan.nextInt();
		//calculate the age of the person
		int bidikAge = 2022 - bidik;

		System.out.print("Enter your birthyear Defne => ");

		int defne = scan.nextInt();
		//calculate the age of the person
		int defneAge = 2022 - defne;

		System.out.print("Enter your birthyear Subramani => ");

		int subramani = scan.nextInt();
		//calculate the age of the person
		int subramaniAge = 2022 - subramani;

		System.out.print("Enter birthyear Matthew => ");

		int matthew = scan.nextInt();
		//calculate the age of the person

		int matthewAge = 2022 - matthew;

		System.out.print("Enter your birthyear Hang => ");

		int hang = scan.nextInt();
		//calculate the age of the person
		int hangAge = 2022 - hang;	

		
		//Calculate if the person is old or young by looking if he is born before 1900 
		if(bidik >= 1900)
		{
			//return the persons age and maturity
			String bidikMature = "young";	
			System.out.println("Mr. Bidik is " + bidikAge + ", and he is " + bidikMature + ".");
		}else{
			String bidikMature = "old";
			//return the persons age and maturity

			System.out.println("Mr. Bidik is " + bidikAge + ", and he is " + bidikMature + ".");

		}

		if(defne >= 1900)
		{
			String defneMature = "young";	
			//return the persons age and maturity

			System.out.println("Defne is " + defneAge + ", and she is " + defneMature + ".");
		}else{
			String defneMature = "old";
			//return the persons age and maturity

			System.out.println("Defne is " + defneAge + ", and she is " + defneMature + ".");

		}

		if(subramani >= 1900)
		{
			String subramaniMature = "young";
			//return the persons age and maturity

			System.out.println("Subramani is " + subramaniAge + ", and he is " + subramaniMature + ".");

		}else{
			String subramaniMature = "old";
			//return the persons age and maturity

			System.out.println("Subramani is " + subramaniAge + ", and he is " + subramaniMature + ".");

		}

		if(matthew >= 1900)
		{
			String matthewMature = "young";	
			//return the persons age and maturity

			System.out.println("Matthew is " + matthewAge + ", and he is " + matthewMature + ".") ;

		}else{
			String matthewMature = "old";
			//return the persons age and maturity

			System.out.println("Matthew is " + matthewAge + ", and he is " + matthewMature + ".");

		}

		if(hang >= 1900)
		{
			String hangMature = "young";	
			//return the persons age and maturity

			System.out.println("Hang is " + hangAge + ", and he is " + hangMature + ".");

		}else{
			String hangMature = "old";
			//return the persons age and maturity

			System.out.println("Hang is " + hangAge + ", and he is " + hangMature + ".");
		}
		//Find the oldest in the group by comparing their ages together

		if(bidikAge > defneAge && bidikAge > subramaniAge && bidikAge > matthewAge && bidikAge > hangAge){
			System.out.println("The oldest in the group is Mr. Bidik");
		}

		if(defneAge > bidikAge && defneAge > subramaniAge && defneAge > matthewAge && defneAge > hangAge)
			System.out.println("The oldest in the group is Defne");
		

		if(subramaniAge > bidikAge && subramaniAge > defneAge && subramaniAge > matthewAge && subramaniAge > hangAge)
			System.out.println("The oldest in the group is Subramani");
		

		if(matthewAge > defneAge && matthewAge > subramaniAge && matthewAge > bidikAge && matthewAge > hangAge)
			System.out.println("The oldest in the group is Matthew");
		
		if(hangAge > defneAge && hangAge > subramaniAge && hangAge > matthewAge && hangAge > bidikAge)
			System.out.println("The oldest in the group is Hang");

		//Find the youngest in the group by comparing their ages

		if(bidikAge < defneAge && bidikAge < subramaniAge && bidikAge < matthewAge && bidikAge < hangAge){
			System.out.println("The youngest in the group is Mr. Bidik");
		}

		if(defneAge < bidikAge && defneAge < subramaniAge && defneAge < matthewAge && defneAge < hangAge)
			System.out.println("The youngest in the group is Defne");
		

		if(subramaniAge < bidikAge && subramaniAge < defneAge && subramaniAge < matthewAge && subramaniAge < hangAge)
			System.out.println("The youngest in the group is Subramani");
		

		if(matthewAge < defneAge && matthewAge < subramaniAge && matthewAge < bidikAge && matthewAge < hangAge)
			System.out.println("The youngest in the group is Matthew");
		
		if(hangAge < defneAge && hangAge < subramaniAge && hangAge < matthewAge && hangAge < bidikAge)
			System.out.println("The youngest in the group is Hang");
		
	}

}