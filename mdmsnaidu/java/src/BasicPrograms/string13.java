package BasicPrograms;

public class string13 {
	public static void main(String args[]) {

    	String s="hello world";

    	s=s.trim();

    	for(int i=0;i<s.length();i++)

    	{

    		int count=0;

    		for(int j=0;j<s.length();j++)

    		{

    			if(s.charAt(i)==s.charAt(j))

    			{

    				count++;

    			}

    		}

    		System.out.println("the count of " + s.charAt(i) + "is"+count);

    	}

    }

}
