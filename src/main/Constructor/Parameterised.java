public class Parameterised {
    int marks;
    String name;

    Parameterised(int marks,String name){
        this.marks=marks;
        this.name=name;

    }

    public static void main(String[] args) {
        Parameterised parameterised=new Parameterised(10,"R");
       int x= parameterised.marks;
        System.out.println(x);

    }
}
