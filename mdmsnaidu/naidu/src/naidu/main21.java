package naidu;

public class main21 {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("gpoing to divisible by 0");
				int b=39/0;
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}catch(Exception e){
			System.out.println(e);
			
		}
	}
}