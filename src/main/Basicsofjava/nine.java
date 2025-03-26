import java.util.HashSet;
import java.util.Set;

//Remove Duplicates
public class nine {
    public static void main(String[] args) {
        int a[]={1,2,2,7,4,5,3,4,9,6};
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<=a.length-1;i++) {
            set.add(a[i]);
        }
        System.out.println(set);
    }}

