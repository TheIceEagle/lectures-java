### [Return to table of content](../readme.md)
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
   





Comments


## Types and Identifiers
## Operators
## Input/Output
## Control structures
## Errors and exceptions