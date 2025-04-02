package BasicPrograms;

import java.util.Scanner;

public class string16 {
	public static void main(String args[])

	 {

		 String s="welcome to java programming";

		 System.out.println("enter the search word:");

		 Scanner scan=new Scanner(System.in);

		 String s1=scan.nextLine();

		 if(s.contains(s1))

		 {

			 System.out.println("the word is in the string");

		 }

		 else

		 {

			 System.out.println("no it is false");

		 }

	 }

}
