/**
 *      Matthew Ivezaj
 *      5/25/2022
 *      MethodOverloading
 */
public class MethodOverloading {
    //Creating a main method.
    public static void main(String[] args)
    {

    }
    //Creating a new method.
    public static int getResult(int num)
    {
        //Returning number passed multiplied by two.
        return num * 2;
    }

    //Overloading the previous method.
    public static int getResult(int num1, int num2)
    {
        //Multiplying two numbers passed into the method and returning them.
        return num1 * num2;
    }
    //Overloading the method again.
    public static int getResult(int num1, String value)
    {
        //Returning the number multiplied by a string value.
    }
}
