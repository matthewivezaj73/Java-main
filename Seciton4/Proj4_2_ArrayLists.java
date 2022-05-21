//Importing package.
import java.util.Scanner;
//Importing library.
import java.util.ArrayList;
//Creating a public class.
public class Proj4_2_ArrayLists {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Creating an arraylist.
        ArrayList<Integer> myList = new ArrayList();
        //Creating a variable.
        int userInput;
        int countInteger = 0;
        //Adding a while loop.
        while(countInteger < 5)
        {
            //Telling the user to enter a number greater that 0.
            System.out.print("Please enter a positive number:\t");
            //Requesting user input.
            userInput = keyboard.nextInt();
            //Creating an if else statement.
            if(userInput > 0)
            {
                //Adding the input to the array.
                myList.add(userInput);
                //Notifying the user that the input has been hadded to the array list.
                System.out.println("Added!");
                //Incrementing countInteger.
                countInteger += 1;
            }
            //Handling the case where userInput < 0 is in the entry.
            else if(userInput < 0)
            {
                //Breaking out of the program.
                break;
            }
            //Handling the case where the inputted value is greater than 0.
            else
            {
                //Printing a message to the user.
                System.out.println("Sorry, but, " + userInput + " is either a non numeric value or a negative value. Please try again!");
            }
        }
    }
}
