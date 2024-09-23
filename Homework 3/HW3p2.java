import java.util.Scanner;

public class HW3p2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }

     //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("\nProblem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int userNumber1 = user.nextInt();

        //here's a hint
        long factorial = 1;

        for (int i = 1; i <= userNumber1; i++){
        factorial *= i;
        } 
        System.out.println("The factorial of " + userNumber1 + " is: " + factorial);


        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("\nProblem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: "); 

        int userNumber2 = user.nextInt();
        int numbSUM = 0;
        int intialize = 0;
        //No hint! what do you need to complete this task?
        while (userNumber2 > 0){
            int number = userNumber2 % 10;

        if (intialize % 2 == 0){
            numbSUM += number;
        }
            userNumber2 /=10;
            intialize++;
        }
            System.out.println("The sum of every other number is: " + numbSUM);


        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("\nProblem 4");
        boolean run = true; 
        while (run == true){
            System.out.println("I printed once!");
            run = false;
        }
    
        user.nextLine();

        //P5: Take a string from the user and print them the reverse!
        System.out.println("\nProblem 5");
        System.out.println("Enter a word that you would like reversed: ");
        String userRevInput = user.nextLine();
        //hint
        String reverse = "";

        for (int i = userRevInput.length()-1; i >=0; i--){
            reverse += userRevInput.charAt(i);
        }
            System.out.println(reverse);

        user.close();
        

    }
}
