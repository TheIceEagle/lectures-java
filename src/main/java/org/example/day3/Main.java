package org.example.day3;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Programmer p = new Programmer();

        p.setName("John Elephant");
        p.setYearOfBirth(1985);
        p.setAddress("Some street, 15");
        p.setStartDate(new Date());
        p.setSalary(500_000L);
        p.setProgrammingLanguages(new String[] { "Java", "Scala", "Kotlin" });

        System.out.println(p.getName()); // John Elephant
        System.out.println(p.getSalary()); // 500000
        System.out.println(Arrays.toString(p.getProgrammingLanguages())); // [Java, Scala, Kotlin]
    }
}
