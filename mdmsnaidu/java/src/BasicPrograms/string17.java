package BasicPrograms;

public class string17 {
	public static void main(String args[]) {

        String s = "WelCome To Miracle123@gmail999.com#$@#@##$$SRFSeg";

        int n = s.length();

        int vc = 0, cc = 0, dc = 0, spc = 0;



        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);



            

            if (Character.isLetter(ch)) {

                

                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||

                    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                    vc++;

                } else {

                    cc++;

                }

            }

            

            else if (Character.isDigit(ch)) {

                dc++;

            }

            

            else {

                spc++;

            }

        }



       

        System.out.println("Vowel proportion: " + (vc % n));

        System.out.println("Consonant proportion: " + (cc % n));

        System.out.println("Digit proportion: " + (dc % n));

        System.out.println("Special character proportion: " + (spc % n));

    }

}
