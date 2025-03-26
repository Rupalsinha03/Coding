//Move all 'x' to the end of string

public class moveAllX {
   public static String empty1="";
    public static String empty2="";
    public static void moveStrings(String str,int index){

        char key='x';
        if(index==str.length()){
            return;
        }
        if(key!=str.charAt(index)) {
            empty1 = empty1 + str.charAt(index);
            moveStrings(str, index + 1);
        }
        else
            if(key==str.charAt(index)){
                empty2 = empty2 + str.charAt(index);
            moveStrings(str,index+1);

        }







    }
    public static void main(String[] args) {
         String str="axbcxxd";
        moveStrings(str,0);
         String total=empty1+empty2;
        System.out.println(total);


    }
}
