public class ReverseArray {
    public static void main(String[] args) {
        int [] arr ={1, 2, 3};
        int reverse []=new int[arr.length];
        for(int i =0;i<arr.length;i++) {
             reverse[i] = arr[arr.length - i - 1];
        }
        for (int i=0;i< reverse.length;i++){
            System.out.println(reverse[i]);

        }
    }
}
