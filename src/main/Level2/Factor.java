public class Factor {
    public static int factorialOfNum(int n)
    {
        if(n==1){
            return 1;
        }
        return n* factorialOfNum(n-1);

    }

    public static void main(String[] args) {
        int n=50;
        int i;
        int k=factorialOfNum(n);
        System.out.println(k);
    }
}
