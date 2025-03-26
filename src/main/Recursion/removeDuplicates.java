//Remove all duplicates in String
//a-a=0,b-a=1,c-a=2....these all are index in map when we minus from a

public class removeDuplicates {
    public static boolean map[]=new boolean[26];
    public static void removeDuplicates(String str,int index,String newstring){

        if(index==str.length()){//????
            System.out.println(newstring);
            return;
        }
        char currentAlpha=str.charAt(index);
        if(map[currentAlpha-'a']==true){
            removeDuplicates(str,index+1,newstring);
        }
        else{
            newstring=newstring+currentAlpha;
            map[currentAlpha-'a']=true;
            removeDuplicates(str,index+1,newstring);
        }

    }

    public static void main(String[] args) {
        String str="abccdaea";

        removeDuplicates(str,0,"");


    }
}
