package Strings;

import static java.util.Collections.reverse;

public class RevStringWithoutLoop {

    public static  void main(String args[]){
      String s="Hello";
      String reversed=Reverse(s);
        System.out.println(reversed);
    }
    public static String Reverse(String s){
if(s.isEmpty()){
    return s;
}

        return Reverse(s.substring(1)) + s.charAt(0);
    }
}
