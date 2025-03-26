import java.util.Scanner;

import static javax.swing.UIManager.getInt;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        int reversenumb=0;

        if(n<0){
            n=0-(n);
        }
        int duplicate=n;
        while(n!=0){
            int remainder= n % 10;
            reversenumb=reversenumb*10+remainder;
             n=n/10;

        }
        System.out.println(reversenumb);

        if(duplicate==reversenumb){
            System.out.println("it is palindrome");
        }
        else {
            System.out.println("it is not a palindrome");
        }
    }
}
