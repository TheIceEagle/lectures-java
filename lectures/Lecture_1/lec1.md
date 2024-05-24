### [Return to table of content](../../readme.md)
# Intro to Java Lang Features

The Java programming language is a high-level language that can be characterized by all of the following buzzwords:
* Simple
* Object oriented
* Distributed
* Multithreaded
* Dynamic
* Architecture neutral
* Portable
* High performance
* Robust
* Secure

Java language was developed by James Gosling and Henry McGilton.

In the Java programming language, all source code is first written in plain text files ending with the .java extension. Those source files are then compiled into .class files by the javac compiler. A .class file does not contain code that is native to your processor; it instead contains bytecodes — the machine language of the Java Virtual Machine1 (Java VM). The java launcher tool then runs your application with an instance of the Java Virtual Machine.

![](https://docs.oracle.com/javase/tutorial/figures/getStarted/getStarted-compiler.gif)

Java has a philosophy of WORE (Wright Once Run Anywhere), due to that, java became insanely widespread around the globe. More than 4 billion devices right now are working on jvm.



![](https://docs.oracle.com/javase/tutorial/figures/getStarted/helloWorld.gif)


Let's start the main part of our lesson.

1.[ Packages and Classes]()
2. Types and Identifiers
3. Operators
4. Input/Output
5. Control structures
6. Errors and exceptions



## Packages and Classes

 In java classes are organised in _packages_  

 What does it mean? It means that fundamental unit of every java program _class_ is grouped in _packages_.
 Let's see some examples:
    [Link to package example](/Users/admin/IdeaProjects/open-java/src/main/java/org/example/day1/DemoPackage.java)

```java
package org.example.day1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```
**Note good to know:**
1. All Java methods must be contained in a class.
2. The words _class_, _public_, _static_, and _void_ are reserved words, also called [_keywords_](https://en.wikipedia.org/wiki/List_of_Java_keywords). (This means they have specific uses in Java and may not be used as identifiers.)
3. The keyword public signals that the class or method is usable outside of the class, whereas private data members or methods (see Chapter 3) are not.
4. The keyword static is used for methods that will not access any objects of a class, such as the methods in the FirstProg class in the example above. This is typically true for all methods in a source file that contains no instance variables (see Chapter 3). Most methods in Java do operate on objects and are not static. The main method, however, must always be static.
5. The program shown above is a Java application.
6. There are three different types of comment delimiters in Java:

   * /* … */, which is the one used in the program shown, to enclose a block of comments. The block can extend over one or more lines.
   * //, which generates a comment on one line.
   * /** … */, which generates Javadoc comments. These are used to create API documentation of Java library software.
 

## Types and Identifiers
*  ### Identifiers

An **identifier** is a name for a variable, parameter, constant, user-defined method, or userdefined class. In Java, an identifier is any sequence of letters, digits, and the underscore character.
The naming convention for the identifier is usually **_CamelCase_**.
    
examples of CamelCase. _getName, findSurfaceArea, preTaxTotal_ 

The naming of classes starts with capital letter such as _class Main, class String_.



* Identifiers may not begin with a digit.
```java
int variable1; // allowed
int _variable; // allowed
int 1variable; // not allowed
```


Identifiers are case-sensitive, which means that number and Number are different. number ≠ Number.
```java
int number;
int Number; // this variable is different from the previous
```

* Wherever possible, identifiers should be concise and self-documenting. A variable called area is more illuminating than one called a.
```java
int area; // good example
int perimeter; // good example
int a; // bad example
```

### **Naming convention**
It is important to format code properly in Java. For this purpose, lowerCamelCase is used for variables and methods and UpperCamelCase for class names. It means that identifiers for variables and methods are lowercase.Uppercase letters are used to separate these into multiple words, for example, getAge, myVariable. However, a class name starts with a capital letter.
```java
//UpperCamelCase
Class MyExampleClass {
...
}

// lowerCamelCase
public void myExampleMethod (int number) {
...
}

int myExampleVariable; // lowerCamelCase
```

### Data types
Every identifier in a Java program has a type associated with it. These data types are divided into two types - primitives and reference. Now, we will cover primitive data types and discuss reference types later.

* Java includes 8 primitive data types:
    ![img.png](img.png)
### **Why do we need so many integer types?**
It is important to take into account memory usage during optimization of our program. The less memory our program uses, the faster it works.

The main difference between byte, short, int, long is their size. When we declare a variable, memory is automatically allocated for it depending on its type. It is important to declare a correct type of variable if you know exactly how big the number will be and how often it will change so that you can save as much memory as possible or, conversely, allocate enough memory in advance. If you try to store a value whose magnitude is too big in an int variable, you'll get an overflow error. (Java gives you no warning. You just get a wrong result!)

Table with sizes of numerical data types:
![img_1.png](img_1.png)

Here are examples of declaration and initialization of each primitive type:
boolean myBoolean = true; // true

```java
byte myByte = 1; // 1
byte myByte = 1000; // Error

char myChar = 'a'; // a

short myShort = 11; // 11
short myShort = 40000 // Error

int myint = 100; // 100

long myLong = 1000; // 1000

float myFloat = 11.5; // 11.5

double myDouble = 101.2;
double myDouble = 20 / 7; // 2.0 (integer division)
double myDouble = 20.0 / 7.0; // 2.857142857142857
```
### **Type Casting**

In java **type casting** is a method that coverts data from one type to another data type. It works both manually and automatically.  The automatic conversion is done by the compiler and manual conversion performed by the programmer.

* Widening Casting (automatically) - converting a smaller type to a larger type size

`byte -> short -> char -> int -> long -> float -> double`

![uVNKk.png](..%2F..%2F..%2F..%2FDesktop%2FuVNKk.png)
```java
public class Main {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
  }
}
```
* Narrowing Casting (manually) - converting a larger type to a smaller size type

`double -> float -> long -> int -> char -> short -> byte`
```java
public class Main {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}
```
! IF you try to downcast a type, an _overflow error_.

**Variables**

* Variables in Java can be initialized in two different ways:

``` java
int myVariable;
myVariable = 2; // default initialization

int num = 4; // initalization in the declaration
```
* One type can be cast to another type if appropriate

```java
int total = 3, n = 2;
double average;

average = (double) total/n;
// or
average = total/(double) n;
```

Assigning int to a double automatically casts the int to double.

```java
int num = 3;
int double doubleNum = num; // num is cast to double
```

* However, assigning a double to int causes a compile-time error.
```java
double num = 3.7;
int intNum = num; // Error

int intNum = (int) num; // Will round num to 3
```

* As you may have noticed, casting a floating point number to an integer simply truncates the number. If you want to round your number to the nearest integer, you need to write:

```java
double num = 3.7;
int roundedNum = (int) (num + 0.5); // roundedNum = 4

ouble negNum = -4.8;
int roundedNegNum = (int) (negNum - 4.8); // roundedNegNum = -5
```


### Final variables
A final variable or user-defined constant, identified by the keyword final, is a quantity whose value will not change. By conventions, final variables are capitalized and use '_' symbol to distinguish between words.

* Some examples of final declarations:

```java
final int YEAR_OF_BIRTH = 2003;
final double MY_WEIGHT = 62.320;

```
* A final variable can declared without initializing it immediately

```java
int age = 21;
final boolean IS_ADULT;

if (age >= 18)
IS_ADULT = true;
else
IS_ADULT = false;
```

## Operators

## Input/Output
## Control structures
## Errors and exceptions