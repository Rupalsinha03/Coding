public class Palindromsentence {

    public static void main(String args[]) {

        String s = "A man, a plan, a canal: Panamat";
        String formattedString = s.replaceAll("[,;:]", "").replaceAll(" ", "").toLowerCase();
        //formattedString=formattedString.trim();

        String element = formattedString;
        String rev = "";

        Boolean flag ;

        for (int i = formattedString.length() - 1; i >= 0; i--) {
            rev = rev + formattedString.charAt(i);

        }
        System.out.println(element.equals(rev));

        }
    }
