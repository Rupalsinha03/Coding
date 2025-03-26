import java.util.*;

public class InsertAndErase {
    public static void main(String[] args) {
        int arr[]={9,8,7,4,4,2,1,1,9,8};
        Set<Integer> set= new HashSet<>(Arrays.asList(9,8,7,4,4,2,1,1,9,8));
        List<Integer> list= new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
        Set<Integer> removefirst= new HashSet<>(list);
        boolean removed=removefirst.remove(1);
        if(removed==true) {

            System.out.println("erase x :" + removefirst);
        }
        else {
            System.out.println("not found");
        }
    }
}
