import java.util.ArrayList;

public class maximumAndMin_Arraylist {

    public static int minimum(ArrayList<Integer> arr,int n){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr.get(i) <min){
                min=arr.get(i);
            }
        }
        return min;

    }
    public static int maximum(ArrayList<Integer> arr,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr.get(i)>max){
                max=arr.get(i);
            }
        }
        return max;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(12);
        arr.add(3);
        arr.add(5);
        arr.add(22);
        arr.add(1);
        int n=arr.size();
        System.out.println(minimum(arr,n));
        System.out.println(maximum(arr,n));

    }
}
