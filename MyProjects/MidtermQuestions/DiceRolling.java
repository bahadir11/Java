import java.util.Random;

public class DiceRolling{

	public static void main(String[] args){
		Random rand = new Random();
		int GoodTime = 0;
		int count = 0;
		while(count <= 1000){
			int DiceOne = rand.nextInt(7);
			int DiceTwo = rand.nextInt(7);	
			count += 1;
			int Toplam = 0;
			Toplam = DiceOne + DiceTwo;
			if(Toplam == 6){
				GoodTime += 1;
			}
			if(count == 1000){
					System.out.println("We rolled the dices " + count + " times, and " + GoodTime + " times the upper sides of the two dices added equals 6.");
				}

		}



} 

}