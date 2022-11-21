public class UniStudent {
    String name;
    String surname;
    int age;
    int mathSkill;
    int turkishSkill;
    int englishSkill;
    int scienceSkill;
    int socialScienceSkill;
    String schoolName;
    double gpa;
    public UniStudent(String name,String surname,int age,int mathSkill,int turkishSkill,int englishSkill,String schoolName,double gpa){
    if (this.gpa > 4) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mathSkill = mathSkill;
        this.turkishSkill = turkishSkill;
        this.englishSkill = englishSkill;
        this.schoolName = schoolName;
        this.gpa = gpa;
    }else {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mathSkill = mathSkill;
        this.turkishSkill = turkishSkill;
        this.englishSkill = englishSkill;
        this.schoolName = schoolName;
        this.gpa = gpa;
    }

        
    }
}
