import java.util.Scanner;
import java.util.Random;

public class busCompany{
    public static class Bus{
        String make;
        String type;
        int model;
        int age;
        int capacity;
        int remainingCapacity;
        Bus bus;
        
        public Bus(String make,String type, int model, int age,int capacity, int remainingCapacity){
            this.make = make;
            this.type = type;
            this.model = model;
            this.age = age;
            this.capacity = capacity;
            this.remainingCapacity = remainingCapacity;
        } 
        public static boolean doesSeatExist(String seatChar, int seatNum, String[] seatArray){
            int a = seatArray.length;
            boolean b = false;
            if(seatNum > a){
                b = false;

            }else{
               b = true;
            }
           return(b); 
            
        }
        public static boolean isSeatEmpty(String seatChar, int seatNum, String[] seatArray){
            boolean b = true;
            if (seatArray[seatNum] == ".") {
                b = true;
            }else if(seatArray[seatNum] == "T"){
                b = false;
            }


            return(b);
        }
        public static boolean fillSeat(String seatChar, int seatNum, String[] seatArray){
            boolean b = true;
            seatArray[seatNum] = "T";

            return(true);
        }
        public static boolean emptySeat(String seatChar, int seatNum, String[] seatArray){
            boolean b = true;
            seatArray[seatNum] = ".";

            return(true);
        }
        public static int numberOfEmptySeats(Bus bus){
            bus = bus;
            int remainingCapacity = bus.remainingCapacity;
            return(remainingCapacity);
        }
        public static void BusInformation(Bus bus){
            bus = bus;
            System.out.println("    Bus Information:");
            System.out.println("        Bus: " + bus.make);
            System.out.println("        Type: " + bus.type);
            System.out.println("        Age: " + bus.age);
            System.out.println("        Capacity: " + bus.capacity);  
            System.out.println("        Remaining Capacity: " + bus.remainingCapacity);  
        }
        public static int[] fillSeats(Bus bus){
            Random rand = new Random();
            int a = bus.capacity;
            int b = bus.remainingCapacity;
            int takenSeats = a - b;

            int[] arrayForTakenSeats = new int[a];
            int i = 0;
            int y = 0; 
            while(y < a){
                arrayForTakenSeats[y] = 0;
                y++;
            }
            while(i <= takenSeats){
                int c = rand.nextInt(a);
                arrayForTakenSeats[c] = c;
                i++;
            }
           
            return(arrayForTakenSeats);

            

        }
        public static String[] printSeats(Bus bus){
            int[] arrayToPrintSeats = Bus.fillSeats(bus);
            int a = bus.capacity;
            String[] stringArrayToPrintString = new String[a];
            int i = 0;
            while(i < a){
                if(arrayToPrintSeats[i] == 0){
                    stringArrayToPrintString[i] = ".";
                }else{
                    stringArrayToPrintString[i] = "T";
                }
                i++;
            }

            
            if(bus.type == "2+1"){
                System.out.println("    A B  C");
                int x = 0;
                int y = a/3 ;
                int vv = 0;
                while(x < y){
                    System.out.print(x+1 + "   ");
                    int z = 0;
                    while(z < 3){
                        if(vv >= stringArrayToPrintString.length){
                            break;
                        }
                        System.out.print(stringArrayToPrintString[vv + z] + " ");
                        z++;

                        if(z == 3){
                        System.out.println(" ");
                        }
                    }
                    x++;
                    vv += 3;
                    
                }
                
                
            }else if(bus.type == "2+2"){
                System.out.println("    A B C D");
                int x = 0;
                int y = a/4 ;
                int vv = 0;
                int z = 0;
                while(x < y){
                    System.out.println(" ");
                    System.out.print(x+1 + "   ");
                    z = 0;
                    while(z < 4){
                        
                        if(vv >= stringArrayToPrintString.length){
                            break;
                        }
                        System.out.print(stringArrayToPrintString[vv + z] + " ");

                        z++;

                        
                    
                    }  
                    x++;
                    vv = vv + 4;
                }
            }
            return(stringArrayToPrintString);
            

        }
    }
    public static class Trip{
        String origin;
        String destination;
        String departureTime;
        String arrivalTime;
        String date;
        Bus bus;
        Trip(String origin, String destination, String departureTime, String arrivalTime, String date ,Bus bus){
            this.origin = origin;
            this.destination = destination;
            this.departureTime = departureTime;
            this.arrivalTime = arrivalTime;
            this.date = date;
            this.bus = bus;
        }
        public static void TripInformation(Trip trip){
            trip = trip;
            System.out.println("Trip Information:");
            System.out.println("    Date: " + trip.date);
            System.out.println("    From: " + trip.origin + " to: " + trip.destination);
            System.out.println("    Trip time: " + trip.departureTime + "-" + trip.arrivalTime);
        }
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Bus bus1 = new Bus("Setra","2+2",2015,8,40,23);
        Bus bus2 = new Bus("Setra", "2+1", 2018, 5, 36, 11);
        Bus bus3 = new Bus("Neoplan", "2+1", 2021, 2, 48, 38);
        Bus bus4 = new Bus("Travego","2+2", 2008, 15, 36, 14);
        Bus bus5 = new Bus("Setra", "2+1", 2008, 15, 36, 8);
        Trip trip1 = new Trip("Ankara", "Istanbul", "00:15", "06:30", "27/11/2022", bus1);
        Trip trip2 = new Trip("Ankara", "Mersin", "13:00", "20:00", " 27/11/2022", bus2);
        Trip trip3 = new Trip("Istanbul", "Ankara", "07:00", "13:30", "27/11/2022", bus3);
        Trip trip4 = new Trip("Mersin", "Ankara", "17:00", "00:00", "27/11/2022", bus4);
        Trip trip5 = new Trip("Istanbul", "Mersin", "00:15", "12:30", "27/11/2022", bus5);

        
        busCompany.Trip.TripInformation(trip1);
        busCompany.Bus.BusInformation(bus1);
        System.out.println(" ");

