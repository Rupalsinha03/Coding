package InterviewQuestions;

public class FibonacciSeries {
    public static void Fibonacci(int a, int b){

        int next=0;

        for(int i=0;i<10;i++){
            System.out.println(a+"");
            next=a+b;
            a=b;
            b=next;
        }


    }

    public static void main(String args[]) {

        int a=0;
        int b=1;

        Fibonacci(a,b);


    }
}
