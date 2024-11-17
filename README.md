# Bank_Management_System

## Overview

The Bank Management System is a Java-based desktop application that simulates banking operations like balance inquiry, cash withdrawal, viewing transaction history, and changing PINs. This project is designed to demonstrate how to develop a secure, user-friendly banking application using Java, Swing, and MySQL.
The application focuses on providing a simple yet effective interface for bank customers to perform transactions. The backend is powered by MySQL, while JDBC is used to connect the database with the Java application.


## Technologies Used

Java: Core programming language for developing the application

Swing: Used for creating a responsive and intuitive graphical user interface (GUI).

MySQL: Backend database for storing user details, account information, and transaction history.

JDBC: Java Database Connectivity to interact with the MySQL database.

IntelliJ IDEA / Eclipse: Recommended IDEs for Java development.



## The ATM Management System includes the following functionalities:

Balance Inquiry: Displays the user’s current balance.

Cash Withdrawal: Allows users to withdraw cash.

Mini Statement: Displays recent transactions for the account.

PIN Change: Users can change their PIN securely.

Exit: Allows users to exit the ATM interface.

## Project Structure

The project is organized into several Java classes, each responsible for specific functionalities:

Login.java: Handles user authentication by verifying the entered card number and PIN.

Signup.java, SignupTwo.java, SignupThree.java: Facilitates the multi-step user registration process, collecting details like personal information, account type, and facilities.

BalanceEnquiry.java,FastCash.java,Withdrawl.java,Deposit.java: Provides options like balance inquiry, cash withdrawal and Cash deposit.

Pin.java: Allows users to change their PIN securely.

Mini.java: Displays a mini statement of recent transactions.

conn.java: Handles the database connection using JDBC.

## Database Structure

The MySQL database consists of five tables designed to store user information and transaction history:

signup: Stores personal details such as name, address, and email.
Columns: form_no, name, father_name, DOB, gender, email, marital_status, address, city, pincode, state

signuptwo: Collects additional user information like religion, income, and occupation.
Columns: form_no, religion, category, income, education, occupation, pan, aadhar, seniorcitizen, existing_account

signupthree: Stores account-specific details including account type, card number, and PIN.
Columns: form_no, account_Type, card_number, pin, facility

login: Stores login credentials for users.
Columns: form_no, card_number, pin

bank: Maintains transaction history including deposits, withdrawals, and current balance.
Columns: pin, date, type (deposit/withdrawal), amount


 
