package BasicPrograms;

public class string6 {
	public static void main(String args[])

	{

		String s=new String("welcome to miracle");

		String[] s1=s.split(" ");

		for(String re: s1) {

			String s2=re.substring(0,1);

			s2=s2.toUpperCase();

			String s3=s2+re.substring(1);

			System.out.println(s3);

			

		}

	}

	}


