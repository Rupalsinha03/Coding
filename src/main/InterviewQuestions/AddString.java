package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//larger arrays or dynamically insert any word at any position
public class AddString {

    public static void main(String[] args) {
        String s="I love swim";
        List<String> list= new ArrayList<>(Arrays.asList(s));
        list.add(2,"to");
        System.out.println(list);

    }

}
