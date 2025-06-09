package InterviewQuestions;

public class PrimeNum {

    public static void main(String[] args) {



        int num=17;
        if(num<=1){
            System.out.println("not prime");
            return;
        }
        boolean prime=true;
        for(int i=2;i<=num/2;i++){
            if(num%2==0){
                prime=false;
                break;
            }

        }
        if(prime==false){
        System.out.println("not prime");}

       else{
           System.out.println("prime");
        }

    }
}
