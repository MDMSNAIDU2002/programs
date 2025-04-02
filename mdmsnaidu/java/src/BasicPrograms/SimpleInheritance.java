package BasicPrograms;

class A{
	void msg() {
		System.out.println("Hello Harsa");
	}
}


public class SimpleInheritance extends A{
	public static void main(String args[]) {
			A a = new A();
			a.msg();
	}
}
