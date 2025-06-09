package InterviewQuestions;

//Find first non-repeating character in a string

import java.util.HashMap;
import java.util.HashSet;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String s = "I will do itI";

        // HashSet<Character> set = new HashSet<>();
        HashMap<Character, Integer> map = new HashMap<>();

        int count = 0;
        char current = ' ';
        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            if (!map.containsKey(current)) {
                for (int j = i; j < s.length(); j++) {
                    if (current == s.charAt(j)) {
                        count++;
                    }
                }

                map.put(current, count);
                // System.out.println(current + " count: " + count);
                System.out.println("key:" + current + " value: " + count);
                count = 0;

            }
        }
        for (int k = 0; k < s.length(); k++) {
            char firstChar=s.charAt(k);
            if(map.get(firstChar)==1){
                System.out.println(firstChar);

                    break;

            }
        }
    }
}
