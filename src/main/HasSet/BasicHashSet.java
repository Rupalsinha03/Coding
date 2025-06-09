package HasSet;

import java.util.HashSet;
import java.util.Set;

public class BasicHashSet {
    public static void main(String[] args) {

        Set<Integer> param= new HashSet<>();
        param.add(1);
        param.add(2);
        param.add(3);
        param.add(2);
        param.add(1);


//        param.remove(3);
//        System.out.println(param.contains(4));//true

        for(Integer loop: param){
            System.out.println("value"+loop);
        }


    }
}