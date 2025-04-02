package BasicPrograms;
import java.util.Arrays;

public class string10 {
	 public static void main(String[] args) {
	        String s="durg@$^950a jtdi05wi35wsDw4W^%%^edffb";
	        char[] c=s.toCharArray();
	      String s1=" ";
	      for(int i=0;i<c.length;i++)
	      {
	          if(c[i]>='A' && c[i]<='Z' || c[i]>='a' && c[i]<='z')
	          {
	               s1=s1+c[i];
	          }
	      }
	      System.out.print(s1);
	    }

}
