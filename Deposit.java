package First;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//A class named Deposit consisting of all the methods required for depositing money
class Deposit extends CheckPassword{

    //A method which takes the account object as an argument and works on that particular account
    static void deposit(Accounts arr){

        Scanner sc = new Scanner(System.in);

        // The initial balance present in the account before Deposit
        int balance = arr.getBalance();

        int validDenomationInfo = 0, amountToDeposit=0;

        //While loop keeps on running until the amount user deposits is not equal to the amount he claims to deposit
        while(validDenomationInfo==0){

            //We take input from user regarding how much they want to deposit
            System.out.print("\nEnter the amount you want to deposit (Rs.): ");
            amountToDeposit = sc.nextInt();

            //The below code is actually the function of a scanner in ATM
            //So to replicate it, we take input from user on denomination of notes he wants to deposit
            System.out.println("\nPlease enter the following info : ");
            System.out.print("Number of Rs.100 notes : ");
            int noOf100 = sc.nextInt();
            System.out.print("Number of Rs.500 notes : ");
            int noOf500 = sc.nextInt();
            System.out.print("Number of Rs.2000 notes : ");
            int noOf2000 = sc.nextInt();

            //If the amount deposited is equal to the amount claimed to be deposited then loop breaks.
            if(amountToDeposit==(noOf100*100 + noOf500*500 + noOf2000*2000)) validDenomationInfo=1;

            //else Error message is displayed and we again ask the user to input the denomination of notes.
            else System.out.println("\nPlease check the denomation info! \nPlease input again.\n");

        }


        boolean checkValidPassword = false ;

        // the below if condition checks whether the account is valid or has a ban on it

        // If the account is valid
        //      it checks Password entered by user and compares with the actual password and proceeds accordingly
        if(arr.getAccountValid()) checkValidPassword = checkPassword(arr.getPassword());

        //If user fails to give correct password in given chances then account is banned. We display a warning message to the user.
        if(!checkValidPassword){
            System.out.println("\nYour account has been temporarily blocked for security reasons.");
            System.out.println("Contact your nearest branch for removal of ban on your account.\n");
            
            //The below method bans the account by changing its validity to false
            arr.AccountValidityToFalse();
        }
        
        //If typed password matches then we proceed further
        else{

            //Account balance is changed with new balance 
            System.out.println("\nDeposit your cash here!");
            arr.changeBalance(balance + amountToDeposit);

            //Using file handling and noting the information related to the function 
            // which might be used for future purposes
            try {
                File f = new File("ATMTransactions.txt");
                FileWriter Write = new FileWriter(f, true);

                //Information saved as account number of the customer, the Deposit function, Initial Balance and Final Balance
                Write.write(arr.getAccountNumber() + " Deposit " + (arr.getBalance()-amountToDeposit)+" "+arr.getBalance()+"\n");
                Write.close();
            } catch (IOException e) {
                System.out.println("unable to write!!");
                e.printStackTrace();
            }
        }

    }
}
