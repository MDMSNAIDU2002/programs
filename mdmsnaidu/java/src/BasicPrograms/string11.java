package BasicPrograms;
import java.util.*;

public class string11 {
	public static void main(String[] args) {
        String[] s={"durga","swamy","surya","satish"};
        System.out.println("enter a char:");
        Scanner scan= new Scanner(System.in);
        String s1=scan.nextLine();
        char c=s1.charAt(0);
       
       
      for(int i=0;i<s.length;i++)
      {
         if(s[i].charAt(0)==c){
             System.out.println(s[i]);
         }
      }
    }

}
