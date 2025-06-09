package Strings;

public class BasicsOfStrings {

    public static void main(String[] args) {

        String s = "Hello";
        String s1 = new String("Pune");
        System.out.println(s);
        System.out.println(s1);
        int s2=s.indexOf("l");
        System.out.println(s2);
        String s3=s.concat(s1);
        System.out.println(s3);
        String s4=s+" "+s1;
        System.out.println(s4);
        char c=s.charAt(1);
        System.out.println(c);



    }
}