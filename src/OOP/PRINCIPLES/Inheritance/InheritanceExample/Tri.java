package OOP.PRINCIPLES.Inheritance.InheritanceExample;

public class Tri extends Dve {

    public Tri(String name, String age) {
        super(name, age);

        System.out.println(" konstruktora na tri");
    }

    public void tempTri() {
        System.out.println("funckiqta v tri");
    }

    @Override
    public String toString() {
        return "Tri{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
