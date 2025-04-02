package BasicPrograms;

public class string14 {
	public static void main(String args[]) {

        String s1 = "welocme to miracle systems";

        String[] s = s1.split(" ");



        for (int i = 0; i < s.length - 1; i++) {

        	

            char lastChar = s[i].charAt(s[i].length() - 1);

            char firstCharNextWord = s[i + 1].charAt(0);

            String modifiedWord = s[i + 1].replace(firstCharNextWord, lastChar);

            System.out.print(modifiedWord + " ");

        }

    }

}
