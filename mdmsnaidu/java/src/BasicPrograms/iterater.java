package BasicPrograms;
import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.*; 

public class iterater {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	

}
