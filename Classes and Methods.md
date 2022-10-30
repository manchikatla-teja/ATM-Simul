# Classes and Methods

## Classes
- [abstract class Accounts](#abs_acc)
- [class Account](#acc)
- [Start](#st)
- [Functions](#fun)
- [Check Password](#cp)
- [Check Balance](#cb)
- [Change Password](#chp)
- [Deposit](#dep)
- [Withdraw](#wdr)
- [Money Transfer](#mt)

## Methods

<a name = "abs_acc"></a>
### Methods in abstract class Accounts
This class contains getter methods such as **getBalance(), getPassword(), getAccountNumber(), getAccountValid(), getAccountType()** which are used to *access* information outside the abstract class.  

It also contains setter methods such as **changeBalance(*new Balance*), setPassword(*New Password*), AccountValiditytoFalse()** which are used to *modify* information inside the abstract class.  

<a name = "acc"></a>
### Methods in class Account
It contains a method named **display()** used to get all the information about an account. The user of ATM does not have any access to use this method.

<a name = "st"></a>
### Methods in Start
It contains a method named **start(Accounts\[\])** which requests the user to input their account number.  
  
If the account is *not* in the database or has a *ban* on it, it displays a warning message and does not proceed further.  
If the account is *valid*, then it gives user the choice to choose the service. 

<a name = "fun"></a>
### Methods in Functions
This class contains a method named **functions(account, Accounts\[\])**.  
It gives the choices of services to user based on the account type.  
  
**For example:** If the account is *child account*, then the user does not have access to withdraw money or to transfer to another account.

<a name = "cp"></a>
### Methods in Check Password
This class contains a method named **checkPassword(*actual password*)**.  
The method gives the user 3 chances to type in the correct password.  
  
If the user types correct password, then the method returns **true**, and we proceed with the service.  
Else the method returns **false**, and the account will be banned along with a warning message on the console.  

<a name = "cb"></a>
### Methods in Check Balance
This class contains a method named **getBalance(account)** which displays the current balance in the user's account.

<a name = "chp"></a>
### Methods in Change Password
This class contains a method named **changePassword(account)**.  
  
We again take a confirmation from the user regarding changing of the password. If the user accepts, then we proceed further.  
We then send an *OTP* to the user's phone number.  
Once the user enters correct *OTP* on the console, we proceed with the change of password.  
If the requirements of password (*the password should be atleast 5 characters long*) are met, the password will be changed successfully.   
  
This feature is *not* enabled for *children* account.

<a name = "dep"></a>
### Methods in Deposit
This class contains a method named **deposit(account)**.  
  
We request the user to enter the amount they want to deposit and also the denomination of notes.  
If the denomination of notes matches with the amount the user wants to deposit, we allow the user to deposit cash into the ATM.  
Else we request the user to check the denomination info.

<a name = "wdr"></a>
### Methods in Withdraw
This class contains a method named **withdraw(account)**.  
  
We request the user to input the amount they want to withdraw.  
If the requested amount exceeds the *maximum limit or the current balance* in the account, we display the warning message.  
Else the user is allowed to collect the cash from the ATM.  
  
This feature is *not* enabled for *children* account.

<a name = "mt"></a>
### Methods in Money Transfer
This class contains a method named **moneyTransfer(account, Accounts\[\])**.  
  
We request the user to enter the recipient's account number.  
If the recipient's account number is valid, then we proceed further with the transfer process.  

We now request the user to enter the amount they want to transfer.  
If the amount to transfer *does not exceed the current balance*, then we proceed with the money transfer.  
  
This feature is *not* enabled for *children* account.

