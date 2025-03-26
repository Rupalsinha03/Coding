import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        int arr[]={8,2,11,3,0,10,2,2};
        int arrTwo[]={1,1,12,3,9,4,2,8,11};
        Set<Integer> set= new HashSet<>(Arrays.asList(8,2,11,3,0,10,2,2));
        System.out.println(set);
        Set<Integer> set2= new HashSet<>(Arrays.asList(8,2,11,3,0,10,2,2));
        System.out.println(set2);
        Set<Integer> x= new HashSet<>(set);
        boolean isPresent = x.containsAll(set2);
        System.out.println(isPresent);

    }
}
