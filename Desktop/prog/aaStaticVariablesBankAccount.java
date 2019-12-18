// how to increment an ID number for a bank account or student ID

public class aaStaticVariablesBankAccount {

//private double balance;

// need these 2 instance variables to increment a bank account #
private int accountNumber;
private static int lastAssignedNumber = 1000;

public aaStaticVariablesBankAccount() {
   // set account number for specific bank account object created
   // by incrementing lastAssignedNumber for the next created account 
   this.accountNumber = ++lastAssignedNumber;
}

public static int getLastAssignedNumber() { return lastAssignedNumber; }
public int getAccountNumber() { return accountNumber; }


}

/*
Variables are shared by all instances (objects) of the class
Variables are not tied to a specific object
Can be used to track number of objects created

***remember the get method, no set mtds

ex: 
Bank Account
private static int lastAssignedNumber;
private static int numAccounts; 

Student
private static int lastStudentIDNumber;
private static int numStudents;

Above
private int accountNumber;
private static int lastAssignedNumber = 1000;



*/