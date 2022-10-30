# Usage of OOPS Concepts in this project
## Abstraction
Data abstraction can be seen in the *[code](https://github.com/manchikatla-teja/ATM-Simul/blob/main/ATM.java).*   
We have hidden details related to the account using ***private** access modifier.*  
To access them, we used ***public** methods.*  

 

    abstract class Accounts{  
    private String Account_Number;
    private String Passcode;
    private int balance;
    private boolean Account_Valid;
    private String Account_Type;

    ....

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
    
    ....  
    
    void setPassword(String password){
        this.Passcode = password;
    }

    void changeBalance(int new_balance){
        this.balance = new_balance;
    } 
    }  


## Encapsulation
Encapsulation is widely used in the project.  
All the methods and variables required for a particular task say *input of user account number* and *services offered in ATM*, are capsulated inside a class named *Start* and *Functions* respectively.  
 All the tasks are capsulated in their respective classes and can be accessed only using the format ***\[className\].\[methodName\]***
 
 
 
 
    class Start{
    
    static void start(Accounts[] arr){

        .....
        
        if(j<arr.length && arr[j].getAccountValid()==true){
            Functions.functions(arr[j], arr);
        }
        .....
    }
    }
    
     class Functions{
    static void functions(Accounts acc, Accounts[] arr){
        Scanner sc = new Scanner(System.in);

        if(acc.getAccountType().equals("Savings") || acc.getAccountType().equals("Joint")){
        
            .....
            
                if(command == 1) ChangePassword.changePassword(acc);
                else if(command == 2) Withdraw.withdraw(acc);
                else if(command == 3) Deposit.deposit(acc);
                else if(command == 4) MoneyTransfer.moneyTransfer(acc, arr);
                else if(command == 5) CheckBalance.getBalance(acc);
                else if(command == 6) System.out.println("\nThank you for choosing us!!\n");
                else command = 1;

        }
        }
        
        .....
        
       }
      }
      
      
      
  ## Polymorphism
  Polymorphism is when the objects behave differently in different situations.  
    
  **For example:**  
  We have a **getBalance()** method in abstract class Account, and **getBalance(Accounts\[\])** in class Check Balance.  
  The first method is a getter of private information of the current balance in the user's account.  
  Whereas the second method does all the necessary tasks, when a user wishes to check their balance in their account.  
  
  
  
    abstract class Accounts{
    .....
    private int balance;
   
     .......
    int getBalance(){
        return this.balance;
    }
    
    .....
    
    }
    
    class CheckBalance extends CheckPassword{
    
    static void getBalance(Accounts acc){

        .....
        
        else{

            //We then display the user's account balance
            System.out.println("\nYour balance is : " + acc.getBalance() + " Rs.");
            
            .....
            
        }
        }

  
  
  
  ## Inheritance
  We inherit a class into another class to access methods in the former class that can be used in latter.  
  This helps us in improving the readability.  
    
  **For example:**  
  We have a class *Check Password* that contains a method named *checkPassword* to check whether a typed password is correct.  
  Hence we extend this class into other classes such as *Deposit, Withdraw, Money Transfer* where we need to have a valid password to proceed further with the service.  
  
  
     class CheckPassword{
    static boolean checkPassword(String ActualPassword){

        ...
        for(int i=0; i<3; i++){
             ....
            if(password.equals(ActualPassword)) return true;
            ....
        }
        return false;
    }
    }
    
    
       class CheckBalance extends CheckPassword{
        static void getBalance(Accounts acc){
         
         ....
         
        if(acc.getAccountValid()) checkValidPassword = checkPassword(acc.getPassword());
           ...
           
        if(!checkValidPassword){
            .....
        }
          .....
        }
        
        
        
        }
