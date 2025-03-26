import java.util.Scanner;


public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String name =sc.nextLine();
        StringBuilder reverse = new StringBuilder("");

        for(int i=name.length()-1;i>=0;i--){
            reverse.append(name.charAt(i));
        }

        System.out.println(reverse);
        String reversedString = reverse.toString();
        
        if(name.equals(reversedString)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
