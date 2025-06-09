package Strings;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String s = "..i.like.this.program.very.much...";
        int index = 0;

        int idx = calculateIndex(s);
                String format = s.substring(idx);
                //System.out.println(format);

                String rplace=format.replace("."," ");
           // System.out.println(rplace);
            String[] spltelement=rplace.split(" ");
            String rev="";
            String revresult="";
            for(int i=spltelement.length-1;i>0;i--){
               rev= spltelement[i];
                revresult="."+rev;
                //String result=revresult.substring(i);
                System.out.print(revresult);
            }








    }

    private static int calculateIndex(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '.') {
                return i;
            }

        }
        return 0;
    }
}

