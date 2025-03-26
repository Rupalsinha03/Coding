import java.util.Arrays;

public class rotateAnticlockwise {
    public static void rotate(int arr[],int k) {

        int n = arr.length;
        k = k % n;
        while (k > 0) {
            int first_Ele = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = first_Ele;
            k--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        rotate(arr,3);
        System.out.println(Arrays.toString(arr));


    }
}
