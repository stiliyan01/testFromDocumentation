package OOP.PRINCIPLES.Inheritance;

public class Child extends Parent {
    String childExample;

    public Child(String name, int age, String childExample) {
//        super(name, age);
        this.childExample = childExample;
    }

    @Override
    public String toString() {
        return "Child{" +
                "childExample='" + childExample + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

