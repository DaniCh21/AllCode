package Comparable;

import java.lang.Comparable;

public class Car implements Comparable {
    String model;
    int price;
    int speed;
    String color;

    @Override
    public int compareTo(Object o) {
        return ((Car)o).price - this.price;             //From bigger to smaller
    }

    public String toString(){
        return this.model + " " + this.price + " " + this.speed + " " + this.color;
    }

    Car(String model, int price, int speed, String color){
        this.model = model;
        this.price = price;
        this.speed = speed;
        this.color = color;
    }
}
