package First;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//A class named MoneyTransfer consisting of all the methods required for money transfer between accounts
class MoneyTransfer extends CheckPassword{

    //A method which takes the (account object and Array of Accounts) as an argument and works on them
    static void moneyTransfer(Accounts acc, Accounts[] arr){

        Scanner sc = new Scanner(System.in);
        int j;

        //It stores the account balance of the person who wants to send money
        int donor_balance = acc.getBalance();

        //We now ask the user to input the recipient's account number
        System.out.print("\nEnter Recipient's Account Number please.\nType here : ");
        String Recipient_Account_Number = sc.next();

        //In this for loop, check whether the recipient's account number exists
        for(j=0; j<arr.length; j++){
            if(Recipient_Account_Number.equals(arr[j].getAccountNumber())) break;
        }

        //If j<arr.length it is confirmed that the account_number exists and we proceed further
        if(j<arr.length){

            //This stores the initial balance of the recipient's account
            int recipient_balance = arr[j].getBalance();

            int validTransfer = 0, amountToTransfer=0;
    
            //While loop runs until it is confirmed that a valid transfer can be taken place
            while(validTransfer==0){
    
                //We ask the user to input the amount they want to transfer
                System.out.print("\nEnter the amount you want to transfer (Rs.): ");
                amountToTransfer = sc.nextInt();
    
                //If the amount is less than current balance of the user's account then transaction process proceeds.
                if(amountToTransfer <= donor_balance) validTransfer=1;

                //else error message is displayed and while loop continues
                else System.out.println("\nInsufficient balance to proceed with transfer.\nPlease input again.\n");

            }
    
            boolean checkValidPassword = false;

            // the below if condition checks whether the account is valid or has a ban on it

            // If the account is valid
            //      it checks Password entered by user and compares with the actual password and proceeds accordingly
            if(acc.getAccountValid()) checkValidPassword = checkPassword(acc.getPassword());
    
            //If user fails to give correct password in given chances then account is banned. We display a warning message to the user.
            if(!checkValidPassword){
                System.out.println("\nYour account has been temporarily blocked for security reasons.");
                System.out.println("Contact your nearest branch for removal of ban on your account.\n");

                //The below method bans the account by changing validity to false
                acc.AccountValidityToFalse();
            }
            
            //If typed password matches then we proceed further
            else{

                //Then we subtract the transferred amount from user's account and add the transferred amount to recipient's account
                System.out.println("\nThe transaction is successful!");
                acc.changeBalance(donor_balance - amountToTransfer);
                arr[j].changeBalance(recipient_balance + amountToTransfer);

                //Using file handling and noting the information related to the function 
                // which might be used for future purposes
                try {
                    File f = new File("ATMTransactions.txt");
                    FileWriter Write = new FileWriter(f, true);

                    //Information saved as account number of the customer, the MoneyTransfer function, Recipient's account number, Initial Balance and Final Balance
                    Write.write(acc.getAccountNumber() + " Money Transfer " +arr[j].getAccountNumber()+" "+(acc.getBalance()+amountToTransfer)+" "+acc.getBalance()+"\n");
                    Write.close();
                } catch (IOException e) {
                    System.out.println("unable to write!!");
                    e.printStackTrace();
                }
            }
        }
        else System.out.println("\nSorry! Please check recipient's account number.\n");

    
    }
}
