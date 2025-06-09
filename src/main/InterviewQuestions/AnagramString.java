package InterviewQuestions;

import java.util.Arrays;
//Key Properties of Anagrams:
//Same Length: Both strings must have the same number of characters.
//
//Same Character Set: Each character must occur the same number of times in both strings.
//
//Order Doesn't Matter: The order of characters is not important

public class AnagramString {

    public static boolean Anagram(String s1,String s2){

        //remove space and convert to lowercase
        String str1=s1.replaceAll("\\s","").toLowerCase();
        String str2=s2.replaceAll("\\s","").toLowerCase();

        if(str1.length()!=str2.length()){
            return false;
        }
         char[] c1= str1.toCharArray();
        char[] c2= str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
//Arrays.equals(c1,c2)- it compares length and char both
    }


    public static void main(String[] args) {

        String s1="listenu";
        String s2="silent";

if(Anagram(s1,s2)==true){
    System.out.println("Anagram");
}
else{
    System.out.println(" not Anagram");
}
    }
}
