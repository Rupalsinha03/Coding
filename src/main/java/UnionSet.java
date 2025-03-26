import java.lang.reflect.Array;
import java.util.*;

public class UnionSet {

    public static void main(String[] args) {
        int arr1[]={1,2,3,12,11,0,11};
        int arr2[]={1,2,3,9,33,10};

        Set<Integer> set =new HashSet<>(Arrays.asList(1,2,3,12,11,11,0));
        System.out.println(set);
        Set<Integer> setTwo =new HashSet<>(Arrays.asList(1,2,3,9,33,10));
        System.out.println(setTwo);

        Set<Integer> union =new HashSet<>(set);
        union.addAll(setTwo);
        System.out.println("union"+union);

        List<Integer> sortUnion=new ArrayList<>(union);
        Collections.sort(sortUnion);
        System.out.println("sorted union"+sortUnion);
    }
}
