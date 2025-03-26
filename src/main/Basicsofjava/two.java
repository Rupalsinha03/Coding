public class two {
    public static void main(String[] args) {
        int a[]=new int[10];
        int sum=0;
        for (int i=0;i< a.length;i++){
                a[i]=i+1;
                sum=sum+a[i];
            System.out.println(a[i]);
            }

        System.out.println(sum);
    }
}
