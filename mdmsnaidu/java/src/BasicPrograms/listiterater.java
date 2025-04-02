package BasicPrograms;
import java.util.*; 

public class listiterater {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(30);
		al.add(40);
		al.add(60);
		ListIterator i=al.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}

}
