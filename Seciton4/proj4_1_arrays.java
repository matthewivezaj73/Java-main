/**
 *      Matthew Ivezaj
 *      5/20/2022
 *      Proj4_1_Arrays.java
 */
//Importing the arraylist package.
import java.util.ArrayList;
//Importing scanner.
import java.util.Scanner;
//Creating public class.
public class proj4_1_arrays
{
    //Creating main method.
    public static void main(String[] args)
    {
        //Creating a scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Creating an arraylist.
        ArrayList<Integer> myList = new ArrayList();
        //Created a variable to store user input.
        int userInput;
        //Telling the user to enter 5 integers.
        System.out.println("Please enter 5 integers: ");
        //Creating a for loop.
        for(int i = 0; i < 5; i++)
        {
            //Asking the user for input.
            userInput = keyboard.nextInt();
        }
    }
}