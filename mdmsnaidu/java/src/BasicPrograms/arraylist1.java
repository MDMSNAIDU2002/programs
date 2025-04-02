package BasicPrograms;
import java.util.*;  

public class arraylist1 {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add( "naidu");
		list.add("ram");
		list.add("durga");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
