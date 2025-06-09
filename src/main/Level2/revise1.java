package Level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class revise1 {


    public static int longsubs(String s){

        HashMap<Character,Integer> map= new HashMap<>();
        int start=0;
        int end=0;
        int maxlength=0;
        for (end=0;end<s.length();end++){
            char current =s.charAt(end);
            if(map.containsKey(current)){
                start=Math.max(start,map.get(current)+1);
            }
            map.put(current,end);
            maxlength= Math.max(maxlength,end-start+1);
        }
        return maxlength;
    }

    public static void main(String[] args) {
      //    String s = "totday is a good day";
        String s="abcddret";
        int r=longsubs(s);
        System.out.println(r);





    }}