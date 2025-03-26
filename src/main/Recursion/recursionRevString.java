//str="123456"
//TC=O(n)
public class recursionRevString {
    public static void printReverse(String str,int index){
       // int charAt;
        if(index==-1){
            return;
        }

        System.out.println(str.charAt(index));
        printReverse(str,index-1);
    }

    public static void main(String[] args) {
        String str="123456";
        int index=str.length()-1;
        printReverse(str,index);


    }
}
