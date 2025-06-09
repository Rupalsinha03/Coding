package Arraylist;

import java.util.Arrays;

public class MajorityCountElements {
    public static void countElement(int arr[],int count)
    {
        if(arr.length==1){
            for (int k=0;k<=arr.length-1;k++){
            System.out.println(arr[k]);
            return;
        }}

        for(int i = 0 ; i< arr.length-1 ;i++){
            if(arr[i]==arr[i+1]){
                count=count+1;
                //break;
            }
            if(arr[i]!=arr[i+1]){
                i++;
                break;}
            }
        if(count>= arr.length/2){
            System.out.println("1");
        }
             else{
            System.out.println("-1");
        }
        }




    public static void main(String[] args) {
        int arr[] = {3};
        int count=0;
        Arrays.sort(arr);
        countElement(arr,0);

    }


}
