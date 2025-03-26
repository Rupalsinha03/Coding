public class defaultConstructor {
    String name;
    int age;
    int id;
    defaultConstructor(){
        this.name=name;
        this.age=age;
        this.id=id;
        System.out.println("parent constructor");
    }

    void display(){
        System.out.println("default");
    }

    public static void main(String[] args) {
        defaultConstructor defaultConstructor= new defaultConstructor();
        defaultConstructor.display();
    }

}
