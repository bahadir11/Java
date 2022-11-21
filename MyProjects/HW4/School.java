public class School {
    //initialize the parameters
    String name;
    String location;
    int minimumUndergraduateComputerEngineeringScore;
    int minimumUndergraduateElectronicEngineeringScore;
    int minimumUndergraduateIndustrialEngineeringScore;
    int minimumUndergraduateMechanicalEngineeringScore;
    //create the school method in the school class
    public School(String name, String location,int minimumUndergraduateComputerEngineeringScore,int minimumUndergraduateElectronicEngineeringScore,int minimumUndergraduateMechanicalEngineeringScore,int minimumUndergraduateIndustrialEngineeringScore){
        //set the parameters to the ones we initialized
        this.name = name;
        this.location = location ;
        this.minimumUndergraduateComputerEngineeringScore = minimumUndergraduateComputerEngineeringScore;
        this.minimumUndergraduateElectronicEngineeringScore = minimumUndergraduateElectronicEngineeringScore;
        this.minimumUndergraduateIndustrialEngineeringScore = minimumUndergraduateIndustrialEngineeringScore;
        this.minimumUndergraduateMechanicalEngineeringScore = minimumUndergraduateMechanicalEngineeringScore;
    }
}
