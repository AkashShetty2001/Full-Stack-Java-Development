package Encapsulation;

// Class representing a Bank Account
class Bank {

    // Encapsulation: Keeping instance variables private to restrict direct access
    private String accountHolderName;
    private String accountNumber;
    private Double accountBalance;

    // Default Constructor (Constructor Overloading)
    // Used to initialize an object with default values (no parameters)
    public Bank() {
    }

    // Parameterized Constructor
    // Used to initialize an object with provided values using 'this' keyword
    public Bank(String accountHolderName, String accountNumber, Double accountBalance) {
        this.accountHolderName = accountHolderName;  // 'this' differentiates instance variable from parameter
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    // Setter Method for accountHolderName
    // Used to modify private data (Encapsulation)
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter Method for accountHolderName
    // Used to retrieve private data (Encapsulation)
    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    // Setter Method for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter Method for accountNumber
    public String getAccountNumber() {
        return this.accountNumber;
    }

    // Setter Method for accountBalance
    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // Getter Method for accountBalance
    public Double getAccountBalance() {
        return this.accountBalance;
    }
}

// Main class to test the Bank class functionality
public class BankAccountExample {
    public static void main(String args[]) {

        // Creating an object using the default constructor
        Bank account1 = new Bank();
        System.out.println("Using setters to set the values for account1");

        // Using setters to assign values (Encapsulation)
        account1.setAccountHolderName("Akash K D");
        account1.setAccountNumber("1234567890");
        account1.setAccountBalance(20000d);

        // Creating an object using the parameterized constructor
        System.out.println("Using constructor to initialize the properties of account2");
        Bank account2 = new Bank("Ashu", "9876543210", 10000d);

        // Modifying the balance of account2 using setter method
        account2.setAccountBalance(5000d);

        // Using getters to retrieve and display values (Encapsulation)
        System.out.println("Using getters to print the values of both accounts:");
        
        System.out.println("Account 1 Details:");
        System.out.println("Name: " + account1.getAccountHolderName());
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Balance: " + account1.getAccountBalance());

        System.out.println("=================================");

        System.out.println("Account 2 Details:");
        System.out.println("Name: " + account2.getAccountHolderName());
        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Balance: " + account2.getAccountBalance());
    }
}

/*
 * Concepts Used in the Code:
 * 
 * 1. **Classes & Objects** - The `Bank` class represents a blueprint, and `account1`, `account2` are objects of that class.
 * 
 * 2. **Encapsulation** - All data members are `private` and accessed using `setters` and `getters`.
 * 
 * 3. **Constructors** - 
 *    - **Default constructor** initializes an object without parameters.
 *    - **Parameterized constructor** initializes an object with given values using `this()`.
 * 
 * 4. **this Keyword** - Used to differentiate between instance variables and parameters inside the constructor and setter methods.
 * 
 * 5. **Setters & Getters** - 
 *    - **Setters** modify private variables.
 *    - **Getters** retrieve private variable values.
 * 
 * 6. **Printing Object Data** - Using `System.out.println()` to display values stored in objects.
 */
