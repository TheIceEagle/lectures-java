package org.example.day1.examples.packageExample;

import java.util.Date;
import java.util.Scanner;

public class ControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if (n>0)
//            if (n%2 == 0)
//                System.out.println(n);
//        else
//                System.out.println(n+ " is not positive");
        //delimeters
        //rearrange statements

        //Asian grading system
        String inp = scanner.nextLine();
//        if (inp.equals("A"))
//            System.out.println("Average");
//        else if (inp.equals("B"))
//            System.out.println("Below average");
//        else if (inp.equals("C"))
//            System.out.println("Cant have dinner");
//        else if (inp.equals("D"))
//            System.out.println("Dont come home");
//        else if (inp.equals("F"))
//            System.out.println("Find new family");
//        else
//            System.out.println("Go, be a youtuber");

        //Switch expressions
        int a = 2;
        int b = 3;



        switch (inp) {
            case "A" -> System.out.println("Average");
            case "B" -> System.out.println("Below average");
            case "C" -> System.out.println("Cant have dinner");
            case "D" -> System.out.println("Dont come home");
            case "F" -> System.out.println("Find new family");
            default -> System.out.println("Go, be a youtuber");
        }

//        int smbl = 'A';
//        System.out.println(smbl);
    }
}
