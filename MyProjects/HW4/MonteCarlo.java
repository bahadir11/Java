import java.util.Random;
public class MonteCarlo {

    public static void main(String[] args){
        //set the side lenght of the square
        int squareSide = 2;
        //to get more accurate results multiply the sides with 10000
        int height = squareSide * 10000;
        Random rand = new Random();
        //set the center values
        int xCenter = 10000;
        int yCenter = 10000;
        int m  = 0;
        int n = 0;
        //to make 1000000000 dots use the while loop
        while(n <= 1000000000){
            //create random numbers
            int xValue = rand.nextInt(height);
            int yValue = rand.nextInt(height);
            //to calculate if the dot is in the circle, sutract the circles center values from the dots x and y values and get them squared if the point distance is bigger than 10000000 the dot is not inside the circle if it is 1000000 it is at the edge of the circle
            double a = Math.abs(xCenter - xValue);
            double b = Math.abs(yCenter - yValue);
            double pointDistance = a*a + b*b;
            if (pointDistance < 100000000) {
                m += 1;
            }
            if(n == 100){
                //calculate pi and print it
                double pi = 4 * (double)m / (double)n; 
                System.out.println(n + " : " + pi);
            }
            if(n == 10000){
                //calculate pi and print it
                double pi = 4 * (double)m / (double)n; 

                System.out.println(n + " : " + pi);
            }
            if(n == 1000000){
                //calculate pi and print it

                double pi = 4 * (double)m / (double)n; 

                System.out.println(n + " : " + pi);
            }            
            if(n == 100000000){
                //calculate pi and print it

                double pi = 4 * (double)m / (double)n; 
                System.out.println(n + " : " + pi);
            }
            if(n ==  1000000000){
                //calculate pi and print it

                double pi = 4 * (double)m / (double)n; 
  
                System.out.println(n + " : " + pi);
                break;
            }
            
            n += 1;
            
        }

    }
}