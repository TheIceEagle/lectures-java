package org.example.day4;

import static java.lang.Integer.valueOf;

public class DoubleExamples {
    public static String stringMethod(Double d) {
        return String.valueOf(d);
    }
    public static int sum(int a, int b) {
        return a+b;
    }

    //Double(double value)
    //double doubleValue()
    //
    //
    public static void main(String[] args) {
        double e = 15D;

        System.out.println(DoubleExamples.stringMethod(e));

        int a = 5;
        int b = 5;
        Integer ac = 25;
        Integer ab = new Integer(25);
        System.out.println();
        System.out.println(DoubleExamples.sum(ac,ab));

        System.out.println(a == b);
        System.out.println(ac == ab); // Why true if only primitive value? only one instance of Integer object;



        Integer intOb1 = 4; //boxing
        int n = 4;
        System.out.println(intOb1 == n); //Object automatically unboxed;



        Integer intObja = 4;//boxing
        Integer intObjb; //boxing
        intObjb = Integer.valueOf(4);
        System.out.println(intObja.intValue() == intObjb.intValue());//unboxing done first

        int num = 2;
        System.out.println(intObja > num);

    }
}
