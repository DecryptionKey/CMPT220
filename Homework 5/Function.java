import java.util.Scanner;
/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/

//I googled inspiration and got a temperature converter. So, I made a function for it.

public class Function {
    public static void main(String[] args) { 
            Scanner user = new Scanner(System.in);
            
            System.out.println("----------------------------------------------");
            System.out.println("            Fahrenheit to Celsius             ");
            System.out.println("----------------------------------------------");
            System.out.println("Enter the temperature you want converted to °C");    
            int userInput = user.nextInt();
            printCelsius(userInput);

    }

    public static void printCelsius(int userInput){

    int clesius = userInput;
    int covertedTemp =  ((clesius - 32) * 5/9);
    
    System.out.println(userInput + "°F" + " is " + covertedTemp + "°C");   

    }
}















