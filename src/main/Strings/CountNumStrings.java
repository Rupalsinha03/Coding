package Strings;//Count the Number of Words in a String
//
//        Input: "Hello world! This is Java."
//
//        Output: 5
//
//        Follow-up: Handle multiple spaces and special characters.

public class CountNumStrings {
    public static void main(String[] args) {
        int count=0;
        CountNumStrings countNumStrings = new CountNumStrings();
        String underTestString = "sdf sdfs erwe 343 2f9   sd ";
        int wordCount1 = countNumStrings.countWordUsingSplit(underTestString,count);
        //int wordCount2 = countNumStrings.countWordUsingWhile(underTestString);
        System.out.println(wordCount1);

    }

    public int countWordUsingSplit(String underTestString, int count) {
        String[] formattedString = underTestString.split(" ");

        for (int i = 0; i < formattedString.length; i++) {


            //
            if (formattedString[i] == " ") {
                i++;
            }
        }

        count++;
        return count;
    }


//    public int countWordUsingWhile(String s) {
//
//return ;
//    }
}