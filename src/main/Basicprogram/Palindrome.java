public class Palindrome {
    public static void main(String[] args) {
        int n=121;
        int rev=0;
        int num=n;
       // int revnum;
        while (n!=0){
            int digit =n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        //System.out.println(rev);
        if(rev==num){
            System.out.println("it is a palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}
