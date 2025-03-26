//Given an array arr[] of n integers, construct a product array res[] (of the same size) such that res[i] is equal to the product of all the elements of arr[] except arr[i].
//
//Example:
//
//    Input: arr[] = [10, 3, 5, 6, 2]
//    Output: [180, 600, 360, 300, 900]
//    Explanation:
//
//        For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
//        For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
//        For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
//        For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
//        For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.
//O=n+n=2n
import java.util.ArrayList;
import java.util.List;

public class ProductOfArrWithoutItself {

    public static List<Integer>  productOfArray(int arr[]) {
        int multiply=1;
        int n=arr.length;
        List<Integer> result=new ArrayList<>();
        for(int k=0;k<n;k++) {
            multiply *= arr[k];
        }

        for (int i=0;i<n;i++) {
            int divideResult=0;
            divideResult=multiply/arr[i];
            result.add(divideResult);
        }

        return result;
    }

    public static void main(String[] args) {
       int  arr[] = {10, 3, 5, 6, 2};
       List<Integer> finalArrayList= productOfArray(arr);
       System.out.println(finalArrayList);
    }
}
