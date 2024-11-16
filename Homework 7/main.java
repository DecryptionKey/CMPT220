// I gave a working example of a student!
import java.util.Random; // Utility for random numbers
public class Main {
    public static void main(String[] args){

            //Created 5 Students
            student MelC = new student("Melissa","Senior",3.4,1343);
            student RichH = new student("Richina", "Senior", 3.7, 6714);
            student DomN = new student("Dom", "Freshman", 3.1, 2341);
            student NyeW = new student("Nye", "Junior", 4.0, 4590);
            student DunkinD = new student("Dunkin", "Sophmore", 2.9, 7723);

            //Created a method to determine if they're on HonorRoll
            System.out.println("-----------------------------");
            System.out.println("          Honor Roll         ");
            System.out.println("-----------------------------");
            System.out.println(NyeW.studentName() + " is on the Honor Roll: " + NyeW.honorRoll());
            System.out.println(RichH.studentName() + " is on the Honor Roll: " + RichH.honorRoll());
            System.out.println(MelC.studentName() + " is on the Honor Roll: " + MelC.honorRoll());
            System.out.println(DomN.studentName() + " is on the Honor Roll: " + DomN.honorRoll());
            System.out.println(DunkinD.studentName() + " is on the Honor Roll: " + DunkinD.honorRoll());

            //Created a method to determine if a random student gets FreeLunch
            System.out.println("\n-----------------------------");
            System.out.println("       Free Lunch Winner     ");
            System.out.println("-----------------------------");


            int maxID = 7800;
            int minID = 1300;
            
            Random randNUM = new Random();
            int randomWinnerID = randNUM.nextInt(maxID-minID) + minID;


            if (MelC.receivesFreeLunch(randomWinnerID)){
                System.out.println(MelC.studentName() + " gets free lunch today, yay!");
            }
            if (RichH.receivesFreeLunch(randomWinnerID)){
                System.out.println(RichH.studentName() + " gets free lunch today, yay!");
            }
            if (DomN.receivesFreeLunch(randomWinnerID)){
                System.out.println(DomN.studentName() + " gets free lunch today, yay!");
            }
            if (NyeW.receivesFreeLunch(randomWinnerID)){
                System.out.println(NyeW.studentName() + " gets free lunch today, yay!");
            }
            if (DunkinD.receivesFreeLunch(randomWinnerID)){
                System.out.println(DunkinD.studentName() + " gets free lunch today, yay!");
            }
            else {
                System.out.println("Today's Free Lunch recipient was ID: " + randomWinnerID);
            }

    }
}








