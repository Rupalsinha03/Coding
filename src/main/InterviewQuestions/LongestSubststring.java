package InterviewQuestions;

import java.util.HashMap;

//Find Longest substring without repeating characters using both HashMap and HashSet Techniques
public class LongestSubststring {

    public static int longestSubstring(String s)
    {
        HashMap<Character,Integer> map= new HashMap<Character,Integer>();
        int start =0;
        int end=0;
        int maxLength=0;
        for(end=0 ;end<s.length();end++){
            char current=s.charAt(end);
            if(map.containsKey(current)){

              start=Math.max(start,map.get(current)+1);
            }
            map.put(current,end);
            maxLength=Math.max(maxLength,end-start+1);

        }
        return  maxLength;
    }

    public static void main(String[] args) {
        String s="abcddeef";

        int result= longestSubstring(s);
        System.out.println(result);


    }
}
