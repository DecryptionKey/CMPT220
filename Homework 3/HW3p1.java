/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */
import java.util.Scanner;

public class HW3p1 {
    public static void main(String[] args) {
        /*
             * This is a for loop and it was chosen because I had a rough idea of whats going to be printed. What's going to 
             * be printed back is exactally what was inputed by the user. Therefore, I set the for loop to run for the length 
             * of the user's input via ("for ( int i = 0; i < userInput.length(); i++)"). What the ".length()"/loop is doing is going 
             * through the length of/counting characters/text that was input by the user. For example, if I were to type 
             * "discrete math sucks", it would be 19 characters, including spaces. And w/o spaces it would be 17. Anyways, the next line
             * ("System.out.println(userInput.charAt(i));") is taking the input from the user (userInput), looking at the characters (charAt(i))
             * and then prints each single character on one line, since we used "i", instead of a specific number in the text. What I mean by this 
             * is if I put 1, whatever was the second letter typed in by the user would be printed for the length of chars in the text.
             * For example: input "Nye", "y" would print on a signle line 3 times. This is because the length is 3 and the count of letters
             * starts at 0. Therefore, (0,1,2) instead of (1,2,3).
             * 
             * I learned about this in CPS141 at DCC and I also referenced, w3schools because I forgot the exact syntax/code.
             * https://www.w3schools.com/java/ref_string_charat.asp & https://www.w3schools.com/java/ref_string_length.asp#gsc.tab=0
             * 
        */



        Scanner user = new Scanner(System.in);
        //Asks the user for text
        System.out.println("Enter some text");
        String userInput = user.nextLine();

            for ( int i = 0; i < userInput.length(); i++){
            System.out.println(userInput.charAt(i));
            }

        user.close();


        }
    }  