public class no_Argument {
    String name="S";
    no_Argument(){
      this.name="R";

    }

    public static void main(String[] args) {
        no_Argument no_argument=new no_Argument();
        String s=no_argument.name;
        System.out.println(s);
    }

}
