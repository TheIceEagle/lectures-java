package org.example.day1;



public class Main {
    public static void main(String[] args) {
        int n = 2;
        n++;
        System.out.println(n++);
        try {
            System.out.println(n/0);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error, can;t divide by zero");
        } finally {
            System.out.println("I will print this no matter what because this is \"finally\" block");
        }
        System.out.println(n/0);
        System.err.println("AAAAAA!!!!!");
    }
}