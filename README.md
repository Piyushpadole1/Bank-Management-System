# 🏦 Bank Management System

A **console-based Bank Management System developed using Core Java**, designed to simulate fundamental banking operations while demonstrating important **Object-Oriented Programming (OOP)** concepts.

The project provides functionality for managing customers, bank accounts, deposits, withdrawals, and transactions through a simple command-line interface.

---

## 🚀 Features

- 👤 Customer management
- 🏦 Bank management
- 💳 Account creation
- 💰 Deposit money
- 💸 Withdraw money
- 💵 Check account balance
- 📋 View account details
- 🔄 Transaction management
- 🏦 Support for different account types
  - Savings Account
  - Current Account
- 🔢 Automatic account number generation
- ⚠️ Basic validation for banking operations
- 🖥️ Interactive console-based interface

---

## 🛠️ Technologies Used

- **Java**
- **Core Java**
- **Object-Oriented Programming (OOP)**
- **Java Collections**
- **Exception Handling**
- **Scanner for User Input**
- **Git & GitHub**

---

## 🧠 OOP Concepts Implemented

### Encapsulation
Banking and customer data is encapsulated within classes and accessed through appropriate methods.

### Inheritance
Different account types inherit common properties and behaviors from the `Account` class.

Account
├── SavingAccount
└── CurrentAccount

### Abstraction
Common account-related behavior is defined at the parent level, allowing different account types to implement their own specific behavior.

### Polymorphism
Parent-class references are used to work with different account types, allowing account-specific behavior to be handled dynamically.

### Association

Bank → Customers → Accounts → Transactions


## 📂 Project Structure

```
Bank-Management-System/
│
├── JAVACODE/
│   └── src/
│       ├── Account.java
│       ├── Bank.java
│       ├── CurrentAccount.java
│       ├── Customer.java
│       ├── Main.java
│       ├── SavingAccount.java
│       └── Transaction.java
│
├── .gitignore
├── JAVACODE.iml
└── README.md
```
## 🏗️ Class Overview

| Class | Responsibility |
|---|---|
| `Account` | Represents common properties and operations of a bank account |
| `SavingAccount` | Represents a savings account and its specific behavior |
| `CurrentAccount` | Represents a current account and its specific behavior |
| `Customer` | Stores and manages customer information |
| `Bank` | Handles bank-level account and customer management |
| `Transaction` | Represents banking transactions |
| `Main` | Entry point and console-based user interaction |

---

## 🔄 Account Hierarchy


                 Account
                    │
          ┌─────────┴─────────┐
          │                   │
          ▼                   ▼
   SavingAccount       CurrentAccount


---

## 🔁 Application Flow


                 ┌───────────────┐
                 │     START     │
                 └───────┬───────┘
                         │
                         ▼
                 ┌───────────────┐
                 │    Main Menu  │
                 └───────┬───────┘
                         │
             ┌───────────┼───────────┐
             │           │           │
             ▼           ▼           ▼
       Create Account  Deposit    Withdraw
             │           │           │
             └───────────┼───────────┘
                         │
                         ▼
                  Check Balance
                         │
                         ▼
                  Transactions
                         │
                         ▼
                       Exit


---

## 💻 How to Run

### Prerequisites
Install Java JDK on your system, then verify:


java --version

javac --version

### Clone the Repository


git clone https://github.com/Piyushpadole1/Bank-Management-System.git

cd Bank-Management-System


### Run the Project

Open the project in IntelliJ IDEA, Eclipse, or VS Code, navigate to `JAVACODE/src/Main.java`, and compile/run it.

---

## 🖥️ Example Console


========================================
       BANK MANAGEMENT SYSTEM
========================================

1. Create Account
2. Deposit
3. Withdraw
4. Check Balance
5. Account Details
6. Transactions
7. Exit

Enter your choice:


---

## 📚 Learning Objectives

- Classes and Objects, Constructors
- Encapsulation, Inheritance, Abstraction, Polymorphism
- Method Overriding, Interfaces / Abstract Behavior
- Java Collections, Exception Handling
- Object Relationships, User Input using Scanner
- Random Account Number Generation
- Modular Java Project Design, Git and GitHub

---

## 🔮 Future Improvements

- 🗄️ MySQL database integration
- 🔐 Customer login and authentication
- 🔑 PIN/password authentication
- 📜 Complete transaction history
- 💾 Persistent data storage
- 📊 Admin dashboard
- 🧾 Bank statement generation
- 🖥️ GUI using JavaFX or Swing
- 🌐 REST API integration
- 🔒 Improved security and input validation

---

## 🎯 Project Objective

The primary objective of this project is to build a practical banking application using Core Java while gaining hands-on experience with Object-Oriented Programming and software design principles. It demonstrates how real-world entities such as customers, accounts, banks, and transactions can be modeled using Java classes and their relationships.

---

## 👨‍💻 Author

**Piyush Satish Padole**
B.Tech Computer Science & Engineering

---

## ⭐ Repository

[Bank Management System](https://github.com/Piyushpadole1/Bank-Management-System)

⭐ If you find this project useful, consider giving the repository a star!
