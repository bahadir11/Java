import java.util.Scanner;

public class superdigit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number => ");
        int number = scan.nextInt();
        int result = doMath(number);
        System.out.println("The result is : " + result);
        

    }

    public static int doMath(int a){
        String stringA = Integer.toString(a);
        int counter = stringA.length();
        int i = 0;
        int result = 0;
        while(i < counter){
            
            int add = stringA.charAt(i);
            add = Character.getNumericValue(add);
            result += add;
            i += 1;
        }
        return(result);

    }
    
}
