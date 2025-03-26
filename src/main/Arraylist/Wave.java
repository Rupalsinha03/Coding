import java.util.Arrays;

public class Wave {

    public static void swap(int arr[],int a,int b){

        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void waveSort(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<=arr.length-2;i=i+2){
            swap(arr,i,i+1);
        }
    }

    public static void main(String[] args) {
        int arr[]={10, 90, 49, 2, 1, 5, 23};
        waveSort(arr);
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
