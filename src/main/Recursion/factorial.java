public class factorial {

    public static int factorial(int n){
        if(n==1){
            return 1;
        }

       // System.out.println(n);
        return n * factorial(n-1);

    }


    public static void main(String[] args) {
        int n=4;
        int multi;
       multi= factorial(n);
        System.out.println(multi);

    }
}
