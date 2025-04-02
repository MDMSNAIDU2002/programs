package BasicPrograms;
import java.io.*;
public class io1 {
	public static void main(String[] args)throws Exception {
		try {
		FileOutputStream fo = new FileOutputStream("./n.txt");
		String s ="hello";
		byte[]b=s.getBytes();
		fo.write(b);
		System.out.println("file created");
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
}
}
	 
 
	    
	


