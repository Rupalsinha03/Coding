public class Chaining extends Parameterised{
    String x;

    Chaining (int marks,String name,String x){
        super(marks,name);
        this.x=x;

    }

    public static void main(String[] args) {
        Chaining result=new Chaining(10,"q","w");
        System.out.println(result.x + result.marks);

    }



}
