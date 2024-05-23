package org.example.day1;

/*
This is the where example of how package import is working
*/

public class DemoPackage {

    public static int methodSquare(int a) {
        return a*a;
//        System.out.println(a *a);
    }
    public static double methodVAT(double tax) {
//        System.out.println();
        return tax*1.12;
    }

    public static void main(String[] args) {
        System.out.println(methodSquare(1000));

    }

    // Single line comments
    /*
        Multi line comments
    */



}
