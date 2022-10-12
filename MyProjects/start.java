import java.util.Scanner ;

public class start {
    public static void converter() {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program is a converter. To convert from f to c enter 1. To convert from c to f enter 2.");
        int choice = scan.nextInt();
        if (choice == 1) {
            System.out.println("Please enter the degrees in fahreneit to convert to celcius.");
            Double fah = scan.nextDouble();
            Double cel = (fah-32)*5/9;
            System.out.println("Result => " + cel);
            System.out.println("If you want to continue press 1, else press any other key.");
            int choice1 = scan.nextInt();
            if (choice1 == 1) {
                converter();
            }
                
            
        }else if (choice == 2) {
            System.out.println("Please enter the degrees in  celcius to convert to fahreneit.");
            Double cell = scan.nextDouble();
            Double fahh = (cell*9/5) + 32;
            System.out.println("Result => " + fahh);
            System.out.println("If you want to continue press 1, else press any other key.");
            int choice1 = scan.nextInt();
            if (choice1 == 1) {
                converter();
            }
        }
        else{
           System.out.println("You have entered a wrong value!!!");
           converter();
        }
    }
    public static void main(String[] args){
        converter();
    }
}