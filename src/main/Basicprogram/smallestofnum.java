//smallest of three num
public class smallestofnum {
    public static void main(String[] args) {
        int a=10;
        int b=11111,c=67;
        if(a>b&&a>c){
            System.out.println("biggest"+a);
        }
        if(b>a&&b>c){
            System.out.println("biggest"+b);
        }
        else{
            System.out.println("biggest"+c);
        }
    }
}
