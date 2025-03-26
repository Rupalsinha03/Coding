//nput: arr[] = {0, 1, 2, 0, 1, 2}
//Output: {0, 0, 1, 1, 2, 2}
//Explanation: {0, 0, 1, 1, 2, 2} has all 0s first, then all 1s and all 2s in last.
//TC-O(n)

import java.util.ArrayList;
import java.util.List;

public class SortAscending {

    public static void sort(int [] arr,List<Integer>L1,List<Integer>L2,List<Integer>L3) {

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i]==0){
                L1.add(arr[i]);
            }
            if(arr[i]==1){
                L2.add(arr[i]);
            }
            if(arr[i]==2){
               L3.add(arr[i]);
            }
            System.out.println(L1);
            System.out.println(L2);
            System.out.println(L3);
            List finalList = new ArrayList<Integer>();
            finalList.addAll(L1);
            finalList.addAll(L2);
            finalList.addAll(L3);

            System.out.println("Final Sorted List: " + finalList);


        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 0, 1, 2};

        List L1= new ArrayList<Integer>();
        List L2= new ArrayList<Integer>();
       List L3= new ArrayList<Integer>();

        sort(arr,L1,L2,L3);



        
    }
}
