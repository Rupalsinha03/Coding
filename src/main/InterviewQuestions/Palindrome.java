package InterviewQuestions;

public class Palindrome {
    public static void main(String[] args) {

        String s = "palleap";
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {

                System.out.println("palin not");
              return;
            }
        }
        System.out.println("palin");
    }
}