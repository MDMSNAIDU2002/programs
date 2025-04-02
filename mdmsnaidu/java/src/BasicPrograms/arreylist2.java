package BasicPrograms;
import java.util.*;  

import java.util.ArrayList;

public class arreylist2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		List ali=new ArrayList();
		al.add(10);
		al.add("naidu");
		al.add('a');
		al.add("false");
		al.add(10);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}

}