        busCompany.Trip.TripInformation(trip2);
        busCompany.Bus.BusInformation(bus2);
        System.out.println(" ");

        busCompany.Trip.TripInformation(trip3);
        busCompany.Bus.BusInformation(bus3);
        System.out.println(" ");

        busCompany.Trip.TripInformation(trip4);
        busCompany.Bus.BusInformation(bus4);
        System.out.println(" ");

        busCompany.Trip.TripInformation(trip5);
        busCompany.Bus.BusInformation(bus5);
        System.out.println("  ");
        System.out.println("Do you want to buy a ticket or cancel it (enter 1 to buy, press any key to cancel your ticket)");
        int choiceOfBuy = scan.nextInt();
        if(choiceOfBuy == 1){

        
        
        System.out.println("Please choose which trip you want to take(Enter the number of the trip)");
        int choice = scan.nextInt();

        Bus busChoice = bus1;
        Trip tripChoice = trip1;

        if(choice == 1){
            tripChoice = trip1;
            busChoice = bus1;
        }
        else if(choice == 2){
            tripChoice = trip2;
            busChoice = bus2;
        }
        else if(choice == 3){
            tripChoice = trip3;
            busChoice = bus3;
        }
        else if(choice == 4){
            tripChoice = trip4;
            busChoice = bus4;
        }
        else if(choice == 5){
            tripChoice = trip5;
            busChoice = bus5;
        }
        else{
            System.out.print("You have entered an incorrect input, please restart the program!!!");
        }

        //busCompany.Bus.printSeats(busChoice);

        String[] seatArray = busCompany.Bus.printSeats(busChoice);
        

        System.out.println("  ");
        System.out.println("Please enter the seat you choose(exp. B 23 ) ==> ");
        String userSeatChar = scan.next();
        int userSeatNumber = scan.nextInt();

        boolean doesSeatExist = busCompany.Bus.doesSeatExist(userSeatChar, userSeatNumber,seatArray);
        boolean isSeatEmptyCheck = true;
        if (doesSeatExist) {
            isSeatEmptyCheck = busCompany.Bus.isSeatEmpty(userSeatChar, userSeatNumber, seatArray);
            
        }else{
            System.out.println("The seat you have entered does not exist, please restart the program!!!");
        }
        boolean seatIsEmpty = true;
        if(isSeatEmptyCheck){
            seatIsEmpty = busCompany.Bus.fillSeat(userSeatChar, userSeatNumber, seatArray);
            if(seatIsEmpty){
                System.out.println("We have successfully reserved your seat, have a nice trip!!!");
        }
        }else{
            System.out.println("This seat is taken!!!");;
        }
        
        
    
    
    
    
    }else{
        
        System.out.println("Please choose which trip you want to cancel(enter the number of the trip)");
        int choice = scan.nextInt();

        Bus busChoiceToCancel = bus1;
        Trip tripChoiceToCancel = trip1;

        if(choice == 1){
            tripChoiceToCancel = trip1;
            busChoiceToCancel = bus1;
        }
        else if(choice == 2){
            tripChoiceToCancel = trip2;
            busChoiceToCancel = bus2;
        }
        else if(choice == 3){
            tripChoiceToCancel = trip3;
            busChoiceToCancel = bus3;
        }
        else if(choice == 4){
            tripChoiceToCancel = trip4;
            busChoiceToCancel = bus4;
        }
        else if(choice == 5){
            tripChoiceToCancel = trip5;
            busChoiceToCancel = bus5;
        }
        else{
            System.out.print("You have entered an incorrect input, please restart the program!!!");
        }
        //busCompany.Bus.printSeats(busChoiceToCancel);

        String[] seatArray = busCompany.Bus.printSeats(busChoiceToCancel);

        System.out.println("  ");
        System.out.println("Please enter the seat you want to cancel (exp. B 23 ) ==> ");
        String userSeatChar = scan.next();
        int userSeatNumber = scan.nextInt();
       

        boolean doesSeatExist = busCompany.Bus.doesSeatExist(userSeatChar, userSeatNumber,seatArray);
        boolean isSeatEmptyCheck = true;
        if (doesSeatExist) {
            isSeatEmptyCheck = busCompany.Bus.isSeatEmpty(userSeatChar, userSeatNumber, seatArray);
            
        }else{
            System.out.println("The seat you have entered does not exist, please restart the program!!!");
        }
        boolean seatIsEmpty = true;
        if(isSeatEmptyCheck == false){
            seatIsEmpty = busCompany.Bus.emptySeat(userSeatChar, userSeatNumber, seatArray);
        }else{
            System.out.println("This seat is empty!!!");;
        }
        if(seatIsEmpty){
            System.out.println("We have successfully cancelled your seat, please consider a good trip with us another time!!!");
        }


        


    }
        
        
        


        
    }
}
