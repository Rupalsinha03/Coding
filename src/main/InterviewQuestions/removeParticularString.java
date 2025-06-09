package InterviewQuestions;

public class removeParticularString {
    public static void main(String[] args) {
        String s="My name is Rupal";
        //replace name with original name
        String result=s.replace("name","original name");
        System.out.println(result);

        //replace name with n as m
        String result1=s.replace("name","name".replace("n","m"));
        System.out.println(result1);

//        String str="I can walk";
//        String word[]=str.split(" ");
//        String modified
//        String replace="";
//        for(int i= 0;i< word.length-1;i++) {
//            if (word[i].contains("walk")) {
//               word[i]= "talk";
//            }
//
//
//        }
//        for (int k= 0;k< word.length;k++)
//            System.out.println(word[k]);
    }
}
