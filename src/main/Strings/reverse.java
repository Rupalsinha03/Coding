
public class reverse {
    public static void main(String[] args) {
        String s="rupal";
      //  int reverse=0;
        String reverse = "";
        for (int i=s.length()-1;i>=0;i--){
         reverse+=s.charAt(i);

        }
        System.out.println(reverse);
    }
}
