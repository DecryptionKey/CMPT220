import java.io.*;
import java.util.*;

public class RandomQuizGame {
    public static void main(String[] args) throws Exception {
        RandomQuizGame start = new RandomQuizGame();
        start.launchQuiz();
    }
//Established my variables and methods to return them
    public class Question{
        String questionText;
        String [] choices;
        int correctAnswer;

    public Question(String qText, String[] qChoices, int correctChoice){
        questionText = qText;
        choices = qChoices;
        correctAnswer = correctChoice;
    }

    public String getQuestionText(){
        return questionText;
    }

    public String [] getChoices(){
        return choices;
    }

    public int getCorrectAnswer(){
        return correctAnswer;
    }
}
//Made Lists to hold the questions to be asked and the results from the user's choice
List<Question> questionBank = new ArrayList<>();
List <String> userResults = new ArrayList<>();

//Method for calling the questions, along with their solutions (Question Bank)
public void getQuestionBank(){
    //Q1
    questionBank.add(new Question("Who was the first president of the United States?", 
    new String[]{"1. Thomas Jefferson","2. George Washington","3. Bill Clinton", "4. Chris Hemsworth"}, 2));
    //Q2
    questionBank.add(new Question("Who is known as the ''King of Pop'' ?", 
    new String[]{"1. Prince","2. Elvis Presley","3. Louis Armstrong", "4. Michael Jackson"}, 4));
    //Q3
    questionBank.add(new Question("Which company developed the first iPhone?", 
    new String[]{"1. App1e ","2. Samsung ","3. Apple", "4. Google"}, 3));
    //Q4
    questionBank.add(new Question("What is the chemical symbol for Water?", 
    new String[]{"1. H2O","2. O2","3. CO2", "4. AH"}, 1));
    //Q5
    questionBank.add(new Question("Who is the Greek god of the sea?", 
    new String[]{"1. Zeus","2. Apollo","3. Hermes", "4. Poseidon"}, 4));
    //Q6
    questionBank.add(new Question("What Century are we currently in (as of November 2024)?", 
    new String[]{"1. 22nd","2. 18th","3. 21st", "4. 15th"}, 3));
    //Q7 (Pulled this from my Discrete Math quiz)
    questionBank.add(new Question("Bill has three one-piece jumpsuits" + "," + " five pairs of work pants" + "," + "and eight work shirts."
                                + " He wears either a jumpsuit or pants and a shirt to work. How many different possible outfits does he have?",
    new String[]{"1. 16","2. 43","3. 1673", "4. 120"}, 2));
    //Q8
    questionBank.add(new Question("Which of these NBA Players is labeled the ''King''?", 
    new String[]{"1. Stephen Curry","2. LeBron James","3. Michael Jordan", "4. Kobe Bryant"}, 2));
    //Q9
    questionBank.add(new Question("What is the capital city of New York?", 
    new String[]{"1. Toronto","2. Westchester","3. Albany", "4. Time Square"}, 3));
    //Q10
    questionBank.add(new Question(
    "What will the following code output?\n" +
    "\n" +
    "public class Main {\n" +
    "    public static void main(String[] args) {\n" +
    "        String str = \"Hello\";\n" +
    "        str += \" World\";\n" +
    "        str = str.substring(0, 5);\n" +
    "        System.out.println(str);\n" +
    "    }\n" +
    "}\n",
    new String[]{"1. Hello", "2. World", "3. str", "4. Hello World"},1));
}


//Method for launching the quiz and displaying the final score
public void launchQuiz(){
    getQuestionBank();
    int score = 0;

    System.out.println("Welcome to the Random Quiz!\n");
    for (int i = 0; i < questionBank.size(); i++) {
        Question currentQuestion = questionBank.get(i);
        int userResponses = displayQuestions(currentQuestion, i + 1);

        if (userResponses == currentQuestion.getCorrectAnswer()){
            System.out.println("✓\n");
            score++;
            userResults.add("Question " + (i + 1) + ": Correct");  
        } else {
            System.out.println("✗ -- The correct answer was: " + currentQuestion.getChoices()[currentQuestion.getCorrectAnswer()-1] + "\n");
            userResults.add("Question " + (i + 1) + ": Wrong");
        }
    }
    
    System.out.println("Congrats! You scored: " + score + "/" + questionBank.size());
    printScore(score);
}


//Method to read and sanitize the player's input
public int displayQuestions(Question question, int questionNumber){
    Scanner userInput = new Scanner(System.in);
    int userAnswer = -1;

    System.out.println("Question " + questionNumber + ": " + question.getQuestionText());
        String[] choices = question.getChoices();
            for (String choice : choices){
                System.out.println(choice);
            }      
        while (userAnswer < 1 || userAnswer > choices.length){
            System.out.println("\n");
            System.out.println("Select your answer (1 - " + choices.length + "): ");
            if (userInput.hasNextInt()){
                userAnswer = userInput.nextInt();
            } else {
                System.out.println("Invalid entry. Please input a number. ");
                userInput.nextLine();
            }
        } 
        return userAnswer;
    }

//Method to print the player's score/results
public void printScore(int score){
    try (PrintWriter writer = new PrintWriter(new FileWriter("randomquiz_results.txt", true))){ 
        writer.println("Copy of Quiz Results");
        writer.println("--------------------");
        writer.println("Total Score: " + score + "/" + questionBank.size() + "\n");

        for (String result : userResults){
            writer.println(result);
        }
        System.out.println("Your Results have been saved to randomquiz_results.txt");
    } catch (Exception e) {
       System.out.println("Error saving score: " + e.getMessage());
    }

    }
}
