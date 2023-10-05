package OOP.PRINCIPLES.Inheritance;

public class Parent {
    public String name;
     int age;

    public Parent(){
        name="purvi konstruktor";
        age=-1;
    }
    public Parent(String name, int age) {
        this.name = name;
        this.age=age;

    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}