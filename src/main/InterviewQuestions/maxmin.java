package InterviewQuestions;

public class maxmin {
    public static void main(String args[]) {

        int arr[] = {2, 1, 4, 15, 11};

        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else
            if(arr[i]>max){
                max=arr[i];
                // System.out.println(max);
            }

        }

        System.out.println(max);
        System.out.println(min);

    }
}
