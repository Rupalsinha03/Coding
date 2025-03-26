public class CountOccurence {
    public static void main(String[] args) {
        int arr[]={1, 1, 2, 2, 2, 2,2,2, 3};
        int count =0;
        for (int i=0;i<arr.length;i++){

            if(arr[i]==2){
                count=count+1;

            }

        }
        System.out.println(count);
    }
}
