package BasicPrograms;
class Adder1{
	void add(int a,long b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}

public class main6 {
	public static void main(String[] args) {
		Adder1 ad=new Adder1();
		ad.add(10,20);
		ad.add(10, 20, 30);
	}

}
