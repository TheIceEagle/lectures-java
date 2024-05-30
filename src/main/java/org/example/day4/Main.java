package org.example.day4;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        String a = "abcef";
        // length();
        System.out.println(a.length());
        //substring
        System.out.println();

        String b = a.substring(1);
        System.out.println(b);

        String c = a.substring(1,3);
        System.out.println(c);

        String str = "MoonLand";
        String sub = "Land";
        int x = str.indexOf(sub);
        System.out.println(x);






    /*
        String str1 = "abc";
        String str2 = "abc";

        String s = "two!";
        String b = new String("two!");

        //if str1.compareTo(str2) < 0 than str1 it precedes str2
        //if str1.compareTo(str2) > 0 than that str1 follows str2 lexicographically
        System.out.println(str1.compareTo(str2));

        System.out.println(str1 == str2);

        System.out.println(s == b);

     */







        /*
        String state = "Alaska";
        String dessert = "baked " + state; //dessert has value "baked Alaska”

        int five = 5;
        int two = 2;

        String concat = state+" "+five;
        String concatNumberFirst = five+two+" "+state+five+two;
        System.out.println(concat);
        System.out.println(concatNumberFirst);
        */

    /*
        Date date = new Date();
        String currentDate = "Current date is: "+date;
        String concat = String.valueOf(date) + String.valueOf(date);
        System.out.println(concat);
        */



//        String c = "str";
//        String str = new String("str");
//
//        String ref1 = "hello";
//        ref1 ="bye";
//
//        String ref2 =new String("month");
//        ref2 = new String("week");
//
//        String period = ref1+ref2;
//
//
//
//        System.out.println(period);
//
//        String s = null;
//        s = "Initialised";
//
//        System.out.println();



//        Car car1 = new Car("Camry","Toyota",35_000);
//        Car car3 = car1;
//        Car car2 = new Car("Camry","Toyota",35_000);
//        System.out.println(car.toString());
//        System.out.println(car);
//
//        boolean isEqual = car1.equals(car2);
//        System.out.println(car1.equals(car2));
    }
}
