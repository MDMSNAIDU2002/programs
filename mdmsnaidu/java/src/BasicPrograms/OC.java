package BasicPrograms;

public class OC {
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		OC oc=new OC();
		oc.sum(12,220);
		oc.sum(12, 22,777);
	}

}
