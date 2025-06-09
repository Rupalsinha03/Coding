package InterviewQuestions;

public class RemoveWhitespaceStr {

    public static void main(String[] args) {
        String str="I will do it";
//        String s=str.replaceAll("\\s","");
//        System.out.println(s);
   //     or
          StringBuilder result =new StringBuilder();

          for(int i=0;i<str.length();i++)
          {
              char c=str.charAt(i);
              if(c!= ' '){
                  result.append(c);
              }
          }

        System.out.println("result :"+ result);
    }
}
