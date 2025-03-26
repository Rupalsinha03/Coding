// given two set wap to check if they are equal
//1=1,2,3
//2=1,2,3

import java.util.*;

public class SetEquality {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2,3,4));
        List<Integer> list1 = new ArrayList<>(set1);
        Collections.sort(list1);
        List<Integer> list2 = new ArrayList<>(set2);
        Collections.sort(list2);

boolean success=true;
        if (set1.size() == set2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                int element1=list1.get(i);
                for (int j = i; j < list2.size(); j++) {
                    int element2=list2.get(j);

                     if(element1!=element2) {
                    success=false;

                   break;
                     }
                    break;
                }}
                if (success) {
                    System.out.println("The sets are equal.");
                } else {
                    System.out.println("The sets are not equal.");
                }

            }
            if (set1.size() != set2.size()) {
                System.out.println("size not accurate");
            }


        }
    }


//set - size, put, contains, delete
//array - size, add in last, update any existing element