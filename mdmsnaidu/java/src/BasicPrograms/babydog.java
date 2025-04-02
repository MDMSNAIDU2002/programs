package BasicPrograms;

public class babydog extends dog{
	void weep() {
		System.out.println("weeping");
	}
	public static void main(String[] args) {
		babydog bd1=new babydog(); 
		bd1.weep();
		bd1.bark();
		bd1.eat();
	}

}
