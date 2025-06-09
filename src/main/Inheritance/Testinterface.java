package Inheritance;

public class Testinterface implements TestA,TestB{
    @Override
    public void Dog() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Testinterface test=new Testinterface();
        test.Dog();
    }
}
