package BasicPrograms;
import java.util.Arrays;

public class string9 {
	  
	    public static void main(String[] args) {
	        String s="durga";
	        char[] c=s.toCharArray();
	    Arrays.sort(c);
	        System.out.println(c);
	        for(int i=c.length-1;i>=0;i--)
	        {
	            System.out.print(c[i]);
	        }
	    }
	}

