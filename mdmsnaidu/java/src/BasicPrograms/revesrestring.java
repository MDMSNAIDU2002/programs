package BasicPrograms;

public class revesrestring {
	public static void main(String[] args) {
		String s1="m.d.m.s.naidu";
		int length=0;
		String reverse="";
		for(int i=0;i<s1.length();i++) {
		 
			reverse=s1.charAt(i)+reverse;
			
		}
		System.out.println(s1);
		System.out.println(reverse);
		System.out.println(length);
	}

	
}
