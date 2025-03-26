//Given an array of strings arr[], the task is to return the longest common prefix among each and every strings present in the array. If there’s no prefix common in all the strings, return “”.
//
//Examples:
//
//    Input: arr[] = [“geeksforgeeks”, “geeks”, “geek”, “geezer”]
//    Output: “gee”
//    Explanation: “gee” is the longest common prefix in all the given strings: “geeksforgeeks”, “geeks”, “geeks” and “geezer”.

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String commonPrefix(String[] arr) {
          Arrays.sort(arr);
          String startingString =arr[0];
          String endString = arr[arr.length-1];

          int minLength= Math.min(startingString.length(),endString.length());
          int i=0;
          while(i<minLength && startingString.charAt(i)==endString.charAt(i)){
              i++;
          }
return startingString.substring(0,i);

    }

    public static void main(String[] args) {
        String[] arr ={"geelksforgeeks","geelks","geelk","geelzer"};
        System.out.println(commonPrefix(arr));
    }
}