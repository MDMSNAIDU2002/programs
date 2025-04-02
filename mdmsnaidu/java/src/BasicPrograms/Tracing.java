package BasicPrograms;
import java.io.*;
public class Tracing {
  public static void main(String[] args) throws IOException,FileNotFoundException {
	 try {
		 FileInputStream fin = new FileInputStream("Rocky.txt");
		 int i,count=0,words=0,tot=0;
		 while((i=fin.read())!=-1) {
			 
			 if((char)i==' ') {
				 words++;
			 }
			 if((char)i=='\n') {
				 words++;
				 tot=tot+words;
				 System.out.println(words);
				 words=0;
			 }
		 }
		 System.out.println(tot);
	 }catch(Exception e) {
		 
	 }
}
}
