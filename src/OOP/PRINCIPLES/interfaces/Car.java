package OOP.PRINCIPLES.interfaces;

public class Car implements Engine,Brake{


    @Override
    public String name() {
        return "goshko";
    }

    @Override
    public int acc(int a) {
        return a;
    }
}
