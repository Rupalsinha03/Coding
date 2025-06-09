package Interface;

public class B implements A {

    @Override
    public void testing() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        B obj=new B();
        obj.testing();

    }
}
