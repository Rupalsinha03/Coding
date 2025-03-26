//An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
//
//Examples :
//
//    Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
//    Output: -12 -13 -5 -7 -3 -6 11 6 5

import java.util.ArrayList;
import java.util.List;

public class MoveNegativeNo {
    public static void sort(int arr[],List<Integer>L1,List<Integer>L2) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < 0) {
                L1.add(arr[i]);
            } else {
                L2.add(arr[i]);
            }
        }
            List finalList=new ArrayList<Integer>();
            finalList.addAll(L1);
            finalList.addAll(L2);
            System.out.println(finalList);
            for (int k = 0; k<finalList.size(); k++){
                System.out.print(" "+finalList.get(k));
            }
    }

    public static void main(String[] args) {
        int arr[]={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        List L1=new ArrayList<Integer>();
        List L2=new ArrayList<Integer>();
        sort(arr,L1,L2);


    }
}
