import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class midterm {

    /*
     * CMPT220 MIDTERM
     * NYE WADE
     * FALL 24' 
     * 10/14/24 
     */
    public static void main (String[] args) throws Exception {

        List<Integer> caseBalances = new ArrayList<Integer>();

            caseBalances.add(350000); //1
            caseBalances.add(740000); //2
            caseBalances.add(150000); //3
            caseBalances.add(920000); //4
            caseBalances.add(50000);  //5
            caseBalances.add(10);     //6
            caseBalances.add(800000); //7
            caseBalances.add(1200);   //8
            caseBalances.add(450000); //9 
            caseBalances.add(1000000);//10
            caseBalances.add(300000); //11
            caseBalances.add(200000); //12
            caseBalances.add(67000);  //13
            caseBalances.add(0);      //14
            caseBalances.add(250000); //15
            caseBalances.add(90000);  //16
            caseBalances.add(840000); //17
            caseBalances.add(63000);  //18
            caseBalances.add(750000); //19
            caseBalances.add(1);      //20
            caseBalances.add(180000); //21
            caseBalances.add(950000); //22
            caseBalances.add(420000); //23
            caseBalances.add(30000);  //24
            caseBalances.add(990000); //25
            caseBalances.add(500000); //26

        
        //How many cases are available
            List<Integer> availCases = new ArrayList<>();
            for (int i = 1; i <= 26; i++ ){
                availCases.add(i);
            }


            Scanner userInput = new Scanner(System.in);
            int pickedFirstCase = 0;
            int pickedFirstValue = 0;
     

        //User prompt to pick their first case.
            System.out.println("Choose your first case! | Cases left:" + availCases);
            pickedFirstCase = userInput.nextInt();

       //The value of the first case
            pickedFirstValue = caseBalances.get(pickedFirstCase - 1);

       //Remove that case
            availCases.remove(Integer.valueOf(pickedFirstCase));

        //Tells them what case was picked
            System.out.println("You picked Case " + pickedFirstCase);

//ROUNDS 1 - 4:

 //Starts the game - Round 1 - 6 cases
                for (int i = 1; i < 6; i++){
                    System.out.println("Choose your next case! | Cases left:" + availCases); //amount of cases left
                    int pickedCase = userInput.nextInt();

                        //stops chosen cases from being selected again & error msg if done so.
                        if (availCases.contains(pickedCase)){
                            int caseBalance = caseBalances.get(pickedCase - 1);
                            availCases.remove(Integer.valueOf(pickedCase));
                            System.out.println("Case " + pickedCase + " had $" + caseBalance); //Tells the value of case they chose
                        } else {
                            System.out.println("Case " + pickedCase + " was already chosen. Pick another case!"); //error if same case is picked
                            i--; 
                        }
            }

                        //Banker stuff #1

                                int balanceSUM1 = 0;
                                for (int i = 0; i < availCases.size(); i ++){
                                    int caseIndex = availCases.get(i) - 1;
                                    balanceSUM1 += caseBalances.get(caseIndex);
                                }

                                if (availCases.size() > 0){
                                int bankerOffer =  balanceSUM1/availCases.size();
                                    System.out.println("\nThe banker is calling!!!");
                                    System.out.println("........\n");
                                    System.out.println("The Banker is offering you: $" + bankerOffer + "\n");
                            

                                //User's Choice
                                    System.out.println("Would you like to accept that offer? | Yes or No");
                                    userInput.nextLine();
                                    String userAnswer = userInput.nextLine();

                                    if(userAnswer.equalsIgnoreCase("Yes")){
                                        System.out.println("\nCongrats, you win: $" + bankerOffer + "!\n");
                                        System.out.println("Case " + pickedFirstCase + " had: $" +  pickedFirstValue);
                                        System.exit(0);
                                    } else {
                                        System.out.println("\n_____________________________________________________\n");
                                        System.out.println("\nWelcome to Round 2!\n");
                                }

            }

    //Starts the game - Round 2 - 5 cases
            for (int i = 1; i <= 5; i++){
                System.out.println("Choose your next case! | Cases left:" + availCases); //amount of cases left
                int pickedCase = userInput.nextInt();

                    //stops chosen cases from being selected again & error msg if done so.
                    if (availCases.contains(pickedCase)){
                        int caseBalance = caseBalances.get(pickedCase - 1);
                        availCases.remove(Integer.valueOf(pickedCase));
                        System.out.println("Case " + pickedCase + " had $" + caseBalance); //Tells the value of case they chose
                    } else {
                        System.out.println("Case " + pickedCase + " was already chosen. Pick another case!"); //error if same case is picked
                        i--; 
                    }
            }

                                //Banker stuff #2

                                int balanceSUM2 = 0;
                                for (int i = 0; i < availCases.size(); i ++){
                                    int caseIndex = availCases.get(i) - 1;
                                    balanceSUM2 += caseBalances.get(caseIndex);
                                }

                                if (availCases.size() > 0){
                                int bankerOffer =  balanceSUM2/availCases.size();
                                    System.out.println("\nThe banker is calling!!!");
                                    System.out.println("........\n");
                                    System.out.println("The Banker is offering you: $" + bankerOffer + "\n");
                            

                                //User's Choice #2
                                    System.out.println("Would you like to accept that offer? | Yes or No");
                                    userInput.nextLine();
                                    String userAnswer = userInput.nextLine();

                                    if(userAnswer.equalsIgnoreCase("Yes")){
                                        System.out.println("Congrats, you win: $" + bankerOffer + "!\n");
                                        System.out.println("Case " + pickedFirstCase + " had: $" +  pickedFirstValue);
                                        System.exit(0);
                                    } else {
                                        System.out.println("\n_____________________________________________________\n");
                                        System.out.println("\nWelcome to Round 3!\n");
                                }

    }


//Starts the game - Round 3 - 4 cases

                for (int i = 1; i <= 4; i++){
                    System.out.println("Choose your next case! | Cases left:" + availCases); //amount of cases left
                    int pickedCase = userInput.nextInt();

                        //stops chosen cases from being selected again & error msg if done so.
                        if (availCases.contains(pickedCase)){
                            int caseBalance = caseBalances.get(pickedCase - 1);
                            availCases.remove(Integer.valueOf(pickedCase));
                            System.out.println("Case " + pickedCase + " had $" + caseBalance); //Tells the value of case they chose
                        } else {
                            System.out.println("Case " + pickedCase + " was already chosen. Pick another case!"); //error if same case is picked
                            i--; 
                        }
                }

                    //Banker stuff #3

                                int balanceSUM3 = 0;
                                for (int i = 0; i < availCases.size(); i ++){
                                    int caseIndex = availCases.get(i) - 1;
                                    balanceSUM3 += caseBalances.get(caseIndex);
                                }

                                if (availCases.size() > 0){
                                int bankerOffer =  balanceSUM3/availCases.size();
                                    System.out.println("\nThe banker is calling!!!");
                                    System.out.println("........\n");
                                    System.out.println("The Banker is offering you: $" + bankerOffer + "\n");
                            

                                //User's Choice #3
                                    System.out.println("Would you like to accept that offer? | Yes or No");
                                    userInput.nextLine();
                                    String userAnswer = userInput.nextLine();

                                    if(userAnswer.equalsIgnoreCase("Yes")){
                                        System.out.println("Congrats, you win: $" + bankerOffer + "!\n");
                                        System.out.println("Case " + pickedFirstCase + " had: $" +  pickedFirstValue);
                                        System.exit(0);
                                    } else {
                                        System.out.println("\n_____________________________________________________\n");
                                        System.out.println("\nWelcome to Round 4!\n");
                                }

}

//Starts the game - Round 4 - 3 cases

for (int i = 1; i <= 3; i++){
    System.out.println("Choose your next case! | Cases left:" + availCases); //amount of cases left
    int pickedCase = userInput.nextInt();

        //stops chosen cases from being selected again & error msg if done so.
        if (availCases.contains(pickedCase)){
            int caseBalance = caseBalances.get(pickedCase - 1);
            availCases.remove(Integer.valueOf(pickedCase));
            System.out.println("Case " + pickedCase + " had $" + caseBalance); //Tells the value of case they chose
        } else {
            System.out.println("Case " + pickedCase + " was already chosen. Pick another case!"); //error if same case is picked
            i--; 
        }
}

    //Banker stuff #4

                int balanceSUM4 = 0;
                for (int i = 0; i < availCases.size(); i ++){
                    int caseIndex = availCases.get(i) - 1;
                    balanceSUM4 += caseBalances.get(caseIndex);
                }

                if (availCases.size() > 0){
                int bankerOffer =  balanceSUM4/availCases.size();
                    System.out.println("\nThe banker is calling!!!");
                    System.out.println("........\n");
                    System.out.println("The Banker is offering you: $" + bankerOffer + "\n");
            

                //User's Choice #4
                    System.out.println("Would you like to accept that offer? | Yes or No");
                    userInput.nextLine();
                    String userAnswer = userInput.nextLine();

                    if(userAnswer.equalsIgnoreCase("Yes")){
                        System.out.println("Congrats, you win: $" + bankerOffer + "!\n");
                        System.out.println("Case " + pickedFirstCase + " had: $" +  pickedFirstValue);
                        System.exit(0);
                    } else {
                        System.out.println("\n_____________________________________________________\n");
                        System.out.println("\nWelcome to Round 5!\n");
                    }
}

//Starts the game - Round 3 - 4 cases

for (int i = 1; i <= 4; i++){
    System.out.println("Choose your next case! | Cases left:" + availCases); //amount of cases left
    int pickedCase2 = userInput.nextInt();

        //stops chosen cases from being selected again & error msg if done so.
        if (availCases.contains(pickedCase2)){
            int caseBalance = caseBalances.get(pickedCase2 - 1);
            availCases.remove(Integer.valueOf(pickedCase2));
            System.out.println("Case " + pickedCase2 + " had $" + caseBalance); //Tells the value of case they chose
        } else {
            System.out.println("Case " + pickedCase2 + " was already chosen. Pick another case!"); //error if same case is picked
            i--; 
        }
}

    //Banker stuff #5

                int balanceSUM5 = 0;
                for (int i = 0; i < availCases.size(); i ++){
                    int caseIndex = availCases.get(i) - 1;
                    balanceSUM5 += caseBalances.get(caseIndex);
                }

                if (availCases.size() > 0){
                int bankerOffer =  balanceSUM5/availCases.size();
                    System.out.println("\nThe banker is calling!!!");
                    System.out.println("........\n");
                    System.out.println("The Banker is offering you: $" + bankerOffer + "\n");
            

                //User's Choice #5
                    System.out.println("Would you like to accept that offer? | Yes or No");
                    userInput.nextLine();
                    String userAnswer = userInput.nextLine();

                    if(userAnswer.equalsIgnoreCase("Yes")){
                        System.out.println("Congrats, you win: $" + bankerOffer + "!\n");
                        System.out.println("Case " + pickedFirstCase + " had: $" +  pickedFirstValue);
                        System.exit(0);
                    } else {
                        System.out.println("\n_____________________________________________________\n");
                        System.out.println("\nWelcome to Round 6!\n");


                    }
}


//Starts the game - Round 4 - 3 cases

        for (int i = 1; i <= 3; i++){
            System.out.println("Choose your next case! | Cases left:" + availCases); //amount of cases left
            int pickedCase = userInput.nextInt();

                //stops chosen cases from being selected again & error msg if done so.
                if (availCases.contains(pickedCase)){
                    int caseBalance = caseBalances.get(pickedCase - 1);
                    availCases.remove(Integer.valueOf(pickedCase));
                    System.out.println("Case " + pickedCase + " had $" + caseBalance); //Tells the value of case they chose
                } else {
                    System.out.println("Case " + pickedCase + " was already chosen. Pick another case!"); //error if same case is picked
                    i--; 
                }
            }

            //Banker stuff #6

                        int balanceSUM6 = 0;
                        for (int i = 0; i < availCases.size(); i ++){
                            int caseIndex = availCases.get(i) - 1;
                            balanceSUM6 += caseBalances.get(caseIndex);
                        }

                        if (availCases.size() > 0){
                        int bankerOffer =  balanceSUM6/availCases.size();
                            System.out.println("\nThe banker is calling!!!");
                            System.out.println("........\n");
                            System.out.println("The Banker is offering you: $" + bankerOffer + "\n");


                        //User's Choice #6
                            System.out.println("Would you like to accept that offer? | Yes or No");
                            userInput.nextLine();
                            String userAnswer = userInput.nextLine();

                            if(userAnswer.equalsIgnoreCase("Yes")){
                                System.out.println("Congrats, you win: $" + bankerOffer + "!\n");
                                System.exit(0);
                            } else {
                                System.out.println("\nWelcome to the FINAL ROUND!\n");
                                System.out.println("_____________________________________________________\n");
                            } 

                            System.out.println("Would you like to keep your first case or swap it with the final one?");
                            String userAnswer2 = userInput.nextLine();
                            
                            if (userAnswer2.equalsIgnoreCase("Keep")){
                                System.out.println("Congrats, your first case had: $" +  pickedFirstValue + "!");
                            }else if (userAnswer2.equalsIgnoreCase("Swap")){
                                int lastCase = availCases.get(0);
                                int lastCaseBalance = caseBalances.get(lastCase - 1);
                                System.out.println("\nCongrats....." + "The final case had: $" +  lastCaseBalance + "!!!!");
                        }

                }
        }
}
        