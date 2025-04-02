package BasicPrograms;

public class string3 {
	 

		public static void main(String args[]) {

		String s1="java is a programming language";

		int maxcount=0,mincount=s1.length();

		char maxchar=' ',minchar=' ';

		for(int i=0;i<s1.length();i++)

		{

		int count=0;

		char chara=s1.charAt(i);

		for(int j=0;j<s1.length();j++)

		{

		if(chara==s1.charAt(j))

		{

		count++;

		}


		}

		if(count>maxcount)

		{

		maxcount=count;

		maxchar=chara;

		}

		if(count < mincount){

		mincount = count;

		minchar = chara;


		}

		}

		System.out.println("the max char " + maxchar + " is " + maxcount);

		System.out.println("the min char "+ minchar+" is "+mincount);

		}

		}


