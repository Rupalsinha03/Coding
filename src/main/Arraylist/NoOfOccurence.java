//    Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
//    Output: 4
//    Explanation: 2 occurs 4 times in the given array.
//
//    Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
//    Output: 0
//    Explanation: 4 is not present in the given array.

public class NoOfOccurence {

    public static void countOccurence(int arr[],int target,int count) {

        for (int i = 0; i <= arr.length - 1; i++) {


            if (target == arr[i]) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
       int  arr[] = {1, 1, 2, 2, 2, 2, 3};
       int target;
       int count=0;
       countOccurence(arr,13,0);



    }
}
