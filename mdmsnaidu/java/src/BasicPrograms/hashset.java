package BasicPrograms;
import java.util.*; 

public class hashset {
	public static void main(String args[]){  
 
		HashSet hs=new HashSet();  
	    hs.add("durga");  
		hs.add("manikanta");  
		hs.add("swamy");  
		hs.add("naidu");  
		  
		Iterator i=hs.iterator();  
		while(i.hasNext()){  
		System.out.println(i.next());  
		} 
		}  
		}  
