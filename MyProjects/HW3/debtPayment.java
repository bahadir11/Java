/*
 * This program gets the users initial debt,
 * the yearly interest rate, and the monthly payments the user is going to
 * make.
 * Then the program calculates how many months it will take to fully pay 
 * the debt. Finally the program prints the months needed and the total amount
 * of money paid
 * Author: Bahadır
 */

import java.util.Scanner;
//to round the decimal numbers, import the decimalFormat module
import java.text.DecimalFormat;

public class debtPayment {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        //initialize a format and set it to two of the values after 0
        DecimalFormat format = new DecimalFormat("0.##");
        //get the initial debt from the user
        System.out.print("Please enter the initial debt ==> ");
        double initialDebt = scan.nextDouble();
        //get the yearly interest from the user
        System.out.print("Please enter the yearly interest rate ==> ");
        double interest = scan.nextDouble();
        //get the monthly payments from the user
        System.out.print("Please enter your monthly payments ==> ");
        double monthlyPayment = scan.nextDouble();
        //to calculate the monthlyinterest, divide the yearly interest with 12
        double monthlyInterest = interest / 12;
        //initialize the total payment
        double totalPayment = 0;        
        //initialize the debt
        double debt = initialDebt;
        //initialize months
        int months = 0;
        //use a while statement to calculate the debt
        while(debt > 0){
            //to find the monthly debt that goes to the interest rate
            //multiply the debt with monthly interest and divide by 100
            double monthlyInterestDebt = debt * monthlyInterest / 100;
            //to round the decimal numbers, use the decimal format module 
            String monthlyInterestDebt1 = format.format(monthlyInterestDebt);
            //convert the rounded string value to double by using the parse
            //double
            monthlyInterestDebt = Double.parseDouble(monthlyInterestDebt1);
            //the monthly debt left is equal to the initial debt 
            // minus monthly payment plus the monthly payment to the interest
            debt = debt - monthlyPayment + monthlyInterestDebt;
            //to round the decimal numbers, use the decimal format module 
            String debt1 = format.format(debt);
            //convert the rounded string value to double by parseDouble
            debt = Double.parseDouble(debt1);
            //add one to months to keep track of it
            months += 1;
            //each time the loop runs, add to the total payment
            totalPayment += monthlyInterestDebt;
            //to avoid malfunction, make an if statement to figure out if the 
            // next calculation will result in a negative value
            if(debt <= monthlyPayment - monthlyInterestDebt){
                //if it does, add one to the month and make the debt 0
                months += 1;
                debt = 0 ;
                //finally, get the total payment
                totalPayment = totalPayment + monthlyInterestDebt + initialDebt ; 
                //print out all the results
                System.out.println("It will take you " + months + " months to pay the debt.");
                System.out.println("Your total payment will be " + totalPayment + " dollars.");
            }
            
        }


    }

}
