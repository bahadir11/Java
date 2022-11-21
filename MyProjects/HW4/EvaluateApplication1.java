public class EvaluateApplication1 {
    public EvaluateApplication1(double finalScore, double QuantativeScore, double englishScore,double gpa){
        //if final score is not equal to 0 the student goes to highshcool
        if(finalScore != 0){
        //create the tobb and bilkent school objects and give them parameters
            
        School tobb = new School("TOBB ETU", "Ankara",80,78,75,75);
            
        School bilkent = new School("Bilkent", "Ankara", 90, 93,75, 78);
        //set the minimum entering scores to local variables
        int tobbMinCS = tobb.minimumUndergraduateComputerEngineeringScore; 
        int tobbMinEE = tobb.minimumUndergraduateElectronicEngineeringScore; 
        int tobbMinME = tobb.minimumUndergraduateMechanicalEngineeringScore; 
        int tobbMinIE = tobb.minimumUndergraduateIndustrialEngineeringScore; 

        int bilkentMinCS = bilkent.minimumUndergraduateComputerEngineeringScore;
        int bilkentMinEE = bilkent.minimumUndergraduateElectronicEngineeringScore;
        int bilkentMinME = bilkent.minimumUndergraduateMechanicalEngineeringScore;
        int bilkentMinIE = bilkent.minimumUndergraduateIndustrialEngineeringScore;
        //determine which undergraduate program did the person got accepted to and which ones rejected the student
        if(finalScore > tobbMinCS) {  
            System.out.println("You have been accepted to TOBB Computer Engineering.");
        }else{
            System.out.println("You have been rejected...");
        }
        if(finalScore > tobbMinEE) {  
            System.out.println("You have been accepted to TOBB Electronic Engineering.");
        }else{
            System.out.println("You have been rejected...");
        }
    
        if(finalScore > tobbMinME) {  
            System.out.println("You have been accepted to TOBB Mechanical Engineering.");
        }else{
            System.out.println("You have been rejected...");
        }


        if(finalScore > tobbMinIE) {  
            System.out.println("You have been accepted to TOBB Industrial Engineering.");
        }else{
            System.out.println("You have been rejected...");
        }


        if(finalScore > bilkentMinCS) {  
            System.out.println("You have been accepted to Bilkent Computer Engineering.");
        }else{
            System.out.println("You have been rejected...");
        }
        if(finalScore > bilkentMinEE) {  
            System.out.println("You have been accepted to Bilkent Electronic Engineering.");
        }else{
            System.out.println("You have been rejected...");
        }
    
        if(finalScore > bilkentMinME) {  
            System.out.println("You have been accepted to Bilkent Mechanical Engineering.");
        }else{
            System.out.println("You have been rejected...");
        }


        if(finalScore > bilkentMinIE) {  
            System.out.println("You have been accepted to Bilkent Industrial Engineering.");
        }else{
            System.out.println("You have been rejected...");
        }
        System.out.println("You cannot apply to graduate programs!...");

        
}}}
