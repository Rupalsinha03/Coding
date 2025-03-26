//Input: arr[] = {-2, 6, -3, -10, 0, 2}
//Output: 180
//Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180

public class MaximumSubarrayProduct {
    public  static int  maxProdValue(int arr[]) {

        int result = arr[0];
        //  int maxProdValue=0;
        for (int i = 0; i <= arr.length - 1; i++) {
            int multiply = 1;
            for (int j = i; j < arr.length; j++) {
                multiply *= arr[j];

            result = Math.max(multiply, result);

        }
    }
        return result;
    }


    public static void main(String[] args) {
        int arr[]={-2, 6, -3, -10, 0, 2};
        System.out.println(maxProdValue(arr));
    }
}
