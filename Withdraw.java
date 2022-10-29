package First;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//A class named Withdraw consisting of all the methods required for withdrawing desired amount of money
class Withdraw extends CheckPassword{

    //A method which takes the account object as an argument and works on that particular account
    static void withdraw(Accounts acc){

        Scanner sc = new Scanner(System.in);

        // The initial balance present in the account before Withdrawal
        int balance = acc.getBalance();

        //Asking the user to input the amount they want to Withdraw
        System.out.print("\nEnter the amount you want to withdraw (Rs.): ");
        int amountToWithdraw = sc.nextInt();


        boolean checkValidPassword = false;

        // the below if condition checks whether the account is valid or has a ban on it

        // If the account is valid
        //      it checks Password entered by user and compares with the actual password and proceeds accordingly
        if(acc.getAccountValid()) checkValidPassword = checkPassword(acc.getPassword());

        //If user fails to give correct password in given chances then account is banned. We display a warning message to the user.
        if(!checkValidPassword){
            System.out.println("\nYour account has been temporarily blocked for security reasons.");
            System.out.println("Contact your nearest branch for removal of ban on your account.\n");

            //The below method bans the account by changing its validity to false
            acc.AccountValidityToFalse();
        }

        //If typed password matches then we proceed further
        else{

            int max_withdrawal = 0;

            //We put a limit on maximum cash that can be withdrawn 
            //It is different for different types of accounts
            if(acc.getAccountType().equals("Savings")) max_withdrawal = 10000;
            else if(acc.getAccountType().equals("Joint")) max_withdrawal = 20000;

            if(amountToWithdraw > max_withdrawal) System.out.println("\nSorry, amount requested exceeded the maximum limit.");
            
            //If the amount user wants to Withdraw exceeds his current balance then a message is displayed 
            // stating desired amount cannot be Withdrawn
            else if(amountToWithdraw > balance) System.out.println("\nSorry, cannot withdraw the requested amount due to insufficient balance.");

            //If amount to Withdraw is less than initial balance then user is given the cash
            else{

                //The below method changes the current balance to new balance
                acc.changeBalance(balance - amountToWithdraw);
                System.out.println("\nCollect your cash!");

                //Using file handling and noting the information related to the function 
                // which might be used for future purposes
                try {
                    File f = new File("ATMTransactions.txt");
                    FileWriter Write = new FileWriter(f, true);

                    //Information saved as account number of the customer, the Withdrawl function, Initial Balance and Final Balance
                    Write.write(acc.getAccountNumber() + " Withdrawl " + (acc.getBalance()+amountToWithdraw)+" "+acc.getBalance()+"\n");
                    Write.close();
                } catch (IOException e) {
                    System.out.println("unable to write!!");
                    e.printStackTrace();
                }
            }
        }



    }
}
