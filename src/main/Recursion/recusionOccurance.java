//Find first & last occurrence of element
public class recusionOccurance {
   public static int first;
    public static int last;
    public static boolean flag=false;
    public static void occurance(String str,int index){
       // int a=a;
        char key='a';
       // System.out.println(str.charAt(index));
        if(index==str.length()){
            return;
        }
        if(key==str.charAt(index)){
            if(flag==false){
            first=index;
            last=index;
            flag=true;
            }
            else{
                last=index;

            }

            occurance( str, index+1);
        }
        else if(key!=str.charAt(index)){

            occurance(str,index+1);


        }





    }

    public static void main(String[] args) {
        String str="hhahh";
        occurance(str,0);
        System.out.println(first);
        System.out.println(last);




    }
}
