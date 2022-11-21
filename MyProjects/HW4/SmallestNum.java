import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how much numbers you are going to enter => ");
        int arrayLenght = scan.nextInt();
        
        int[] numbers = new int[arrayLenght];

        System.out.println("Enter the elements of the array ==>");
        int i = 0 ;
        while(i < arrayLenght){
            numbers[i] = scan.nextInt();
            i++;
        }
        
        System.out.print("Please enter the which smallest number you want => ");
        int kth = scan.nextInt();
        kth -= 1;
        int counter = 0;
        int total = numbers.length;
        int theSmallestNumber = 0;
        
        while (counter <= kth) {
            for (int a = 0; a < total; a++)   
        {  
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
        if (counter < kth) {
            numbers[0] = 10000;
        } 
        counter += 1;
        theSmallestNumber = numbers[0];
         
        }  
        
        System.out.println(theSmallestNumber);
    }
}

