package BasicPrograms;

public class progs {
	public static void main(String[] args) {
		int[] naidu= {1,2,3,4,5,6};
		try {
			
			System.out.println(naidu[-1]);
		}
		catch(Exception  e) {
			System.out.println(e);
		}
		System.out.println("hello naidu");
	}

}
