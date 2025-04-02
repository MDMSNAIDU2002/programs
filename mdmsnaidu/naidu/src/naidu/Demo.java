package naidu;

public class Demo {
	public static void main(String[] args) { 
		String firstName="durga";
		String lastName="naidu";
		StringBuilder str=new StringBuilder();
		str.append("hey ");
		str.append(firstName);
		str.append(" ");
		str.append(lastName);
		String result=str.toString();
		System.out.println(result);
	}
}
