import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class evenArray {
    
    public static void main(String[] args){
        System.out.println("Enter how long the array is =>");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] array1 = new int[a];
        System.out.println("Enter the array elements :");
        for(int i = 0;i < a ; i++){
            int b = scan.nextInt();
            array1[i] = b;
        }
        System.out.println("Please enter the number you want to find my nigga!!!");
        int k = scan.nextInt();
        int i = 0 ;
        int m = 0 ;
        while(i < a){
            if( i%2 == 0){
                if(array1[i] != k){
                    m += 1;
                }
            }
            i++ ; 
        }
        System.out.println(m);


    }
}
