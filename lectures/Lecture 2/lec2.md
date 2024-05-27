### [Return to table of content](../../readme.md)

# Classes and Objects

## Objects

Every program that you write involves at least one thing that is being created or manipulated by the program. This thing, together with the operations that manipulate it, is called an object.

Consider, for example, a program that must test the validity of a four-digit code number that a person will enter to be able to use a photocopy machine. Rules for validity are provided. The object is a four-digit code number. Some of the operations to manipulate the object could be `readNumber, getSeparateDigits, testValidity, and writeNumber`.

Any given program can have several different types of objects. For example, a program that maintains a database of all books in a library has at least two objects:

1. A Book object, with operations like `getTitle, isOnShelf,isFiction, and goOutOfPrint`.
2. A ListOfBooks object, with operations like `search, addBook, removeBook, and sortByAuthor`.
An object is characterized by its state and behavior. For example, a book has a state described by its title, author, whether it’s on the shelf, and so on. It also has behavior, like going out of print.

Notice that an object is an idea, separate from the concrete details of a programming language. It corresponds to some real-world object that is being represented by the program.

All object-oriented programming languages have a way to represent an object as a variable in a program. In Java, a variable that represents an object is called an object reference.

## Classes
A class is a software blueprint for implementing objects of a given type. An object is a single instance of the class. In a program there will often be several different instances of a given class type.

The current state of a given object is maintained in its data fields orinstance variables, provided by the class. The methods of the class provide both the behaviors exhibited by the object and the operations that manipulate the object. Combining an object’s data and methods into a single unit called a class is known as encapsulation.

* Here is the framework for a simple bank account class:

```java

public class BankAccount
{
private String password;
private double balance;
public static final double OVERDRAWN_PENALTY = 20.00;
//constructors
/** Default constructor.
* Constructs bank account with default values. */
  public BankAccount() { /* implementation code */ }
  /** Constructs bank account with specified password and balance. */
  public BankAccount(String acctPassword, double acctBalance) { /* implementation code */ }
  //accessor
  /** @return balance of this account */
  public double getBalance() { /* implementation code */ }
  //mutators
  /** Deposits amount in bank account with given password.
* @param acctPassword the password of this bank account
* @param amount the amount to be deposited
  */
  public void deposit(String acctPassword, double amount) { /* implementation code */ }
  /** Withdraws amount from bank account with given password.
* Assesses penalty if balance is less than amount.
* @param acctPassword the password of this bank account
* @param amount the amount to be withdrawn
  */
  public void withdraw(String acctPassword, double amount) { /* implementation code */ }
  }
```


### Public, private and static
The keyword `public` preceding the class declaration signals that the class is usable by all client programs. If a class is not public, it can be used only by classes in its own package. In the AP Java subset, all classes are public.

Similarly, public methods are accessible to all client programs. Clients, however, are not privy to the class implementation and may not access the private instance variables and private methods of the class. Restriction of access is known as information hiding. In Java, this is implemented by using the keyword `private`. `Private methods` and variables in a class can be accessed only by methods of that class. Even though Java allows public instance variables, in the AP Java subset all instance variables are private.

A `static variable` (class variable) contains a value that is shared by all instances of the class. “Static” means that memory allocation happens once.

Typical uses of a static variable are to

* keep track of statistics for objects of the class.
* accumulate a total.
* provide a new identity number for each new object of the class
For example:
```java
public class Employee {
private String name;
private static int employeeCount = 0; //number of employees
public Employee( < parameter list > ) {
< initialization of private instance variables >
employeeCount++; //increment count of all employees
}
...
}
```


Notice that the static variable was initialized outside the constructor and that its value can be changed.

Static final variables (constants) in a class cannot be changed. They are often declared public. The variable `OVERDRAWN_PENALTY` is an example in the BankAccount class. Since the variable is public, it can be used in any client method. The keyword static indicates that there is a single value of the variable that applies to the whole class, rather than a new instance for each object of the class. A client method would refer to the variable as `BankAccount.OVERDRAWN_PENALTY`. 

In its own class it is referred to as simply OVERDRAWN_PENALTY.

# Methods

## Headers

All method headers, with the exception of constructors and static methods, look like this:
![img.png](images/img.png)

* The access specifier tells which other methods can call this method (public, private and static in the previous page).
* A return type of void signals that the method does not return a value. All other return types are typical data types and method returns the same data type.
* Items in the parameter list are separated by commas.
* The implementation of the method directly follows the header, enclosed in a {} block.

Here is an example from the previous BankAccount class:

```java
public double getBalance() {
  return this.balance;
}
// this method returns a balance of type double and it has a public access specifier
```

## Type of methods

### Constructors

A constructor creates an object of the class. You can recognize a constructor by its name—always the same as the class. Also, a constructor has no return type.

Having several constructors provides different ways of initializing class objects. For example, there are two constructors in the BankAccount class.

1. The default constructor has no arguments. It provides reasonable initial values for an object. Here is its implementation:

```java
// Constructs a bank account with default values
public BankAccount() {
  password = "";
  balance = 0.0;
}
```

In a client method, the declaration:

```java
BankAccount bankAcc = new BankAccount();

```
constructs a BankAccount object with a balance of zero and a password equal to the empty string. The new operator returns the address of this newly constructed object. The variable bankAcc is assigned the value of this address—we say “bankAcc is a reference to the object.” Picture the setup like this:

2. The constructor with parameters sets the instance variables of a BankAccount object to the values of those parameters.
Here is the iplementation:

```java
// Constructs a bank account with specified password and balance
public BankAccount(String acctPassword, double acctBalance) {
  password = acctPassword;
  balance = acctBalance;
}
```

In a client program a declaration that uses this constructor needs matching parameters:

`BankAccount bankAcc2 = new BankAccount("Nazym", 800.00);
`
`bankAcc` and `bankAcc2` are object variables that store the addresses of their respective BankAccount objects. They do not store the objects themselves.

### Accessors

An accessor method accesses a class object without altering the object. An accessor returns some information about the object.

The BankAccount class has a single accessor method, getBalance(). Here is its implementation:

```java
// return the balance of this account
public double getBalance() {
  return balance;
}
```