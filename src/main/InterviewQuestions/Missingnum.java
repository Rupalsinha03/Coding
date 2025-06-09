package InterviewQuestions;

public class Missingnum {
    public static void main(String[] args) {

        int[] n={1,2,4,5,6,7};
        int num=n.length+1;
        int totalsum= num*(num+1)/2;
        int actualsum=0;

        for(int i =0;i<n.length;i++){
            actualsum+=n[i];
        }
int result=totalsum-actualsum;
        System.out.println(result);
    }
}
