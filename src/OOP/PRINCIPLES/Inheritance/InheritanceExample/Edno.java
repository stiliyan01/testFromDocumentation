package OOP.PRINCIPLES.Inheritance.InheritanceExample;

public class Edno {
    String name;
    String age;

    public Edno(String name, String age) {
        System.out.println("konstruktora na edno");
        this.name = name;
        this.age = age;
    }
    public void tempEdno(){
        System.out.println("funckita temp v edno");
    }
}
