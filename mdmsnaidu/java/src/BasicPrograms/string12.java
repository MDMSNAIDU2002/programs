package BasicPrograms;

public class string12 {
	 public static  void main(String args[]) {

		   String s="welcome Durga";

		   int vc=0,cc=0;

		   for(int i=0;i<s.length();i++)

		   {

			   if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {

				   vc++;

			   }else {

				   cc++;

			   }

		   }

		   System.out.println("the vowel count:" +vc);

		   System.out.println("the consonent count:" +cc);

	   }

}
