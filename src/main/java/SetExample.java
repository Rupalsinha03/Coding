import java.util.*;

public class SetExample {
    public static void main(String[] args) {


        Set<String> set = new HashSet<>();
        set.add("R");
        set.add("u");
        set.add("p");
        set.add("a");
        set.add("l");
        set.add("a");

        System.out.println(set);
        List<String> list= new ArrayList<>(set);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("sorted"+list);



    }
}