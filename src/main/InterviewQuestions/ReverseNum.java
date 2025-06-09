package InterviewQuestions;

public class ReverseNum {
    public static void main(String[] args) {

        int num = 123;
        int lastdigitextract = 0;
        int rev = 0;
        while (num != 0) {
            lastdigitextract = num % 10;
            rev = rev* 10+ lastdigitextract;
            num = num / 10;

        }
        System.out.println(rev);
    }
}