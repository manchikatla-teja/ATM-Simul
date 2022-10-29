package First;
import java.util.Scanner;

//A class named CheckPassword consisting of methods that checks whether the correct password is typed
class CheckPassword{

    //A method for password checking which takes the real password as argument
    static boolean checkPassword(String ActualPassword){

        Scanner sc = new Scanner(System.in);

        //For loop represents the max number of times a wrong password is warned before banning the account
        // It is 3 times in this code
        for(int i=0; i<3; i++){

            //We then ask the user to input his password
            System.out.print("\nEnter your password : ");
            String password = sc.next();

            //If the password matches then the method returns true
            if(password.equals(ActualPassword)) return true;
            //else Error message is displayed and the for loop continues
            System.out.println("\nYour password was wrong.");
        }


        //If you fail to give correct password in given chances then method returns false which results in banning the account
        return false;
    }

}