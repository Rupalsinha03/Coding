package InterviewQuestions;

public class ReverseSentence {

    public static void main(String[] args) {
        String s= "My name is rupal";
        String rev="";
        String[] word= s.split(" ");
        for(int i=word.length-1;i>=0;i--){
            rev+=word[i]+" ";

        }
        System.out.println(rev);
    }
}
