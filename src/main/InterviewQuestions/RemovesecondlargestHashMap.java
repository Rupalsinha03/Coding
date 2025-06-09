package InterviewQuestions;

import java.util.*;
//Program Remove the second highest element from the HashMap.
public class RemovesecondlargestHashMap {

    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("first",2);
        map.put("second",12);
        map.put("third",6);
        map.put("fourth",7);

      //  System.out.println(map);


       /* Map<String,Integer> tree= new TreeMap<>();
        tree.put("first",2);
        tree.put("second",12);
        tree.put("third",6);
        tree.put("fourth",7);*/

        Map<String,Integer> tree= new TreeMap<>(map);
        System.out.println(tree);

       int count=0;

        String result="";

        for(String key:tree.keySet()){
            count++;
            if(count==3){
               tree.remove(key);
                break;
            }

        }
        System.out.println(tree);

    }
}
