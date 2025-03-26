//x^n(height=logn)
public class Power2 {
public static int powerlogn(int x,int n){
    if(n==1){
        return x;
    }

    if(n%2==0){
        int power=powerlogn(x,n/2);
        return power*power;
    }
    else {
        int powerodd = powerlogn(x, n - 1);
        return powerodd * x;
    }

}
    public static void main(String[] args) {
    int ans=powerlogn(2,2);
        System.out.println(ans);


    }

}
