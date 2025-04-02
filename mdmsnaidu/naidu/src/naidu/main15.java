package naidu;

public class main15 {
	 public static void main(String[] args) {
		String str="abc";
		try {
			int num=Integer.parseInt(str);
			System.out.println("phone number:"+num);
		}
		catch(Exception e)
		{
			System.out.println("Error:Unable to parse the string as an integer");
			
		}
	}

}
