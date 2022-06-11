/**
 *      Matthew Ivezaj
 *      6/11/2022
 *      BankAccount.java
 */
//Creating a public class.
public class BankAccount {
    //Creating private variables.
    private static float balance;
    private static float withdrawal;
    private static float deposit;
    //Creating a public method.
    public BankAccount(float balance, float withdrawal, float deposit)
    {
        //Initializing variables.
        BankAccount.balance = balance;
        BankAccount.withdrawal = withdrawal;
        BankAccount.deposit = deposit;
    }
    //Creating a constructor to represent the act of checking your balance.
    public float balance()
    {
        //Returning the current balance.
        return balance;
    }
    //Creating a constructor to represent the act of making a deposit.
    public float deposit()
    {
        //Returning the amount to deposit.
        return deposit;
    }
    //Creating a constructor to print the banking details.
    public void displayBankingDetails()
    {
        //Printing out the amount the user would like to withdraw.
        System.out.println("You are now withdrawing, "+withdrawal);
        //Printing out the amount the user would like to deposit.
        System.out.println("You are now depositing, " + deposit);
        //Checking if withdrawal is a number greater than 0.
        if(withdrawal > 0)
        {
            //Printing out the remaining balance.
            System.out.println("You now have, " + balance + ", left over.");
        }
    }
    //Creating a constructor to represent the act of making a withdrawal.
    public float withdrawMoney()
    {
        //Returning the amount to withdraw.
        return withdrawal;
    }
}
