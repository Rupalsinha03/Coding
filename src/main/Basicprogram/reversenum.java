//reverse a num
public class reversenum {
    public static void main(String[] args) {
        int digit;
        int rev=0;
        int num=1234;
while(num!=0){
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;

        }
        System.out.println(rev);
    }
}
