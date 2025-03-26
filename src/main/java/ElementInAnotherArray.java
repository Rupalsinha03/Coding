//https://www.geeksforgeeks.org/check-if-each-element-of-an-array-is-the-sum-of-any-two-elements-of-another-array/

import java.util.*;

public class ElementInAnotherArray {
    public static void main(String[] args) {
        int A[] = {1,1,1,1};
        int B[] = {1,1,1,1};
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,1,1,1));
        List<Integer> list2= Arrays.asList(1,1,1,1);
        int sum=0;
        for (int i=0;i<list2.size();i++) {
            int firstelement = list2.get(i);

            for(int j=i+1;j<list2.size();j++){
                int nextElement = list2.get(j);
                sum=firstelement + nextElement;
                if(set1.contains(sum)==true){
                   set1.remove(sum);
                }
                sum=0;

            }

        }
        if(set1.size()==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }



    }
}
