public class string4 {
	public static void main(String args[]) {

		String s="welcome to";

		int vc=0,cc=0,spc=0,dc=0;

		String[] s1=s.split(" ");

		System.out.println("the length of the String is:" +s1.length);

		s=s.trim();

		for(int i=0;i<s.length();i++)

		{

		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')

		{

		vc++;

		}

		else if(s.charAt(i)=='b'||s.charAt(i)=='c'||s.charAt(i)=='d'||s.charAt(i)=='f'||s.charAt(i)=='g'||s.charAt(i)=='h'||s.charAt(i)=='j'||s.charAt(i)=='k'||s.charAt(i)=='l'||s.charAt(i)=='m'||s.charAt(i)=='n'||s.charAt(i)=='p'||s.charAt(i)=='q'||s.charAt(i)=='r'||s.charAt(i)=='s'||s.charAt(i)=='t'||s.charAt(i)=='v'||s.charAt(i)=='w'||s.charAt(i)=='x'||s.charAt(i)=='y'||s.charAt(i)=='z') {

		cc++;

		}

		else if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9') {

		dc++;

		}

		else if(s.charAt(i)!= ' ') {

		spc++;

		}

		}

		System.out.println("the count of vowels:" + vc);

		System.out.println("the count of consonants:" + cc);

		System.out.println("the count of digits:" + dc);

		System.out.println("the count of special char :" + spc);

		}

		}


