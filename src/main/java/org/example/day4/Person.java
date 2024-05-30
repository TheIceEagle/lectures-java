package org.example.day4;

import javax.xml.namespace.QName;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int weight;

    public Person(String name, String surname, int age, int weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                "Name: " + name +
                ", Surname: " + surname +
                ", Age: " + age +
                ", Weight: " + weight;
    }
}
