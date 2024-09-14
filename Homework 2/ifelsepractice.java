//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
                public class ifelsepractice {
                public static void main(String[] args) {  

                Scanner user = new Scanner(System.in);
                  
               // A int called "userScore" to hold the users score.
                int userScore = 0;

                // A int called "scoreSUM" to hold the sum of the user scores.
                int scoreSUM = 0;


                //WELCOME MESSAGE
                System.out.println("Welcome to the quiz!\n");


                //FIRST QUESTION    
                System.out.println("What is 5 + 1?");

                //A int called "userInput1" to store the user input.
                int userInput1 = user.nextInt();
                //A int called "solution1" to hold the correct answer.
                int solution1 = 6;



                    //This will provide the user with a message determining the correctness of their answer.
                    if (userInput1 == solution1){
                        System.out.println("Correct!\n");
                        userScore++;
                        System.out.println("Score: " + userScore + "/3\n");
                        scoreSUM++;                 
                    } else {
                        System.out.println("Incorrect!\n");
                        System.out.println("Score: " + userScore + "/3\n");
                        scoreSUM++;
                    }


                //SECOND QUESTION    
                System.out.println("What is 5000 / 10?");

                //A integer called "userInput2" to store the user input.
                int userInput2 = user.nextInt();
                //A integer called "solution2" to hold the correct answer.
                int solution2 = 500;

                    //This will provide the user with a message determining the correctness of their answer.
                    if (userInput2 == solution2){
                        System.out.println("Correct!\n");
                        userScore++;
                        System.out.println("Score: " + userScore + "/3\n");
                        scoreSUM++;                 
                    } else {
                        System.out.println("Incorrect!\n");
                        System.out.println("Score: " + userScore + "/3\n");
                        scoreSUM++;
                    }   


                //THIRD QUESTION   
                System.out.println("What is 0 * 1?");

                //A integer called "userInput3" to store the user input.
                int userInput3 = user.nextInt();
                //A integer called "solution3" to hold the correct answer.
                int solution3 = 0;

                    //This will provide the user with a message determining the correctness of their answer.
                    if (userInput3 == solution3){
                        System.out.println("Correct!\n");
                        userScore++;
                        System.out.println("Score: " + userScore + "/3\n");
                        scoreSUM++;                 
                    } else {
                        System.out.println("Incorrect!\n");
                        System.out.println("Score: " + userScore + "/3\n");
                        scoreSUM++;
                    }
                    
                        System.out.println("Final Score: " + userScore + "/3");
                    
                user.close();

               
                }
    }
