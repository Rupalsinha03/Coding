package HashMap;

import java.util.*;

public class BasicsMap {
    public static void main(String[] args) {
        HashMap<String,String> map= new HashMap<>();
        map.put(null,"1");
        map.put(null,"2");
        map.put("three","3");
        map.put("four","3");

        map.remove("four");
        //System.out.println(map);
        map.put("three","change");
       // System.out.println(map);
        Set<String> keyValue= map.keySet();
        for (String key: keyValue)
        {
            //System.out.println("Key: " +e.getKey() + "Value:"+e.getValue());
            System.out.println("Key:"+key+ "keyvalue"+map.get(key));
        }
        }


}