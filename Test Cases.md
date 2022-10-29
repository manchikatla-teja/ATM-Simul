
# Test Cases

<details>

<summary><strong>Test Cases for Check Balance</strong></summary>

- [Account Banned](#account_ban_cb)
- [Entered Wrong Password](#wrong_pass_cb)
- [Entered Wrong Password 3 Times](#3_wrong_cb)
- [Correct Password, Show Balance](#proceed_cb)
</details>

<details>

<summary><strong>Test Cases for Changing Password</strong></summary>

- [Account Banned](#account_ban_cp)
- [Wrong OTP](#wrong_otp)
- [New Password Length less than 5](#pass<5)
- [Password change successful](#pass_ok)                                             
</details>
  
  
<details>

<summary><strong>Test Cases for Deposit</strong></summary>

- [Account Banned](#account_ban_dm)
- [Entered Wrong Password](#wrong_pass_dm)
- [Entered Wrong Password 3 Times](#3_wrong_dm)
- [Invalid Denomination Info](#inv_den_info_dm)
- [Successful Deposit](#deposit_dm)
                                          
</details>
  
  
<details>

<summary><strong>Test Cases for Withdraw</strong></summary>

- [Account Banned](#account_ban_wd)
- [Entered Wrong Password](#wrong_pass_wd)
- [Entered Wrong Password 3 Times](#3_wrong_wd)
- [Withdraw more than Maximum Limit](#with>max_wd)
- [Withdraw more than Current Balance](#with>bal_wd)
- [Successful Withdrawal](#withdraw_wd)
                                          
</details>


<details>

<summary><strong>Test Cases for Money Transfer</strong></summary>

- [Account Banned](#account_ban_mt)
- [Entered Wrong Password](#wrong_pass_mt)
- [Entered Wrong Password 3 Times](#3_wrong_mt)
- [Transfer more than Curretn Balance](#tran>max_mt)
- [Successful transfer](#transfer_mt)
                                          
</details>


<a name="account_ban_cb"></a>
## Account Banned (Check Balance)
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :
  ### Input
5
### Output
Your account has been temporarily blocked for security reasons.  
Contact your nearest branch for removal of ban on your account.
  
  
<a name="wrong_pass_cb"></a>
## Entered Wrong Password (Check Balance)
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :  
Enter your password :
  ### Input
  5  
  **some wrong password**
### Output
Your password was wrong.
  
  
  
<a name="3_wrong_cb"></a>
## Entered Wrong Password 3 Times
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :  
Enter your password :  
  Enter your password :  
  Enter your password :  
  ### Input
  5  
  **some wrong password**  
  **some wrong password**  
  **some wrong password**  
### Output
Your account has been temporarily blocked for security reasons.  
Contact your nearest branch for removal of ban on your account.
  
  
  
<a name="proceed_cb"></a>
## Correct Password, Show Balance
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :  
Enter your password :
  ### Input
  5  
  **correct password**
### Output
Your balance is : **balance in account** Rs.
  
  
<a name="account_ban_cp"></a>
## Account Banned (Password Changed)
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :
  ### Input
1
### Output
Your account has been temporarily blocked for security reasons.  
Contact your nearest branch for removal of ban on your account.
  

<a name="wrong_otp"></a>
## Wrong OTP
 ### Console
  Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :  
  
  Do you want to change your password? (true/false)  
Type here :  
  
You received an OTP on your registered mobile number **some phone number**.  
Your One-Time-Password for Password reset is **OTP**. Kindly do not share this with anyone.  

Please enter the OTP you received.  
  ### Input
  1  
  true  
  **Wrong OTP**  
  ### Output
  Wrong OTP entered!!  
  
  
  
<a name="pass<5"></a>
## Password Less than 5 Characters
  
 ### Console
  Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :  
  
  Do you want to change your password? (true/false)  
Type here :  
  
You received an OTP on your registered mobile number **some phone number**.  
Your One-Time-Password for Password reset is **OTP**. Kindly do not share this with anyone.  

Please enter the OTP you received.  
  
  Please choose a strong password for safety. A minimum of 5 characters long password is required.  
Enter new Password:  
  ### Input
  1  
  true  
  **Correct OTP**  
  **Password less than 5 characters**
  ### Output
  Please choose a password of atleast 5 characters long.  
  
Enter new password:  
  
  
<a name="pass_ok"></a>
## Successful Password Change
  ### Console
  Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :  
  
  Do you want to change your password? (true/false)  
Type here :  
  
You received an OTP on your registered mobile number **some phone number**.  
Your One-Time-Password for Password reset is **OTP**. Kindly do not share this with anyone.  

Please enter the OTP you received.  
  
  Please choose a strong password for safety. A minimum of 5 characters long password is required.  
Enter new Password:  
  ### Input
  1  
  true  
  **Correct OTP**  
  **Password greater than or equal to 5 characters**
  ### Output
  Password Changed Successfully!!  
  
  
  
  
<a name="account_ban_dm"></a>
## Account Banned (Deposit Money)
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :
  ### Input
3
### Output
Your account has been temporarily blocked for security reasons.  
Contact your nearest branch for removal of ban on your account.
  
  
  
<a name="wrong_pass_dm"></a>
## Entered Wrong Password (Deposit Money)
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :  
Enter your password :
  ### Input
  3  
  **some wrong password**
### Output
Your password was wrong.  
  
  
<a name="3_wrong_dm"></a>
## Entered Wrong Password 3 Times (Deposit Money)
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :  
Enter your password :  
  Enter your password :  
  Enter your password :  
  ### Input
  3  
  **some wrong password**  
  **some wrong password**  
  **some wrong password**  
### Output
Your account has been temporarily blocked for security reasons.  
Contact your nearest branch for removal of ban on your account.
  
  
<a name="inv_den_info_dm"></a>
## Invalid Denomination Info
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :  

Enter the amount you want to deposit (Rs.):  
  Please enter the following info :
Number of Rs.100 notes :   
Number of Rs.500 notes :   
Number of Rs.2000 notes :   
  
  ### Input
  3  
  **Amount to Deposit**  
  **Invalid Denomination Information**
  
  ### Output
  Please check the denomation info!  
Please input again.
  
  
<a name="deposit_dm"></a>
## Successful Deposit
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :  

Enter the amount you want to deposit (Rs.):  
  Please enter the following info :  
Number of Rs.100 notes :  
Number of Rs.500 notes :   
Number of Rs.2000 notes :   
  Enter Your Password :  
  
  ### Input
  3  
  **Amount to Deposit**  
  **Valid Denomination Information**  
  **Correct Password**
  
  ### Output
  Deposit your cash here!  
  
  
  
  
<a name="account_ban_wd"></a>
## Account Banned (Withdraw Money)
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :
  ### Input
2
### Output
Your account has been temporarily blocked for security reasons.  
Contact your nearest branch for removal of ban on your account.
  
  
<a name="wrong_pass_wd"></a>
## Entered Wrong Password (Withdraw Money)
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :  
Enter your password :
  ### Input
  2  
  **some wrong password**
### Output
Your password was wrong.  
  
  
<a name="3_wrong_wd"></a>
## Entered Wrong Password 3 Times (Withdraw Money)
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :  
Enter your password :  
  Enter your password :  
  Enter your password :  
  ### Input
  2  
  **some wrong password**  
  **some wrong password**  
  **some wrong password**  
### Output
Your account has been temporarily blocked for security reasons.  
Contact your nearest branch for removal of ban on your account.
  
  
<a name="with>max_wd"></a>
## Withdraw more than Maximum Limit
  ### Console
  Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
Type here :  

Enter the amount you want to withdraw (Rs.):  

  Enter your password :   
  
  ### Input
  2   
  **Amount to Withdraw**  
  **Correct Password**
  
  ### Output
  Sorry, amount requested exceeded the maximum limit.  
  
  
<a name="with>bal_wd"></a>
## Withdraw more than Current Balance
  ### Console
  Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
Type here :  

Enter the amount you want to withdraw (Rs.):  

  Enter your password :   
  
  ### Input
  2   
  **Amount to Withdraw**  
  **Correct Password**
  
  ### Output
  Sorry, cannot withdraw the requested amount due to insufficient balance.  
  
  
<a name="withdraw_wd"></a>
## Successful Withdraw
  ### Console
  Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
Type here :  

Enter the amount you want to withdraw (Rs.):  

  Enter your password :   
  
  ### Input
  2   
  **Amount to Withdraw**  
  **Correct Password**
  
  ### Output
  Collect your cash!  
  
  
  
<a name="account_ban_mt"></a>
## Account Banned (Transfer Money)
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :
  ### Input
4  
### Output
Your account has been temporarily blocked for security reasons.  
Contact your nearest branch for removal of ban on your account.
  
  
<a name="wrong_pass_mt"></a>
## Entered Wrong Password (Transfer Money)
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :  
Enter your password :
  ### Input
  4  
  **some wrong password**
### Output
Your password was wrong.  
  
  
  
<a name="3_wrong_mt"></a>
## Entered Wrong Password 3 Times (Transfer Money)
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
Type here :  
Enter your password :  
  Enter your password :  
  Enter your password :  
  ### Input
  4  
  **some wrong password**  
  **some wrong password**  
  **some wrong password**  
### Output
Your account has been temporarily blocked for security reasons.  
Contact your nearest branch for removal of ban on your account.
  
  
  
<a name="tran>max_mt"></a>
## Transfer Amount more than Current Balance 
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
  Type here :   

Enter Recipient's Account Number please.  
Type here :  
  Enter the amount you want to transfer (Rs.):  

  
  ### Input
  4  
  **Recipient Account Number**  
  **Amount to Transfer**  
  ### Output
  Insufficient balance to proceed with transfer.  
Please input again.
  
  
<a name="transfer_mt"></a>
## Successful Transfer
  ### Console
Change Password  ==  1  
Withdraw  ==  2  
Deposit ==  3  
Money Transfer  ==  4  
Check Balance  == 5  
Exit  ==  6  
  
  Type here :   

Enter Recipient's Account Number please.  
Type here :  
  Enter the amount you want to transfer (Rs.):  
  Enter your password :  
  
  ### Input
  4  
  **Recipient Account Number**  
  **Amount to Transfer**  
  **Correct Password**  
  ### Output
  The transaction is successful!  
