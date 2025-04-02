//package BasicPrograms;
//
//public class ex1 {
//	public static void main(String args[]){  
//		try{  
//
//			int data=100/0;  
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e);
//			}  
//
//		System.out.println("rest of the code...");  
//	}  
//
//}
package BasicPrograms;

class e1 {
float salary=40000;
}
class e2 extends e1{
	int bonus=10000;
	
}
public class Main {
	public static void main(String args[]) {
		e2 e=new e2();
		System.out.println(e.salary);
		System.out.println(e.bonus);
	}
	
	
	
}
