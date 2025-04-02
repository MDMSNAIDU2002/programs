package BasicPrograms;
import java.io.*;
import java.util.*;
public class Demo {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the line num: ");
		int num = scan.nextInt();
		try {
			FileInputStream fin = new FileInputStream("Rocky.txt");
			int i,count=0;
			
			while((i=fin.read())!=-1) {
				if((char)i=='\n') {
					count++;
				}
				if(count+1==num) {
					System.out.print((char)i);
				}
			}
			System.out.println(count+"lines..");

		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
}
