package BasicPrograms;
import java.util.Scanner;

public class string15 {
	 public static void main(String args[])

	 {

		 String s="hello world";

		 System.out.println("enter a String:");

		 Scanner scan =new Scanner(System.in);

		 String s1=scan.nextLine();

		 String s3=s.replaceAll("o", s1);

		 System.out.print(s3);

	 }

}
