public class VowelsConsonant {
    public static void main(String[] args) {
        String s="Hello World!";
        int vowel=0;
        int consonant=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowel++;
                
            }
            else{
                consonant++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
    }
}
