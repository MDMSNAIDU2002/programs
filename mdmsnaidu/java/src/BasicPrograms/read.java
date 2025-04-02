package BasicPrograms;
import java.io.*;

public class read {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("./n.txt");
			int i;
			 while ((i = fis.read()) != -1) {
			System.out.print((char)i);
			 }
			fis.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
