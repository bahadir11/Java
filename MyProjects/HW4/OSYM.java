import javax.script.ScriptEngine;
import java.util.Scanner;

public class OSYM {
    Scanner scan = new Scanner(System.in);
    public void makeYKS(HighStudent highstudent, UniStudent uniStudent){
        //if the gpa is lower than 10 the student is a college student
        
        if (uniStudent.gpa < 10) {
            System.out.println("You are not allowed to enter this exam!...");
        }
        //get the scores from the user
        System.out.println("Please enter your math score ==> ");
        int mathSkill = scan.nextInt();
        System.out.println("Please enter your science score ==> ");
        int scienceSkill = scan.nextInt();
        System.out.println("Please enter your turkish score ==> ");
        int turkishSkill = scan.nextInt();
        System.out.println("Please enter your social science score ==> ");
        int socialScienceSkill = scan.nextInt();
        //create a local student
        HighStudent utkuKucuk = new HighStudent("Utku Umur", "ACIKALIN", 18, mathSkill, scienceSkill, turkishSkill,socialScienceSkill, "YFL", 92.12);  
        // HighStudent utkuKucuk = new HighStudent("Utku Umur", "ACIKALIN", 18, 86, 93, 86,81, "YFL", 92.12);   
        int mathScore = mathSkill;
        int scienceScore = scienceSkill;
        int turkishScore = turkishSkill;
        int socialScienceScore = socialScienceSkill;
        //calculate the examscore
        double examScore = 0.35 * mathScore + 0.25 * scienceScore + 0.25 *  turkishScore + 0.15 * socialScienceScore;
        double gpa = highstudent.gpa;
        
          
       //create the schools
        School tobb = new School("TOBB ETU", "Ankara",80,78,75,75);
        School bilkent = new School("Bilkent", "Ankara", 90, 93,75, 78);        
        //print the information about the student
        System.out.print("Name : " + utkuKucuk.name + " " + utkuKucuk.surname + "  Age : " + utkuKucuk.age + "  Shool : " + utkuKucuk.schoolName);
        System.out.println("\nUniversity Name : " + tobb.name + "  Location : " + tobb.location);
        System.out.println("University Name : " + bilkent.name + "  Location : " + bilkent.location);

        System.out.println("Math score ==> " + mathScore);
        System.out.println("Science score ==> " + scienceScore);
        System.out.println("Turkish score ==> " + turkishScore);
        System.out.println("Social science score ==> " + socialScienceScore);
        //get the final score and call the evaluate application constructor
        double finalScore = 0.8 * examScore + 0.2 * highstudent.gpa;
        EvaluateApplication1 highSchoolApplicationResult = new EvaluateApplication1(finalScore,0,0  ,gpa);
        
    }
    double QuantativeScore;
    public void makeAles(UniStudent uniStudent,HighStudent highStudent){
        if (highStudent.scienceSkill > 0) {
            System.out.println("You are not allowed to enter this exam!...");
        }
        //get the exam results from the user
        System.out.println("Please enter your ALES math results => ");
        int mathSkill = scan.nextInt();        
        System.out.println("Please enter your ALES turkish results => ");
        int turkishSkill = scan.nextInt();       
         System.out.println("Please enter your YDS results => ");
        int englishSkill = scan.nextInt();
        int mathScore = mathSkill;
        int turkishScore = turkishSkill;
        int englishScore = englishSkill;
        // UniStudent utkuBuyuk = new UniStudent("Utku Umur", "ACIKALIN", 23, 95, 90, 95, "TOBB ETU", 3.74);
        System.out.println("Math Score is : " + mathScore + " Turkish Score is : " + turkishScore + "\nYDS Score is : " + englishScore);
        //calculate the quantative score
        QuantativeScore = 0.75 * mathScore + 0.25 * turkishScore;      
    }
    int englishScore;
    public void makeYDS(UniStudent uniStudent, HighStudent highStudent){
        if (highStudent.scienceSkill > 0) {
            System.out.println("You are not allowed to enter this exam!...");
        }
        double gpa = uniStudent.gpa;
        englishScore = uniStudent.englishSkill;
        //create a uni student
        UniStudent utkuBuyuk = new UniStudent("Utku Umur", "ACIKALIN", 23, 95, 90, 95, "TOBB ETU", 3.74);
        School tobb = new School("TOBB ETU", "Ankara",80,78,75,75);
        School bilkent = new School("Bilkent", "Ankara", 90, 93,75, 78);        
        //print out the information about the student
        System.out.print("Name : " + utkuBuyuk.name + " " + utkuBuyuk.surname + "  Age : " + utkuBuyuk.age + "  Shool : " + utkuBuyuk.schoolName);
        System.out.println("\nUniversity Name : " + tobb.name + "  Location : " + tobb.location);
        System.out.println("University Name : " + bilkent.name + "  Location : " + bilkent.location);
        EvaluateApplication uniApplicationEvaluate = new EvaluateApplication(0, QuantativeScore, englishScore,gpa);
    }
    public OSYM(UniStudent uniStudent,HighStudent highStudent){
    //call the exam making methods
    makeAles(uniStudent,highStudent);
    makeYDS(uniStudent, highStudent);
    makeYKS(highStudent,uniStudent);
    }
    

}
