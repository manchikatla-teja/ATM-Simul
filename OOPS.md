# ATM-Simul

- [Introduction](#intro)
- [Functions of the ATM](#functions)
- [Additional Features](#add_features)

<a name="intro"></a>
## Introduction

This project is the simulation of an ATM. 
If we want to simulate an ATM, the first and foremost thing we need is the account information.
### a. Accounts
*You can find the [code](https://github.com/manchikatla-teja/ATM-Simul/blob/main/ATM.java) here.*  
  
  
For this purpose, we have created a few accounts which replicate the account database of the bank.  
Each account consists of the following private information.
- Account Number
- Account Password
- Account Type
- Account Validity
- Account Balance  

To protect the privacy of the information, we have used *getter and setter methods* for accessing the information and modifying the information respectively.

### b. Checking Password
In an ATM, secrecy is the foremost thing it offers. So password checking is a must-include feature.  
  
  
*You can find the [code](https://github.com/manchikatla-teja/ATM-Simul/blob/main/CheckPassword.java) here.*  
  
  
We offer the user **3** chances to type in the correct password.  
Upon failure to do so, the account of the user is banned and a warning message is displayed.


### c. Running the code
When the code is executed, we ask the user to input their account number.
If the account exists in the database, then we proceed with the functions of the ATM.  
  
  
Run the given code to start execution. [ATM.java](https://github.com/manchikatla-teja/ATM-Simul/blob/main/ATM.java)

<a name="functions"></a>
## Functions of the ATM
In this project, we simulate the basic functioning of an ATM. The functions include:

1. [Check Balance](#check_balance)
2. [Change Password](#change_password)
3. [Deposit Money](#deposit_money)
4. [Withdraw Money](#withdraw_money)
5. [Money Transfer](#money_transfer)

<a name="check_balance"></a>
### 1. Check Balance
*You can find the [code for checking balance](https://github.com/manchikatla-teja/ATM-Simul/blob/main/CheckBalance.java) here.*  
  
  
When the entered password matches with the password linked to the account number, we display the *current balance* in the account of the user.

<a name="change_password"></a>
### 2. Change Password
*You can find the [code for changing password](https://github.com/manchikatla-teja/ATM-Simul/blob/main/ChangePassword.java) here.*  
  
  
If the user wishes to change the password, we send an *OTP* to the phone number of the user.  
When the user enters the correct OTP, we allow the user to change their password.  
  
  
**NOTE:** OTP message is displayed on the console for our convinience as of now.


<a name="deposit_money"></a>
### 3. Deposit Money
*You can find the [code for depositing money](https://github.com/manchikatla-teja/ATM-Simul/blob/main/Deposit.java) here.*  

The user is requested to enter the amount of money, they want to *deposit* and also the *denomination of notes*.  
Once the denomination of notes and the total amount of money user wants to deposit matches, and the user enters correct password, we allow the user to deposit their money into the ATM slot.  

**NOTE:** The task of checking denomination of notes is done by the ATM itself. Since we cannot represent it here, we request the user to do it for our project.


<a name="withdraw_money"></a>
### 4. Withdraw Money
*You can find the [code for withdrawing money](https://github.com/manchikatla-teja/ATM-Simul/blob/main/Withdraw.java) here.*  

The user is requested to enter the amount of money, they want to withdraw.  
If their current balance is more than the amount they wish to withdraw and correct password is entered, then we accept the request of the user and allow them to withdraw money.  
#### Feature added
The *maximum amount* the user can withdraw has a limit according to their account type.  
- If it is a *savings* account, then a maximum of **10,000 Rs.** withdrawal is allowed.  
- If it is a *joint* account, then a maximum of **20,000 Rs.** withdrawal is allowed.  
- If it is a *child* account, then withdrawal from ATM is **not** allowed.


<a name="money_transfer"></a>
### 5. Money Transfer
*You can find the [code for transferring money](https://github.com/manchikatla-teja/ATM-Simul/blob/main/MoneyTransfer.java) here.*  

We request the user to input the recipient's account number, and the amount they wish to transfer.
If the current balance is more than the amount they wish to transfer and correct password is entered, then we accept the request of the user and allow them to transfer money.  

This feature is **not** enabled for *child* account.

<a name="add_features"></a>
## Additional Features
### Transaction Data
*You can find the [code for saving transactions info](https://github.com/manchikatla-teja/ATM-Simul/blob/main/CheckBalance.java) in any of the functions' code above.*  

We save all the information regarding the transactions that took place through the ATM in a *[text file](https://github.com/manchikatla-teja/ATM-Simul/blob/main/ATMTransactions.txt).*
