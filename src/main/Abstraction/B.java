package Abstraction;

public class B extends A{

    void test(){
        System.out.println("test");
    }

    public void check(){
        System.out.println("check 2");
    }

    public static void main(String[] args) {
        B obj=new B() ;
        obj.test();
        obj.check();

    }

}
