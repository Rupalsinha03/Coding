//x^n(height=n)->x^2=x^1,x^1,   X^3=X^2,X^2,X//allwould be power=x(n-1)..n-2
public class Power1 {
    public static int printPower(int x,int n){
        if(n==0){
            return 1; //we consider x^0=1
        }
        if(x==0){
            return 0;
        }
        int calXpowN=printPower(x,n-1);
        int total=x*calXpowN;
        return total;
    }

    public static void main(String[] args) {

        int x,n;
        int key=printPower(2,3);
        System.out.println(key);

    }
}
