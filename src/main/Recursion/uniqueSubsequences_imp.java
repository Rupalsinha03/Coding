import java.util.HashSet;

public class uniqueSubsequences_imp {
    public static void uniqSubsequences(String str,int index,String newstring,HashSet<String>set){
       if(index==str.length()){
           if(set.contains(newstring)) {
               return;
           } else{
               System.out.println(newstring);
               set.add(newstring);
               return;
               }
           }
       char currentstring=str.charAt(index);
        uniqSubsequences(str,index+1,newstring+currentstring,set);
        uniqSubsequences(str,index+1,newstring,set);

    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set =new HashSet<>();
        uniqSubsequences(str,0,"",set);
    }
}
