/*
 * This program gets the initial money and the expected winnings
 * and simulates the gambling by using the probability 
 * Finally the program displays the win and lose ratio
 * 
 * Author:Bahadır
 * 
 */

import java.util.Scanner;
import java.util.Random;

    public class gamblers_ruin {

        public static void main(String[] args){
            //to get the random numbers create a generator
            Random generator = new Random();
            //equal p to its value
            //to get input from the user create a scanner
            Scanner scan = new Scanner(System.in);
            //ask the user the initial money he has
            System.out.println("How much money do you have?");
            float money = scan.nextFloat();
            //ask the user his goal money
            System.out.println("What is your goal?");
            float goalMoney = scan.nextFloat();
            System.out.println("Enter the probability ==> ");
            double prob = scan.nextDouble();
            //display the user his initial and goal money with the winning probability
            System.out.println("Your initial money is ==> " + money + "$");
            System.out.println("Your goal money is ==> " + goalMoney + "$");
            System.out.println("The probability of winning each round is ==> " + prob);
        
            //initialize the variables to use
            float usableMoney = money;
            float usableGoalMoney = goalMoney;
            int countBig = 0;
            int winBig = 0;
            int loseBig = 0;
            //to keep track of the number of games won or lost 
            //do a while loop to loop 1000 times
            while(countBig <= 1000){
                //everytime the code runs, set the money and goalmoney to their original value
                money = usableMoney;
                goalMoney = usableGoalMoney;
            
            //do an inner while loop to simulate each of the 1000 games
                
            while(money > 0 && money < goalMoney){
                //to get the randomness that the user has entered , create a random number each time the loop runs

                int worl = generator.nextInt(100);
                
                double probability1 = prob * 100; 
                //if the probability is bigger than the random number, simulate as money is won
                if(worl < probability1){
                    money += 1;  
                    //if the money has reached the goalmoney, add one to the won games, and one to the 1000 simulations to be done
                    // if(money >= goalMoney){
                    //     countBig += 1 ; 
                    //     winBig += 1 ;
                    // }
                //if the random number is bigger than the probability the user has entered, set it as though the game is lost
                }else if(worl >= probability1){
                    money -= 1;
                    //if the money has reached 0, add one to the total simulations and one to the lose counter
                    // if(money == 0){
                    //     countBig += 1;
                    //     loseBig += 1 ;
                    // }
                        
                }    
            
            } 
            
            //if the money has reached the goalmoney, add one to the won games, and one to the 1000 simulations to be done
            if(money >= goalMoney){
                countBig += 1 ; 
                winBig += 1 ;
            //if the money has reached 0, add one to the total simulations and one to the lose counter
            }else if(money <= 0){
                //Print out the win lose ratio with the number of simulations made
                countBig += 1;
                loseBig += 1; 
            }
        }
        //display the results to 
        if(countBig >= 999){
        System.out.println("Won = " + winBig + " Lose = " + loseBig);
        }
    }
}





