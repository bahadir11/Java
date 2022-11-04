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
            double p = 0.49;
            //to get input from the user create a scanner
            Scanner scan = new Scanner(System.in);
            //ask the user the initial money he has
            System.out.println("How much money do you have?");
            float money = scan.nextFloat();
            //ask the user his goal money
            System.out.println("What is your goal?");
            float goalMoney = scan.nextFloat();
            //display the user his initial and goal money with the winning probability
            System.out.println("Your initial money is ==> " + money + "$");
            System.out.println("Your goal money is ==> " + goalMoney + "$");
            System.out.println("The probability of winning each round is ==> " + p);
        
            //initialize the win lose and count values
            int win = 0;
            int lose = 0;
            int count = 0 ;
            //use a while statement to count the money with loops
            while(money > 0 && money < goalMoney){
                //get a random number betweeen 0 - 99
                int worl = generator.nextInt(100);
                //to keep track of how much simulations made, add one to count
                count += 1;
                //to get the p=0.49 probability, use if statements
                if(worl < 49){
                    //if the number is between 0 - 48 add one to money and win 
                    money += 1;
                    win +=1; 
                }else
                if(worl >= 49){
                    //if the number is between 49-99 subtract one from money and add one to lose
                    money -= 1;
                    lose += 1;
                }
                //to keep a max number of simulations, add an if statement to stop the while statement
                if(count == 1000){
                    //if won , print the win lose ratio with the number of the simulation
                    if(win>lose){
                        System.out.println("Win = " + win);
                        System.out.println("Lose = " + lose);
                        System.out.println("Number of simulater rounds are ==> " + (win+lose));
                        break;
                    }
                    //if lost , print the win lose ratio with the number of the simulation
                    if(win<lose){
                        System.out.println("Win = " + win);
                        System.out.println("Lose = " + lose);
                        System.out.println("Number of simulater rounds are ==> " + (win+lose));
                        break;
                    }
                    break;
                }

            }
            //if money reaches 0 before the count reaches 1000, make an if statement to get out of the while loop
            if(money == 0){
                //Print out the win lose ratio with the number of simulations made
                System.out.println("Win = " + win);
                System.out.println("Lose = " + lose);
                System.out.println("Number of simulater rounds are ==> " + (win+lose));
                System.out.println("You are out of money.You cannot play anymore.");
            }
            //if the money reaches the goal before the count reaches 1000, make an if statement to break out of the while loop
            if(money >= goalMoney){
                //Print out the win lose ratio with the number of simulations made
                System.out.println("Win = " + win);
                System.out.println("Lose = " + lose);
                System.out.println("Number of simulater rounds are ==> " + (win+lose));
                System.out.println("You have reached your goal!!!");
            }




    }



}



