public class EvaluateApplication {
    public EvaluateApplication(double finalScore, double QuantativeScore, double englishScore,double gpa){

            
        if(QuantativeScore != 0 ){


            if(QuantativeScore >= 85 && englishScore >= 75 && gpa >= 2.5 )
            {
                System.out.println("You have been accepted to the graduate program!!!");
                System.out.println("You cannot apply to undergraduate programs!...");
                System.out.println("");
                System.out.println("");

            }else{
                System.out.println("You have been rejected to enter the graduate program :(");
                System.out.println("You cannot apply to undergraduate programs!...");

                System.out.println("");
                System.out.println("");

            }
        }
       
}}
