package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class permutationofString {


    public static void Permutation(char c[], int index, List<String> result)
    {
        if(index==c.length){
            StringBuilder str = new StringBuilder();
            for(int k=0;k<c.length;k++) {
                str.append(c[k]);}
            String value=str.toString();
                result.add(value);
                   }

        for(int i=index;i< c.length;i++){
            swap(c,index,i);
            Permutation(c,index+1,result);
            swap(c,index,i);

        }

    }
    public static void swap(char c[],int i, int j){
    char temp=c[i];
    c[i]=c[j];
    c[j]=temp;
}

    public static void main(String[] args) {

        String s="ABC";

   List<String> result=new ArrayList<>() ;
   Permutation(s.toCharArray(),0,result);
        System.out.println(result);
    }
}
