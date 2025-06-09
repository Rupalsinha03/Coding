package Arraylist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicatenuber {
    public static void main(String[] args) {
        int arr[]={1,2,2,5,3,4};

        Set<Integer> set= new HashSet<Integer>();

        for(int num:arr){
            if(!set.contains(num)){
                set.add(num);
            }

        }

        System.out.print(set);
      //  System.out.println("Try programiz.pro");
    }
}
