import java.util.Scanner;

//search element which are odd

public class searchEementArr {
    public static void main(String[] args) {
       // int arr[]={20,31,16,82,3,9};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter total number of numbers");
        int n = sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        //Arrays.sort(n);
        for (int j =0;j<n;j++) {
            if (arr[j] % 2 != 0) {
                System.out.println(arr[j]);

            }

        }



    }
}
