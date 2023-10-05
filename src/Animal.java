import OOP.PRINCIPLES.polymorphism.Shapes;

public class Animal {


    private final Shapes shapes;

    public Animal(int num) {
        shapes = new Shapes(num);
    }

    static void goshko() {
        System.out.println("goshko");
    }
}
