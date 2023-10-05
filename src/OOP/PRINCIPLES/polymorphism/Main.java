package OOP.PRINCIPLES.polymorphism;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Shapes shapes = new Shapes(4);
        System.out.println(shapes.num);
        Circle circle = new Circle(4);
        System.out.println(circle.num);

    }



}
