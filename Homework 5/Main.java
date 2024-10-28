/*
Referencing your homework from https://github.com/melissachodziutko/CMPT220/blob/main/Homework%203/LoopsDebug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("\nProblem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int userNumber1 = sc.nextInt();
        printFactorial(userNumber1);

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("\nProblem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: "); 
        int userNumber2 = sc.nextInt();
        sc.nextLine();
        printEveryOtherDigit(userNumber2);

        //P5: Take a string from the user and print them the reverse!
        System.out.println("\nProblem 5");
        System.out.println("Enter a word that you would like reversed: ");
        String userRevInput = sc.nextLine();
        printReverse(userRevInput);
      
    }
  
public static void printFactorial(int userNumber1){
        int factorial = 1;

        for (int i = 1; i <= userNumber1; i++){
        factorial *= i;
        } 
        System.out.println("The factorial of " + userNumber1 + " is: " + factorial);
    }   

public static void printEveryOtherDigit(int userNumber2){
        int numbSUM = 0;
        int intialize = 0;

        while (userNumber2 > 0){
            int number = userNumber2 % 10;

        if (intialize % 2 == 0){
            numbSUM += number;
        }
            userNumber2 /=10;
            intialize++;
        }
            System.out.println("The sum of every other number is: " + numbSUM);
    }

public static void printReverse(String userRevInput){
    String reverse = "";

    for (int i = userRevInput.length()-1; i >=0; i--){
        reverse += userRevInput.charAt(i);
    }
        System.out.println(reverse);
    }
}
