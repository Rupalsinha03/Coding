package Polymorphism;

public class Overloading {

    public int operate(int a){
        // a=10;
        return a;
    }

    public int operate(int a, int b){
       // a=20;
       // b=10;
        return a+b;
    }

    public double operate(int a, double b){
       // a=20;
        //b=34.5;
       return a+b;
    }

    public static void main(String[] args) {
        Overloading over= new Overloading();
     // over.operate(20,20.5);
        System.out.println(over.operate(20,20));
    }

}
