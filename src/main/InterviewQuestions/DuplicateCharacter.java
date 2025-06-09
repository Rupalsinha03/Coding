package InterviewQuestions;
//Find duplicate characters in a string

import java.util.HashMap;

public class DuplicateCharacter {

    public static void main(String[] args) {
        String s = "Iammostwanted";
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                for (int j = i; j < s.length(); j++) {
                    if (c == s.charAt(j)) {
                        count++;
                    }
                }
                map.put(c, count);
                System.out.println("character :" + c +" count :"+count);
                count = 0;
            }
        }
        for(int i=0;i<map.size();i++){
            char duplicate=s.charAt(i);
            if(map.get(duplicate)>1){

                    System.out.println(duplicate);

            }

        }
    }
}