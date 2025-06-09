package Recursion;

//Print all subsequences
//TC-o(2^n)
public class subsequences_imp {

    public static void subseq(String str,int index,String newstring){

       if(index >= str.length()){
           System.out.println(newstring);
           return;
       }
        char currentstring=str.charAt(index);
        subseq(str,index+1,newstring+currentstring);
        subseq(str,index+1,newstring);
    }



    public static void main(String[] args) {
        String str="abc";
        subseq(str,0,"");

    }
}
