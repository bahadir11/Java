import java.util.Scanner;
import java.text.DecimalFormat;

public class FractionalNumbers {
    
    public static void main(String[] args){
        DecimalFormat format = new DecimalFormat("0.##");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the first fractional number in string representation ==> ");
        String firstNumber = scan.nextLine();
        char firstOne = firstNumber.charAt(0);
        char secondOne = firstNumber.charAt(2);
        double firstValue = 0;
        double secondValue = 0;
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
        String first1Value = format.format(firstValue);
        firstValue = Double.parseDouble(first1Value);        
        String first2Value = format.format(secondValue);
        secondValue = Double.parseDouble(first2Value);

        double fistNumber = firstValue / secondValue;
        System.out.println("" + fistNumber + " "+  firstOne + secondOne);

        double theFirstValues = firstValue;
        double theSecondValues = secondValue; 
 
        while (firstValue != secondValue){
          if(firstValue > secondValue)
             firstValue = firstValue - secondValue;
          else
             secondValue = secondValue - firstValue;
        }      
 
       double firstSimplify = theFirstValues / firstValue ;
       double SecondSimplify = theSecondValues / firstValue ;
       String totalFirstSimplify = firstSimplify + "/" + SecondSimplify;

        //get the second fractional number
        System.out.print("Please enter the first fractional number in string representation ==> ");
        String secondNumber = scan.nextLine();
        char firstTwo = secondNumber.charAt(0);
        char secondTwo = secondNumber.charAt(2);
        double firstTwoValue = 0;
        double secondTwoValue = 0;
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
        String first2TwoValue = format.format(firstTwoValue);
        firstTwoValue = Double.parseDouble(first2TwoValue);
        String second2TwoValue = format.format(secondTwoValue);
        secondTwoValue = Double.parseDouble(second2TwoValue);

        double second2Number = firstTwoValue / secondTwoValue;
        String secondddddd = format.format(second2Number);
        second2Number = Double.parseDouble(secondddddd);

        double theFirst2Values = firstTwoValue;
        double theSecond2Values = secondTwoValue; 
 
        while (firstTwoValue != secondTwoValue){
          if(firstTwoValue > secondTwoValue)
             firstTwoValue = firstTwoValue - secondTwoValue;
          else
             secondTwoValue = secondTwoValue - firstTwoValue;
        }      
 
       double first2Simplify = theFirst2Values / firstTwoValue ;
       double Second2Simplify = theSecond2Values / firstTwoValue ;
       String totalSecondSimplify = first2Simplify + "/" + Second2Simplify;

        //get the third fractional number

        System.out.print("Please enter the third fractional number in numerator and denominator form ==> ");
        String twoNumbers = scan.nextLine();
        char firstOfTwoNumbers = twoNumbers.charAt(0);
        char secondOfTwoNumbers = twoNumbers.charAt(1);
        double firstOfTwoNumbersValue = 0;
        double secondOfTwoNumbersValue = 0;

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
        String firstOfTwoNumbersValue2 = format.format(firstOfTwoNumbersValue);
        firstOfTwoNumbersValue = Double.parseDouble(firstOfTwoNumbersValue2);
        String secondOfTwoNumbersValue2 = format.format(secondOfTwoNumbersValue);
        secondOfTwoNumbersValue = Double.parseDouble(secondOfTwoNumbersValue2);

        double thirdValue = firstOfTwoNumbersValue / secondOfTwoNumbersValue;

        double theFirst22Values = firstOfTwoNumbersValue;
        double theSecond22Values = secondOfTwoNumbersValue; 
 
        while (firstOfTwoNumbersValue != secondOfTwoNumbersValue){
          if(firstOfTwoNumbersValue > secondOfTwoNumbersValue)
          firstOfTwoNumbersValue = firstOfTwoNumbersValue - secondOfTwoNumbersValue;
          else
          secondOfTwoNumbersValue = secondOfTwoNumbersValue - firstOfTwoNumbersValue;
        }      
 
       double first22Simplify = theFirst22Values / firstOfTwoNumbersValue ;
       double Second22Simplify = theSecond22Values / firstOfTwoNumbersValue ;
       String totalThirdSimplify = first22Simplify + "/" + Second22Simplify;

        System.out.println(thirdValue);

        //Calculate the outputs
        System.out.println("First fractional number is " + firstNumber +" and its double value is " + fistNumber);
        System.out.println("Second fractional number is " + secondNumber +" and its double value is " + second2Number);
        System.out.println("Third fractional number is " + firstOfTwoNumbers + "/" + secondOfTwoNumbers + " and its double value is " + thirdValue);

        System.out.println("First fractional number is" + firstNumber + "and its simplified version is " + totalFirstSimplify);
        System.out.println("Second fractional number is" + secondNumber + "and its simplified version is " + totalSecondSimplify);
        System.out.println("Third fractional number is" +  firstOfTwoNumbers + "/" + secondOfTwoNumbers +  "and its simplified version is " + totalThirdSimplify);

        double finalThird = firstOfTwoNumbers / secondOfTwoNumbers;

        if(finalThird > fistNumber){
            System.out.println("The third number is greater than the first one.");
        }else if(finalThird == fistNumber){
            System.out.println("The third and first numbers are equal.");
        }else{
            System.out.println("The third number is greater than the first one.");
        }

        if(finalThird > second2Number){
            System.out.println("The second number is greater than the third one.");
        }else if(finalThird == second2Number){
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



    }
}
