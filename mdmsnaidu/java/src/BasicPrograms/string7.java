package BasicPrograms;

import java.util.Scanner;

public class string7 {
	static void Demo(String str1,String str2) {

		System.out.println(str1.equals(str2));

		

	}

public static void main(String args[])

{

	Scanner scan=new Scanner(System.in);

	System.out.println("enter the String1:");

	String str1=scan.nextLine();

	System.out.println("enter the String2:");

	String str2=scan.nextLine();

	string7.Demo(str1,str2);

}

}
