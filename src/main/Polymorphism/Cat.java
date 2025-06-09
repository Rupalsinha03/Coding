package Polymorphism;

public class Cat extends Animal{

    public void TestAnimal() {
        System.out.println("many dog barks and bite");
    }


    public static void main(String[] args) {
        Animal result=new Dog();
        Animal re= new Cat();
       result.TestAnimal();
       re.TestAnimal();
    }
    }

