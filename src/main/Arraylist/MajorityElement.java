//Given an array arr. Find the majority element in the array. If no majority exists, return -1. A majority element in an array is an element that appears strictly more than arr.size() / 2 times in the array.
//
//Examples :
//
//    Input : arr[] = {1, 1, 2, 1, 3, 5, 1}
//    Output : 1
//    Explanation: Note that 1 appear 4 times which is more than  7 / 2 times
//
//    Input : arr[] = {3, 3, 4, 2, 4, 4, 2, 4}
//    Output :  -1
//    Explanation: There is no element whose frequency is greater than the half of the size of the array size.
//
//    Input : arr[] = {3}
//    Output : 3
//    Explanation: Appears more than n/2 times

import java.util.Arrays;

import static javax.swing.UIManager.get;

public class MajorityElement {

    public static void countNumber(int arr[],int count) {
        int l=arr.length;
        if(l==1) {
            for (int k = 0; k < arr.length; k++) {
                System.out.println(arr[k]);
                return;
            }

        }

        for (int i = 0; i <= arr.length; i++) {

            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    count += arr[i];
                }}
                if (count >= 3) {
                    System.out.println("1");
                    break;
                }

            else{
                    if (count < 3) {
                        System.out.println("-1");
                        break;
                    }



            }
            }
        }


    public static void main(String[] args) {
       int arr[] = {5,5,2,2};
       int count=0;
        Arrays.sort(arr);
        countNumber(arr,0);
    }
}
