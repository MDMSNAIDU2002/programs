package BasicPrograms;
import java.util.*; 

public class treeset {
	public static void main(String args[]){  
		
		TreeSet set=new TreeSet();  
		set.add("mahanthi");  
		set.add("durga");  
		set.add("manikanata");  
		set.add("swamy");  
		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  

}
