package Strings;

public class LeftRotate {


    public static void main(String[] args) {
        String s = "qwertyu";//ertyuqw
        int k=2;
        String rotatedString= rotate(s, 2);
        System.out.println(rotatedString);


        }

    public static String rotate(String s, int k) {
        int n=s.length();
        k=k%n;


        return (s.substring(k))+(s.substring(0,k));


    }

}

