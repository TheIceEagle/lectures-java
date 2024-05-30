package org.example.day4;

import java.util.Objects;

public class Car {
    private String name;
    private String brand;
    private double price;

    public Car(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(price, car.price) == 0 && Objects.equals(name, car.name) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand, price);
    }

    //    @Override
//    public String toString() {
//        return "Car{" +
//                "name='" + name + '\'' +
//                ", brand='" + brand + '\'' +
//                ", price=" + price +
//                '}';
//    }
}
