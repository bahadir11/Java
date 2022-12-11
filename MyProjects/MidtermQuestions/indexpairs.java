import java.util.Scanner;

public class indexpairs {
    public static void main(String[] args){
        System.out.println("Please enter the size of the array =>");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println("Enter the array elements =>");
        int[] array = new int[size];
        int i=0;
        while(i < size){
            int a = scan.nextInt();
            array[i] = a;
            i++;
        }
        int a = 1 ;
        int b = 0 ;
        int result = 0 ;
        int c = size - 1 ; 
        while(a < size){
            
            int sum = array[a] + array[b];
            if(sum % 5 == 0){
                result += 1;
            }

            a++;
            b++;
    
       
        }
        System.out.println("Result : " + result);


    }
}
