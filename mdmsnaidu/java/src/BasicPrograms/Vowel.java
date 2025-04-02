 package BasicPrograms;

public class Vowel {
    public static void main(String[] args) {
        String input = "hello world";
        char[] charArray = input.toCharArray();
        
        for (int i = 1; i < charArray.length; i++) {
            if (isVowel(charArray[i])) {
                charArray[i] = charArray[i - 1]; // Replacing vowel with the previous character
            }
        }

        String result = new String(charArray);
        System.out.println("Original: " + input);
        System.out.println("Modified: " + result);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

