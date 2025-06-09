package Recursion;//0,1,1,2,3,5,8

public class fibonacci {

    public static int fibc(int n) {
        if (n <= 1) {
            return n;

        }
        return fibc(n - 1) + fibc(n - 2);


    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            System.out.println(fibc(i));
        }
    }
}