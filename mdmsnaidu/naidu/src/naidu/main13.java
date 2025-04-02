package naidu;

public class main13 {
	public static void main(String[] args) {
		
	
	int dividend=10;
	int divisor=0;
	try {
		int result=dividend/divisor;
		System.out.println("Result:"+result);
	}
	catch(ArithmeticException e){
		System.out.println("Error:divison by zero is not allowed");
	}

}
}
