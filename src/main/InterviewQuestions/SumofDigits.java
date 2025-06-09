package InterviewQuestions;

public class SumofDigits {

    public static void main(String[] args) {
        int sum=0;
        int lastdigitextract=0;
        int n=-123;
        int num= Math.abs(n);

        while(num>0) {
            lastdigitextract = num % 10;
            sum += lastdigitextract;
            num = num / 10;
        }
        System.out.println(sum);

    }
}
//if this is having negative num then use math.abs(num)