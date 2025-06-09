package InterviewQuestions;

import java.util.HashSet;

public class CharOccurence {
    public static void main(String args[]) {

        String s="pallaep";
        int count=0;
        HashSet<Character> set=new HashSet<>();


        for(int i =0 ;i<s.length();i++) {
            char current = s.charAt(i);

            if (!set.contains(current)) {
                for (int j = i; j < s.length(); j++) {

                    if (current == (s.charAt(j))) {
                        count++;
                    }

                }
                System.out.println(s.charAt(i)+" count: " + count);

                count = 0;

                set.add(current);
            }
        }


    }
}
