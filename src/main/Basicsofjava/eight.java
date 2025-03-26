import java.util.Arrays;

//Second Largest Element-O(1)
public class eight {
    public static void main(String[] args) {
        int a[]={11,22,1,2,77,4,3};
        Arrays.sort(a);
        int secondLargest=a[a.length-2];

        System.out.println(secondLargest);
    }
}
