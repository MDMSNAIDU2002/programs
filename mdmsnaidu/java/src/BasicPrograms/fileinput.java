package BasicPrograms;
import java.io.*;
public class fileinput {
	public static void main(String[] args) throws Exception {
		try {
			FileInputStream fi=new FileInputStream("./n.txt");
			int i=0;
			 while ((i = fi.read()) != -1) 
			 {
				 System.out.println((char)i);
			 }
			 fi.close();
			 System.out.println("file created");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
