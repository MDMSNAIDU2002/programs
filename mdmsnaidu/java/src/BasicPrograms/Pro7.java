package BasicPrograms;
import java.io.*;
public class Pro7 {
	public static void main(String[] args)  {
		try {
			FileInputStream fin = new FileInputStream("Rocky.txt");
			int i,count=0;
			
			while((i=fin.read())!=-1) {
				if((char)i=='\n') {
					count++;
				}
			}
			System.out.print(count+"lines..");

		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
}
