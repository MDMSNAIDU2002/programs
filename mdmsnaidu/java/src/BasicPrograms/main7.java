package BasicPrograms;
class bike{
	void run() {
		System.out.println("running");
	}
}
class hero extends bike{
	void run() {
		System.out.println("running safely with 60km");
	}
}

public class main7 {
	public static void main(String args[]) {
		bike b=new hero();
		b.run();
	}

}
