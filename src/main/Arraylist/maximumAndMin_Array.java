public class maximumAndMin_Array {
    public static int minimum(int arr[],int n)
    {
       int min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
           if(arr[i]<min){
               min=arr[i];
           }
       }
        return min;
    }
    public static int maximum(int arr[],int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
    return max;
    }




    public static void main(String[] args) {
        int arr[]={3,5,4,1,19,9};
       // Arrays.sort(arr);
       int n=arr.length;

            System.out.println("minimum : "+minimum(arr,n));
        System.out.println("minimum : "+maximum(arr,n));



    }
}
