# 💰 EMI Calculator (Java Console App)

This is a simple Java console application that calculates the **Equated Monthly Installment (EMI)** for a loan, based on user input.

## 📚 How It Works

The program calculates EMI using the standard formula:

EMI = [P × r × (1 + r)^n] / [(1 + r)^n – 1]

Where:
- `P` = Principal Loan Amount
- `r` = Monthly Interest Rate (Annual Interest Rate / 12 / 100)
- `n` = Loan Tenure in Months

## 🛠️ Features

- Accepts user input for:
  - Loan amount (USD)
  - Annual interest rate (as %)
  - Loan tenure (in years)
- Calculates and displays the monthly EMI

## 🧪 Example

```text
Enter your loan amount in USD
50000
Enter annual interest rate (in %)
7.5
Enter loan tenure in years
5
Your monthly EMI is: 1001.90
🧑‍💻 How to Run (In Eclipse)
Create a new Java project (or use existing one)

Place the file in src/day4/EMICalculator.java

Right-click the file and select Run As > Java Application

Follow the console prompts to enter your loan details

📂 Project Structure
src/
└── day4/
    └── EMICalculator.java
📌 Requirements
Java 8 or higher

Eclipse IDE (or any Java IDE)

JDK properly configured in project build path

📄 Author
This project was created as a beginner Java practice program. Great for learning basic user input, math operations, and console output.

🚀 What's Next?
You can extend this project by:

Adding currency formatting

Validating inputs

Supporting multiple loan types or interest options
