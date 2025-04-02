package BasicPrograms;


import java.util.Scanner;

public class string5 {

public static void main(String args[]) {

	String res=" ";

	Scanner scan=new Scanner(System.in);

	System.out.println("enter the String:");

	String sc=scan.nextLine();

	System.out.println("enter char to remove");

	char ch=scan.next().charAt(0);

	for(int i=0;i<sc.length();i++)

	{

		if(sc.charAt(i)!=ch)

		{

			res+=sc.charAt(i);

		}

	}

	System.out.println(res);

	

}

}