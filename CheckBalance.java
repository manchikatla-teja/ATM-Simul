package First;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//A class named CheckBalance consisting of all the methods required for checking current balance 
class CheckBalance extends CheckPassword{

    //A method which takes the account object as an argument and works on it
    static void getBalance(Accounts acc){

        boolean checkValidPassword = false;

        // If the account is valid
        //      it checks Password entered by user and compares with the actual password and proceeds accordingly
        if(acc.getAccountValid()) checkValidPassword = checkPassword(acc.getPassword());

        //If user fails to give correct password in given chances, then the account is banned.
        if(!checkValidPassword){
            System.out.println("\nYour account has been temporarily blocked for security reasons.");
            System.out.println("Contact your nearest branch for removal of ban on your account.\n");

            //This method bans the account by changing its validity to false
            acc.AccountValidityToFalse();
        }

        //If typed password matches then we proceed further
        else{

            //We then display the user's account balance
            System.out.println("\nYour balance is : " + acc.getBalance() + " Rs.");

            //Using file handling and noting the information related to the function 
            // which might be used for future purposes
            try {
                File f = new File("ATMTransactions.txt");
                FileWriter Write = new FileWriter(f, true);

                //Information saved as account number of the customer, the Balance Checked function
                Write.write(acc.getAccountNumber() + " Balance Checked " +"\n");
                Write.close();
            } catch (IOException e) {
                System.out.println("unable to write!!");
                e.printStackTrace();
            }
        }



    }
}
