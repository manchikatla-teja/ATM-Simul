package First;
import java.util.Scanner;


//An abstract class Accounts which contains all the fields required for an account
abstract class Accounts{

    private String Account_Number;
    private String Passcode;
    private int balance;
    private boolean Account_Valid;
    private String Account_Type;

    //A constructor to store values in the object created
    void setAccount(String Account_Number, String Passcode, int Amount, String Account_Type){
        this.Account_Number = Account_Number;
        this.Passcode = Passcode;
        this.balance = Amount;
        this.Account_Valid = true;
        this.Account_Type = Account_Type;
    }

    //Using only getters, setters to access and change private information
    String getAccountNumber(){
        return this.Account_Number;
    }
    String getPassword(){
        return this.Passcode;
    }
    int getBalance(){
        return this.balance;
    }
    boolean getAccountValid(){
        return this.Account_Valid;
    }
    String getAccountType(){
        return this.Account_Type;
    }
    void setPassword(String password){
        this.Passcode = password;
    }
    void AccountValidityToFalse(){
        this.Account_Valid = false;
    }
    void changeBalance(int new_balance){
        this.balance = new_balance;
    }

    abstract void display();
}

class Account extends Accounts{

    void display(){
        System.out.println(this.getAccountNumber());
        System.out.println(this.getPassword());
        System.out.println(this.getBalance());
    }

}



//A class named Start consisting of methods that needs to executed everytime a user enters ATM
class Start{

    //A method that takes array of accounts as argument and works on it
    static void start(Accounts[] arr){

        Scanner sc = new Scanner(System.in);
        int j;

        //We ask the user to input their account number as he enters the ATM
        System.out.print("Enter your Account Number please.\nType here :");
        String Account_Number = sc.next();

        //the for loop checks whether that account exists in the database
        for(j=0; j<arr.length; j++){
            if(Account_Number.equals(arr[j].getAccountNumber())) break;
        }

        //If account exists and there is no ban on it
        // then the user can proceed with all the functions
        if(j<arr.length && arr[j].getAccountValid()==true){
            Functions.functions(arr[j], arr);
        }
        //If account exists but there is a ban on it
        // then an error message is displayed
        else if(j<arr.length && arr[j].getAccountValid()==false){
            System.out.println("\nThis account has a ban on it.");
            System.out.println("Contact your nearest branch for removal of ban on your account.\n");
        }
        else System.out.println("Sorry! Please check your account number.\n");


    }
}

//A class named Functions
class Functions{

    // the method takes the (user account and array of accounts) as arguments and works on it
    static void functions(Accounts acc, Accounts[] arr){
        Scanner sc = new Scanner(System.in);



        if(acc.getAccountType().equals("Savings") || acc.getAccountType().equals("Joint")){
            
            int command = 1;
            //While loop runs until the user has work
            //Each function of the ATM is linked to a number
            while(command>0 && command<6){

                System.out.println("\nEnter the corresponding number for the operation you want to perform.");
                System.out.println("\nChange Password  ==  1\nWithdraw  ==  2\nDeposit ==  3\nMoney Transfer  ==  4");
                System.out.print("Check Balance  == 5\nExit  ==  6\nType here : ");

                //We then ask the user to select his function and we proceed with the corresponding function
                command = sc.nextInt();
                if(command == 1) ChangePassword.changePassword(acc);
                else if(command == 2) Withdraw.withdraw(acc);
                else if(command == 3) Deposit.deposit(acc);
                else if(command == 4) MoneyTransfer.moneyTransfer(acc, arr);
                else if(command == 5) CheckBalance.checkBalance(acc);
                else if(command == 6) System.out.println("\nThank you for choosing us!!\n");

        }
        }
        else if(acc.getAccountType().equals("Children")){

            int command = 1;
            //While loop runs until the user has work
            //Each function of the ATM is linked to a number
            while(command>0 && command<3){

                System.out.println("\n***Enter the corresponding number for the operation you want to perform.***");
                System.out.println("\nDeposit ==  1\nCheck Balance  == 2\nExit  ==  3\nType here : ");

                //We then ask the user to select his function and we proceed with the corresponding function
                command = sc.nextInt();
                if(command == 1) Deposit.deposit(acc);
                else if(command == 2) CheckBalance.checkBalance(acc);
                else if(command == 3) System.out.println("\nThank you for choosing us!!\n");
            }
        }


    }
}

public class ATM {
    public static void main(String[] args){

        Accounts[] acc_arr = new Account[3];

        for(int i=0; i<3; i++){
            acc_arr[i] = new Account();
        }


        acc_arr[0].setAccount("12345", "432", 10000, "Savings");
        acc_arr[1].setAccount("23412", "123", 50000, "Joint");
        acc_arr[2].setAccount("09870", "$%^", 100, "Children");



        int k=1;
        while(k>0){
            System.out.println("\n----------$$$$$$$$$$$$$----------");
            System.out.println("Welcome to SOME RANDOM BANK ATM");
            System.out.println("----------$$$$$$$$$$$$$----------\n");
            Start.start(acc_arr);
            k--;
        }



        

    }
}
