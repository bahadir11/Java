import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args){
        //to get input from the user use the scanner util
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how much numbers you are going to enter => ");
        //get the array lenght
        int arrayLenght = scan.nextInt();
        //create a new array in the length that you got from the user
        int[] numbers = new int[arrayLenght];
        //ask the user to enter the elements of the essay
        System.out.println("Enter the elements of the array ==>");
        int i = 0 ;
        //use a while statement to get exactly as much numbers as the length of the array
        while(i < arrayLenght){
            numbers[i] = scan.nextInt();
            i++;
        }
        //get the th smallest number from the user
        System.out.print("Please enter the which smallest number you want => ");
        int kth = scan.nextInt();
        kth -= 1;
        int counter = 0;
        int total = numbers.length;
        int theSmallestNumber = 0;
        //do a outer while loop to get the th smallest number
        while (counter <= kth) {
            //do an outer for to loop through the array and get one number
            for (int a = 0; a < total; a++)   
        {  //do an imbeded for to get another element of the array to compara the two
            for (int b = a + 1; b < total; b++)   
            {  
                if (numbers[a] > numbers[b])   
                {  
                    int aNum = 0 ;
                    aNum = numbers[a];  
                    numbers[a] = numbers[b];  
                    numbers[b] = aNum;  
                }  
            }  
        } 
        //if the counter is not th set the smallest number in the array to ten thousand to get the kth smallest number
        if (counter < kth) {
            numbers[0] = 10000;
        } 
        counter += 1;
        theSmallestNumber = numbers[0];
         
        }  
        //print out the smallest number
        System.out.println(theSmallestNumber);
    }
}

