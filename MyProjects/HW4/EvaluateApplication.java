public class EvaluateApplication {
    public EvaluateApplication(double finalScore, double QuantativeScore, double englishScore,double gpa){

        //if quantative score is not zero that means the student goes to university
        if(QuantativeScore != 0 ){

                //if the scores pass the min values the person gets accepted to the graduate programs
            if(QuantativeScore >= 85 && englishScore >= 75 && gpa >= 2.5 )
            {
                //print the good news
                System.out.println("You have been accepted to the graduate program!!!");
                System.out.println("You cannot apply to undergraduate programs!...");
                System.out.println("");
                System.out.println("");

            }else{
                //print the bad news
                System.out.println("You have been rejected to enter the graduate program :(");
                System.out.println("You cannot apply to undergraduate programs!...");

                System.out.println("");
                System.out.println("");

            }
        }
       
}}
