package BasicPrograms;

public class op {
	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a,double b,double c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		 op a1=new op();
		  System.out.println(a1.add(1,1));
		 System.out.println( a1.add(1,2,33));
	}

}
