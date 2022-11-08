import java.util.Scanner;
import java.util.ArrayList;

public class example{
    public static int add(){
        int a = 85;
        int b = 128;
        return(a + b);

    }
    public static String say(){
       String a = "The result is " + add();
       return(a);
    }
    public static void main(String[] args){
        System.out.println(say());
        ArrayList array = new ArrayList<String>();
        array.add("monkey");
        array.add("7");
        array.add('7');
        array.add('7');
        array.add('7');
        String a = array[0];

        System.out.println(a);

    }


}