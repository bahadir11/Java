import java.lang.reflect.Constructor;

public class Main1 {    
                
    public static void main(String[] args) {
        //create a student object using the UniStudent and HighStudent class

        UniStudent utkuBuyuk = new UniStudent("Utku Umur", "ACIKALIN", 23, 95, 90, 95, "TOBB ETU", 3.74);
        HighStudent utkuKucuk = new HighStudent("Utku Umur", "ACIKALIN", 18, 90, 90, 85,80, "YFL", 92.12);      
        //create an osym object 
        OSYM osym = new OSYM(utkuBuyuk, utkuKucuk);
        
    }



}
