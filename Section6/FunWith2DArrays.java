/*
        Matthew Ivezaj
        5/26/2022
        FunWith2DArrays
*/
//Creating a public class.
public class FunWith2DArrays {
    //Creating the main method.
    public static void main(String[] args)
    {

    }
    //Creating a new method. 
    public static void fill2DArray(int[][] twoDArr)
    {
        //Creating a random number generator.
        Random rand = new Random();
    }
    //Creating a new method.
    public static void print2DArray(int[][] twoDArr)
    {
        //Creating an enhanced for loop.
        for(int[] arr : twoDArr)
        {
            //Creating a for loop to access the numbers.
            for(int num : arr)
            {
                //Printing out the numbers to the user.
                System.out.print(num+ " ");
            }
            //Adding some padding.
            System.out.println();
        }
    }
}
