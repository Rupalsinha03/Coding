public class MaximumSubarrySum {


    public static int maxSumSubarray(int arr[]){

        if(arr.length==0||arr==null){
            return 0;
        }
        int maxCurrent=arr[0];
        int maxGlobal=arr[0];
        for(int i = 1; i<= arr.length-1 ; i++){
            maxCurrent=Math.max(arr[i],maxCurrent+arr[i]);
            maxGlobal=Math.max(maxGlobal,maxCurrent);
        }
        return maxGlobal;
    }

    public static void main(String[] args) {
        int arr[]={2,3,-8,7,-1,2,3};
        System.out.println(maxSumSubarray(arr));

    }
}
