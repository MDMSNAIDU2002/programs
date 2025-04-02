package naidu;

public class main16 {
	 public static void main(String[] args) {
		int[]number= {1,2,3,4,5};
		try {
			int index=10;
			int value=number[index];
			System.out.println("Value at index"+index);
		}
		catch(Exception e) {
			System.out.println("Error:index is out of bond");
			
		}
	}
}
