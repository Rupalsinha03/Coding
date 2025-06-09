package Strings;

public class ReversewordinString {
    //nput: str = “i.like.this.program.very.much”
    //Output: str = “much.very.program.this.like.i”
    //Explanation:The words in the input string are reversed while maintaining the dots as separators, resulting in "much.very.program.this.like.i".
    //
    //
    //Input: str = ”..geeks..for.geeks.”
    //Output: str = “geeks.for.geeks”
    //
    //
    //Input: str = “…home……”
    //Output: str = “home”

    public static void main(String[] args) {
        String s = "..i.like.this.program.very.much...";
        int idx = calculateIndex(s);

        String format = s.substring(idx);
        String rev = new StringBuilder(format).reverse().toString();
        int index= calculateIndex(rev);

        String result = rev.substring(index);
        System.out.println(result);



    }

    private static int calculateIndex(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '.') {
                return i;
            }

        }
        return 0;
    }
}

