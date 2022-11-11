/*
 * This program gets three fractional numbers from the user and 
 * calculates if they are equal or greater than eachother
 * the program uses addition subtraction division and multiplication on these
 * three numbers with eachother and displays the results
 * 
 * Author: Bahadır
 * 
 */



import java.util.Scanner;
import java.text.DecimalFormat;

public class FractionalNumbers {
    
    public static void main(String[] args){

        //to get short numbers use the decimal format 
        
        DecimalFormat format = new DecimalFormat("0.##");
        //to get input from the user create a new scanner obj

        Scanner scan = new Scanner(System.in);
        //prompt the user to enter the fractional numbers
        System.out.print("Please enter the first fractional number in string representation ==> ");
        //get the number
        String firstNumber = scan.nextLine();
        //to get the number in a/b form only get the 0 and 2 index
        char firstOne = firstNumber.charAt(0);
        char secondOne = firstNumber.charAt(2);
        //initialize the first and second values
        double firstValue = 0;
        double secondValue = 0;
        //convert the char value to the decimal values
        if(firstOne == 48){
            firstValue = 0;
        }else if(firstOne == 49){
            firstValue = 1;
        }else if(firstOne == 50){
            firstValue = 2;
        }else if(firstOne == 51){
            firstValue = 3;
        }else if(firstOne == 52){
            firstValue = 4;
        }else if(firstOne == 53){
            firstValue = 5;
        }else if(firstOne == 54){
            firstValue = 6;
        }else if(firstOne == 55){
            firstValue = 7;
        }else if(firstOne == 56){
            firstValue = 8;
        }else if(firstOne == 57){
            firstValue = 9;
        }
        if(secondOne == 48){
            secondValue = 0;
        }else if(secondOne == 49){
            secondValue = 1;
        }else if(secondOne == 50){
            secondValue = 2;
        }else if(secondOne == 51){
            secondValue = 3;
        }else if(secondOne == 52){
            secondValue = 4;
        }else if(secondOne == 53){
            secondValue = 5;
        }else if(secondOne == 54){
            secondValue = 6;
        }else if(secondOne == 55){
            secondValue = 7;
        }else if(secondOne == 56){
            secondValue = 8;
        }else if(secondOne == 57){
            secondValue = 9;
        }
        //to shorten the double numbers  use the decimal format
        String first1Value = format.format(firstValue);
        firstValue = Double.parseDouble(first1Value);        
        String first2Value = format.format(secondValue);
        secondValue = Double.parseDouble(first2Value);
        //the first number is equal to the entered values divided with eachother
        double fistNumber = firstValue / secondValue;

        double theFirstValues = firstValue;
        double theSecondValues = secondValue; 
        //to simplify the fractional numbers use a while loop and subtract 
        //the value of the second one from the first if the first one is 
        //bigger and do the same to the second value as well to achieve the
        //simplified matter of numbers
 
        while (firstValue != secondValue){
          if(firstValue > secondValue)
             firstValue = firstValue - secondValue;
          else
             secondValue = secondValue - firstValue;
        }  
        
        //to get the simplified number as a string, assign a variable to do it
       double firstSimplify = theFirstValues / firstValue ;
       double SecondSimplify = theSecondValues / firstValue ;
       String totalFirstSimplify = (int)firstSimplify + "/" + (int)SecondSimplify;    

        //get the second fractional number
        System.out.print("Please enter the second fractional number in string representation ==> ");
        String secondNumber = scan.nextLine();
        //to get the number in a/b form only get the 0 and 2 index
        char firstTwo = secondNumber.charAt(0);
        char secondTwo = secondNumber.charAt(2);
        //initialize the first and second values
        double firstTwoValue = 0;
        double secondTwoValue = 0;
        //get the decimal value by using the char value and converting the values
        if(firstTwo == 48){
            firstTwoValue = 0;
        }else if(firstTwo == 49){
            firstTwoValue = 1;
        }else if(firstTwo == 50){
            firstTwoValue = 2;
        }else if(firstTwo == 51){
            firstTwoValue = 3;
        }else if(firstTwo == 52){
            firstTwoValue = 4;
        }else if(firstTwo == 53){
            firstTwoValue = 5;
        }else if(firstTwo == 54){
            firstTwoValue = 6;
        }else if(firstTwo == 55){
            firstTwoValue = 7;
        }else if(firstTwo == 56){
            firstTwoValue = 8;
        }else if(firstTwo == 57){
            firstTwoValue = 9;
        }
        if(secondTwo == 48){
            secondTwoValue = 0;
        }else if(secondTwo == 49){
            secondTwoValue = 1;
        }else if(secondTwo == 50){
            secondTwoValue = 2;
        }else if(secondTwo == 51){
            secondTwoValue = 3;
        }else if(secondTwo == 52){
            secondTwoValue = 4;
        }else if(secondTwo == 53){
            secondTwoValue = 5;
        }else if(secondTwo == 54){
            secondTwoValue = 6;
        }else if(secondTwo == 55){
            secondTwoValue = 7;
        }else if(secondTwo == 56){
            secondTwoValue = 8;
        }else if(secondTwo == 57){
            secondTwoValue = 9;
        }
        //to shorten the numbers use the decimal format 
        String first2TwoValue = format.format(firstTwoValue);
        firstTwoValue = Double.parseDouble(first2TwoValue);
        String second2TwoValue = format.format(secondTwoValue);
        secondTwoValue = Double.parseDouble(second2TwoValue);
        
        double second2Number = firstTwoValue / secondTwoValue;
        String secondddddd = format.format(second2Number);
        second2Number = Double.parseDouble(secondddddd);

        double theFirst2Values = firstTwoValue;
        double theSecond2Values = secondTwoValue;
        double first2Simplify =0;
        double Second2Simplify =0; 
        if(theSecond2Values != 0 ){
            first2Simplify = theFirst2Values / firstTwoValue ;
            Second2Simplify = theSecond2Values / firstTwoValue ;

        }else{
            first2Simplify = 0;
            Second2Simplify = 0; 
        }
        //to simplify the fractional numbers use a while loop and subtract 
        //the value of the second one from the first if the first one is 
        //bigger and do the same to the second value as well to achieve the
        //simplified matter of numbers

        int firstOfTheSecondOneToPrint = (int)firstTwoValue;
        int secondOfTheSecondOneToPrint = (int)secondTwoValue;
 
 
        while (firstTwoValue != secondTwoValue && firstTwoValue != 0){
          if(firstTwoValue > secondTwoValue)
             firstTwoValue = firstTwoValue - secondTwoValue;
          else
             secondTwoValue = secondTwoValue - firstTwoValue;
        }      
        //to get the simplified number as a string, use the assignment operator to do it
       String totalSecondSimplify =firstOfTheSecondOneToPrint+ "/" + secondOfTheSecondOneToPrint;

        //get the third fractional number

        System.out.print("Please enter the third fractional number in numerator and denominator form ==> ");
        String twoNumbers = scan.nextLine();
        //get the first number at index 1
        int a =  twoNumbers.charAt(1);
        //initialize the first and second numbers
        char firstOfTwoNumbers = 0;
        char secondOfTwoNumbers = 0;
        //to also get negative numbers, use an if else statement to determine
        //it the char value of a = (-) so in that case we can use the number
        //else if it is positive, the normal sequence occurs
        
        if(a == 45){
            firstOfTwoNumbers = twoNumbers.charAt(0);
            secondOfTwoNumbers = twoNumbers.charAt(2);
        }else{
            firstOfTwoNumbers = twoNumbers.charAt(0);
            secondOfTwoNumbers = twoNumbers.charAt(1);
        }
        double firstOfTwoNumbersValue = 0;
        double secondOfTwoNumbersValue = 0;
        //convert the char values to decimal values

        if(firstOfTwoNumbers == 48){
            firstOfTwoNumbersValue = 0;
        }else if(firstOfTwoNumbers == 49){
            firstOfTwoNumbersValue = 1;
        }else if(firstOfTwoNumbers == 50){
            firstOfTwoNumbersValue = 2;
        }else if(firstOfTwoNumbers == 51){
            firstOfTwoNumbersValue = 3;
        }else if(firstOfTwoNumbers == 52){
            firstOfTwoNumbersValue = 4;
        }else if(firstOfTwoNumbers == 53){
            firstOfTwoNumbersValue = 5;
        }else if(firstOfTwoNumbers == 54){
            firstOfTwoNumbersValue = 6;
        }else if(firstOfTwoNumbers == 55){
            firstOfTwoNumbersValue = 7;
        }else if(firstOfTwoNumbers == 56){
            firstOfTwoNumbersValue = 8;
        }else if(firstOfTwoNumbers == 57){
            firstTwoValue = 9;
        }
        if(secondOfTwoNumbers == 48){
            secondOfTwoNumbersValue = 0;
        }else if(secondOfTwoNumbers == 49){
            secondOfTwoNumbersValue = 1;
        }else if(secondOfTwoNumbers == 50){
            secondOfTwoNumbersValue = 2;
        }else if(secondOfTwoNumbers == 51){
            secondOfTwoNumbersValue = 3;
        }else if(secondOfTwoNumbers == 52){
            secondOfTwoNumbersValue = 4;
        }else if(secondOfTwoNumbers == 53){
            secondOfTwoNumbersValue = 5;
        }else if(secondOfTwoNumbers == 54){
            secondOfTwoNumbersValue = 6;
        }else if(secondOfTwoNumbers == 55){
            secondOfTwoNumbersValue = 7;
        }else if(secondOfTwoNumbers == 56){
            secondOfTwoNumbersValue = 8;
        }else if(secondOfTwoNumbers == 57){
            secondOfTwoNumbersValue = 9;
        }
        //to shorten the numbers use the decimal format 
        
        String firstOfTwoNumbersValue2 = format.format(firstOfTwoNumbersValue);
        firstOfTwoNumbersValue = Double.parseDouble(firstOfTwoNumbersValue2);
        String secondOfTwoNumbersValue2 = format.format(secondOfTwoNumbersValue);
        secondOfTwoNumbersValue = Double.parseDouble(secondOfTwoNumbersValue2);
        double thirdValue = 0;
        if(firstOfTwoNumbersValue != 0 ) {
            thirdValue = firstOfTwoNumbersValue /  secondOfTwoNumbersValue;
        }else{
            thirdValue = 0;
        }
        
       
        //if the value is negative, use an if statement to make it negative
        if(a == 45){
            thirdValue = - thirdValue;
        }
        double theFirst22Values = firstOfTwoNumbersValue;
        double theSecond22Values = secondOfTwoNumbersValue;
        
        //to simplify the fractional numbers use a while loop and subtract 
        //the value of the second one from the first if the first one is 
        //bigger and do the same to the second value as well to achieve the
        //simplified matter of numbers
 
        while(firstOfTwoNumbersValue != secondOfTwoNumbersValue){

            if(firstOfTwoNumbersValue > secondOfTwoNumbersValue){
                firstOfTwoNumbersValue = firstOfTwoNumbersValue - secondOfTwoNumbersValue;
            }else{
                secondOfTwoNumbersValue = secondOfTwoNumbersValue - firstOfTwoNumbersValue;
        }
    }     

        
         
        //use a lot of decimal format to get the simple vesions of the two 
        //numbers that construct the third value
        String theFirst22Values1 = format.format(theFirst22Values);
        theFirst22Values = Double.parseDouble(theFirst22Values1);
        String theSecond22Values1 = format.format(theSecond22Values);
        theSecond22Values = Double.parseDouble(theSecond22Values1);
        double first22Simplify = theFirst22Values / firstOfTwoNumbersValue ;
        double Second22Simplify = theSecond22Values / firstOfTwoNumbersValue ;
        String totalThirdSimplify = (int)first22Simplify + "/" + (int)Second22Simplify;
        String first22Simplify1 = format.format(first22Simplify);
        first22Simplify = Double.parseDouble(first22Simplify1);
        String second22Simplify1 = format.format(Second22Simplify);
        Second22Simplify = Double.parseDouble(second22Simplify1);

        //for the negative values, do the same
        if(a == 45){
        theSecond22Values = - theSecond22Values;
        theFirst22Values1 = format.format(theFirst22Values);
        theFirst22Values = Double.parseDouble(theFirst22Values1);
        theSecond22Values1 = format.format(theSecond22Values);
        theSecond22Values = Double.parseDouble(theSecond22Values1);
        first22Simplify = theFirst22Values / firstOfTwoNumbersValue ;
        Second22Simplify = theSecond22Values / firstOfTwoNumbersValue ;
        totalThirdSimplify = first22Simplify + "/" + Second22Simplify;
        first22Simplify1 = format.format(first22Simplify);
        first22Simplify = Double.parseDouble(first22Simplify1);
        second22Simplify1 = format.format(Second22Simplify);
        Second22Simplify = Double.parseDouble(second22Simplify1);
        Second22Simplify = - Second22Simplify;
        }
        
        System.out.println();
        
        //Calculate the outputs
        System.out.println("First fractional number is " + firstNumber +" and its double value is " + fistNumber);
        System.out.println("Second fractional number is " + secondNumber +" and its double value is " + second2Number);
        System.out.println("Third fractional number is " + firstOfTwoNumbers + "/" + secondOfTwoNumbers + " and its double value is " + thirdValue);
        //display the simplified versions
        System.out.println();

        System.out.println("First fractional number is " + firstNumber + " and its simplified version is " + totalFirstSimplify);
        System.out.println("Second fractional number is " + secondNumber + " and its simplified version is " + totalSecondSimplify);
        System.out.println("Third fractional number is " +  firstOfTwoNumbers + "/" + secondOfTwoNumbers +  " and its simplified version is " + totalThirdSimplify);
        //compare the number by their greatness and display the results
        System.out.println();

        if(thirdValue > fistNumber){
            System.out.println("The third number is greater than the first one.");
        }else if(thirdValue == fistNumber){
            System.out.println("The third and first numbers are equal.");
        }else{
            System.out.println("The third number is greater than the first one.");
        }

        if(thirdValue > second2Number){
            System.out.println("The second number is greater than the third one.");
        }else if(thirdValue == second2Number){
            System.out.println("The second and third numbers are equal.");
        }else{
            System.out.println("The second number is greater than the third one.");
        }

        if(second2Number > fistNumber){
            System.out.println("The first number is greater than the second one.");
        }else if(second2Number == fistNumber){
            System.out.println("The first and second numbers are equal.");
        }else{
            System.out.println("The second number is greater than the first one.");
        }

        //addition
        //to find the addition of the three numbers, do the math and display it
        double oneplustwo = fistNumber + second2Number ; 
        double oneplusthree = fistNumber + thirdValue ; 
        double threeplustwo = thirdValue + second2Number ;  

        System.out.println();

        System.out.println(totalFirstSimplify + " + " + totalSecondSimplify + " = " + oneplustwo);
        System.out.println(totalFirstSimplify + " + " + totalThirdSimplify + " = " + oneplusthree);
        System.out.println(totalThirdSimplify + " + " + totalSecondSimplify + " = " + threeplustwo);
        System.out.println();

        //subtraction
        //do the math and display the results
        double oneminustwo = fistNumber - second2Number ; 
        double oneminusthree = fistNumber - thirdValue ; 
        double threeminustwo = thirdValue - second2Number ; 
        System.out.println(totalFirstSimplify + " - " + totalSecondSimplify + " = " + oneminustwo);
        System.out.println(totalFirstSimplify + " - " + totalThirdSimplify + " = " + oneminusthree);
        System.out.println(totalThirdSimplify + " - " + totalSecondSimplify + " = " + threeminustwo);
        System.out.println();

        //multiplication
        //do the math and display the results
        double onetimestwo = fistNumber * second2Number ; 
        double onetimesthree = fistNumber * thirdValue ; 
        double threetimestwo = thirdValue * second2Number ; 
        System.out.println(totalFirstSimplify + " * " + totalSecondSimplify + " = " + onetimestwo);
        System.out.println(totalFirstSimplify + " * " + totalThirdSimplify + " = " + onetimesthree);
        System.out.println(totalThirdSimplify + " * " + totalSecondSimplify + " = " + threetimestwo);
        System.out.println();

        //division
        //do the math and display the results
        double onedivtwo = fistNumber / second2Number ; 
        double onedivthree = fistNumber / thirdValue ; 
        double threedivtwo = thirdValue / second2Number ; 
        if(second2Number == 0){
            onedivtwo = 0;
            threedivtwo = 0;
        }
        System.out.println(totalFirstSimplify + " / " + totalSecondSimplify + " = " + onedivtwo);
        System.out.println(totalFirstSimplify + " / " + totalThirdSimplify + " = " + onedivthree);
        System.out.println(totalThirdSimplify + " / " + totalSecondSimplify + " = " + threedivtwo);
        System.out.println();
        System.out.println("The first number is ==> " + fistNumber + "\nThe second number is ==> " + second2Number + "\n The third number is ==>  " + thirdValue);



    }
}
