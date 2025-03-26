import java.util.*;

import static java.lang.reflect.Array.get;
import static java.lang.reflect.Array.getInt;

//https://www.geeksforgeeks.org/sum-of-elements-whose-square-root-is-present-in-the-array/
public class SumOfSquareRoot {
    public static void main(String[] args) {
        int arr[]={4, 2, 36, 6, 10, 100};
        Set<Integer> set=new HashSet<>(Arrays.asList(4, 2, 36, 6, 10, 100));
        List<Integer> listOfSets = new ArrayList<>();

        listOfSets.addAll(set);
        Collections.sort(listOfSets);

     //  System.out.println(listOfSets);
        int sum=0;
       for(int i=0;i< listOfSets.size();i++){

           int element= listOfSets.get(i);
          int squareroot=element*element;
          //  System.out.println("squareroot"+squareroot);


        Boolean result = set.contains(squareroot);
        if(result==true) {
           // System.out.println(squareroot);

          sum+=squareroot;
        }
       }
        System.out.println(sum);

    }
}
