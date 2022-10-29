package First;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//A class named ChangePassword consisting of all the methods required for changing the password of the account
class ChangePassword{

    //A method which takes the account object as an argument and works on that particular account
    static void changePassword(Accounts arr){
        
        Scanner sc = new Scanner(System.in);
 
        //Confirmation from the account-holder before proceeding
        System.out.print("\nDo you want to change your password? (true/false)\nType here : ");
        boolean changeYes = sc.nextBoolean();

        //if customer wants to change Password, then process continues
        // else we return to home screen
        if(changeYes){

            //Generating a random OTP for security reasons
            //This is to simulate the security verification while changing Password.
            System.out.println("\nYou received an OTP on your registered mobile number 98******98.");
            int OTP = (int)(Math.random()*(9999-1000+1)+1000); 
            System.out.println("Your One-Time-Password for Password reset is " + OTP +". Kindly do not share this with anyone.");


            System.out.print("\nPlease enter the OTP you received.\nType here : ");
            int typeOTP = sc.nextInt();

            //If OTP is typed correctly then the process proceeds further else it returns back to home screen
            if(typeOTP==OTP){

                //Requesting the new Password 
                System.out.print("\nPlease choose a strong password for safety. A minimum of 5 characters long password is required.\nEnter new Password: ");
                String newPassword = sc.next();

                while(newPassword.length()<5){
                    System.out.print("\nPlease choose a password of atleast 5 characters long.\nEnter new password: ");
                    newPassword = sc.next();
                }

                //calling a public method to change the Password which is private in the abstract class
                arr.setPassword(newPassword);

                //Displaying message that the process was successful
                System.out.println("\nPassword changed successfully.");

                //Using file handling and noting the information related to the function 
                // which might be used for future purposes
                try {

                    File f = new File("ATMTransactions.txt");
                    FileWriter Write = new FileWriter(f, true);

                    //Information saved as account number of the customer and the function that is Password changing
                    Write.write(arr.getAccountNumber() + " Password changed " +"\n");

                    Write.close();
                    
                } catch (IOException e) {
                    System.out.println("unable to write!!");
                    e.printStackTrace();
                }
            }
            else System.out.println("\nWrong OTP entered!!");

        }


    }
}
