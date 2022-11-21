import java.util.Random;
public class MonteCarlo {

    public static void main(String[] args){
        int squareSide = 2;
        int height = squareSide * 10000;
        Random rand = new Random();
        int xCenter = 10000;
        int yCenter = 10000;
        int m  = 0;
        int n = 0;
        while(n <= 1000000000){
            int xValue = rand.nextInt(height);
            int yValue = rand.nextInt(height);
            double a = Math.abs(xCenter - xValue);
            double b = Math.abs(yCenter - yValue);
            double pointDistance = a*a + b*b;
            if (pointDistance < 100000000) {
                m += 1;
            }
            if(n == 100){
                double pi = 4 * (double)m / (double)n; 
                System.out.println(n + " : " + pi);
            }
            if(n == 10000){

                double pi = 4 * (double)m / (double)n; 

                System.out.println(n + " : " + pi);
            }
            if(n == 1000000){

                double pi = 4 * (double)m / (double)n; 

                System.out.println(n + " : " + pi);
            }            
            if(n == 100000000){
                double pi = 4 * (double)m / (double)n; 
                System.out.println(n + " : " + pi);
            }
            if(n ==  1000000000){
                double pi = 4 * (double)m / (double)n; 
  
                System.out.println(n + " : " + pi);
                break;
            }
            
            n += 1;
            
        }

    }
}