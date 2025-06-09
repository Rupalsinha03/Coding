package InterviewQuestions;

public class Reversesentencewithwords {
    public static void main(String[] args) {
       /* String s= "my! name is Rupal";
        String rev="";
        char[] c=s.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            rev+=c[i];
        }
        System.out.println(rev);
    */
        //or

        String s= "my! name is Rupal";
        StringBuilder str=new StringBuilder(s).reverse();
        System.out.println(str);

    }
}
