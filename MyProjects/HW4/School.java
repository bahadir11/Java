public class School {
    String name;
    String location;
    int minimumUndergraduateComputerEngineeringScore;
    int minimumUndergraduateElectronicEngineeringScore;
    int minimumUndergraduateIndustrialEngineeringScore;
    int minimumUndergraduateMechanicalEngineeringScore;
    public School(String name, String location,int minimumUndergraduateComputerEngineeringScore,int minimumUndergraduateElectronicEngineeringScore,int minimumUndergraduateMechanicalEngineeringScore,int minimumUndergraduateIndustrialEngineeringScore){
        this.name = name;
        this.location = location ;
        this.minimumUndergraduateComputerEngineeringScore = minimumUndergraduateComputerEngineeringScore;
        this.minimumUndergraduateElectronicEngineeringScore = minimumUndergraduateElectronicEngineeringScore;
        this.minimumUndergraduateIndustrialEngineeringScore = minimumUndergraduateIndustrialEngineeringScore;
        this.minimumUndergraduateMechanicalEngineeringScore = minimumUndergraduateMechanicalEngineeringScore;
    }
}
