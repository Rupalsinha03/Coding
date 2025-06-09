package Arraylist;//Given an array, the task is to cyclically rotate the array clockwise by one time.
//
//Examples:
//    Input: arr[] = {1, 2, 3, 4, 5}
//    Output: arr[] = {5, 1, 2, 3, 4}
//
//    Input: arr[] = {2, 3, 4, 5, 1}
//    Output: {1, 2, 3, 4, 5}


public class rotateClockwise_Array {
    public static void rotate(int arr[],int k){
        int n= arr.length;
         k =k %n;
        while(k>0) {
            int last_element = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last_element;
            k--;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        rotate(arr,3);
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]);
        }
        //System.out.println(Arrays.toString(arr));

    }
}




//Initialize last element in variable ‘last_el’ that is 5
//
//Then, iterate from n-1 to 1 and assign arr[i] = arr[i-1]
//
//
//    arr[4] = arr[3]
//
//        arr[ ] = {1, 2, 3, 4, 4}
//
//
//
//    arr[3] = arr[2]
//
//        arr[ ] = {1, 2, 3, 3, 4}
//
//
//
//    arr[2] = arr[1]
//
//        arr[ ] = {1, 2, 2, 3, 4}
//
//
//
//    arr[1] = arr[0]
//
//        arr[ ]  = {1, 1, 2, 3, 4}
//
//
//
//
//
//Assign arr[0] = last_el
//
//
//    arr[0] = 5
//
//        arr[ ] = {5, 1, 2, 3, 4}