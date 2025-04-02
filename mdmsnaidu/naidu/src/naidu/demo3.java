package naidu;

import java.util.Arrays;

public class demo3 {
	public static void main(String[] args) {
		String text=new String("hello,my name is naidu");
		String[]sentences=text.split("\\.");
		System.out.println(Arrays.toString(sentences));
	 
}

}
