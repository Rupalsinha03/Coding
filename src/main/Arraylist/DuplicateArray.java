//Given an array of n integers. The task is to find all elements that have more than one occurrences. The output should only be one occurrence of a number irrespective of the number of occurrences in the input array.
//
//        Examples:
//
//        Input: {2, 10, 10, 100, 2, 10, 11, 2, 11, 2}
//        Output: {2, 10, 11}
//
//        Input: {5, 40, 1, 40, 100000, 1, 5, 1}
//        Output: {5, 40, 1}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateArray {
    public static void duplicates(int[] arr, List element,int num){
        int t=9;
       for(int i= 0 ; i <= arr.length ; i++){

           boolean f = false;
//
//           int j= i+1;
//           while (j<arr.length && arr[i]==arr[j]) {
//
//               if(f == false){
//               element.add(arr[j]);
//               f = true;
//               }
//
//               j++;
//           }
//          i=j-1;
//         OR

           for (int j=i+1 ;j <= arr.length-1;j++) {

               if (arr[i] == arr[j]) {
                   i=j;
               }

               else{
                   i=j;
                   i--;
                   break;
               }
               if(f==false)
               element.add(arr[i]);
               f=true;

           }





}


    }
    public static void main(String[] args) {
        int arr[]={2, 10, 10, 100, 2, 10, 11, 2, 11, 2,6,8,6};
        int num =0;
        List element=new ArrayList<Integer>();
        Arrays.sort(arr);

        duplicates(arr,element,0);
        //for(int k=0;k<= element.size()-1;k++)
           //
        //System.out.println(""+arr[k]);
        System.out.println(element);

    }
}
