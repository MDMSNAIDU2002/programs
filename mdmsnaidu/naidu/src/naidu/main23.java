package naidu;

public class main23 {
 public static void main(String[] args) {
	 try {
		 System.out.println("inside the try block");
		 int data =25/0;
		 System.out.println(data);
	 }
	 catch(Exception e) {
		 System.out.println(e);
	 }
	 finally {
		 System.out.println("finally block is always ececuted ");
	 }
	 System.out.println("hello i how are you");
	
}

}
