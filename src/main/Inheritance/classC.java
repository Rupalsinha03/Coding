package Inheritance;

import Inheritance.interface2;

public class classC implements interface1, interface2{
    public static void methodC(){
        System.out.println();
    }
    public static void inter1(){
        System.out.println("work1");
    }
    public static void interface2(){
        System.out.println("work");
    }
    public static void inter3(){
        System.out.println("work3");
    }
    public static void main(String[] args) {
        classC c=new classC();
        c.inter1();
        c.inter3();
        //c.methodA();
    }
}
