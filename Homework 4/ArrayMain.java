/*
Take the given array and keep track of:
1. Any duplicate numbers
2. How many times the duplicate numbers appear
3. Print out those duplicate numbers with how many times they appear

 */

public class ArrayMain {
    public static void main(String[] args) {
        //Don't let the size of this scare you! no matter how big an array is, it all works the same!
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
        //you cannot use the array util. Do this one by hand :(
        //Main statement:
        System.out.print("The dupes in this array are: \n");

        //Searches the array for dupes:
            for(int i = 0; i < myArray.length; i++){
                int dupesAppear = 1; //variable to hold my count of dupes
                for(int k = i + 1; k < myArray.length; k++){
                    if(myArray[i]==myArray[k])
                    dupesAppear++;
                }
                //If there are duplicates, print the number and how many times it appears.
                    if(dupesAppear > 1){
                        System.out.print(myArray[i] + ", ");
                        System.out.println("which appears " + dupesAppear + " times.");
                    }
            } 
        }
    }   
