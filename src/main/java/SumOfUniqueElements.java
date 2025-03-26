//given an array of element calculate the sum of unique elements
//input =1,2,3,4
//o/p=10
//
//input=3,3,4,5
//o/p=9

import java.util.*;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>(Arrays.asList(3,3,3,4,5));
        //System.out.println(list);
        int sum=0;
        for(int i=0;i< list.size();i++) {

int firstElement = list.get(i);
            for (int j = i+1; j < list.size(); j++) {
                int secondElement = list.get(j);
                //int k=;
                if (firstElement==secondElement){
                    i++;
                   // break;
                }
                i=j;



                if(list.get(i)!=list.get(i)){
                    //i=i-1;
                   // j++;
                    sum= list.get(i)+list.get(j);

                }
                //i=j;
            }

        }
        System.out.println(sum);
//        Set<Integer> set= new HashSet<>(Arrays.asList(3,3,4,5));
//        System.out.println(set);
        //Collections.sort(set);
    }
}
