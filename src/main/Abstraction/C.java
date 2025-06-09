package Abstraction;

public class C extends B{
    @Override
    public void check() {
        System.out.println("check3");
    }

    public static void main(String[] args) {
        B obj=new C() ;
        obj.test();
        obj.check();
    }

}
