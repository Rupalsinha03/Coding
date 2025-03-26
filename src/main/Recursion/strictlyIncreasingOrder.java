//Check if the array is sorted (strictly increasing)
//TC-O(n)
public class strictlyIncreasingOrder {
    public static boolean increasingOrder(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }

        if(arr[index]<arr[index+1]){
           return increasingOrder(arr,index+1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,3,4};
        System.out.println(increasingOrder(arr,0));

       }


    }

