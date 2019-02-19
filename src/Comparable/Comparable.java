package Comparable;

import java.util.Arrays;

public class Comparable {
    public static void main(String[] args) {
        Car lexus = new Car("Lexus", 20000, 320, "Grey");
        Car[] c = {new Car("BMW", 45000, 285, "Blue"),
                new Car("Smart", 35000, 210, "Black-Red"), lexus};
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
