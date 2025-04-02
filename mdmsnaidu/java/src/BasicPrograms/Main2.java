package BasicPrograms;
class Animal{
	void eat() {
		System.out.println("eating");
	}
	
}
class dog extends Animal{
	void bark(){
		System.out.println("barking");
		
	}
}
class cat extends dog{
	void weep() {
		System.out.println("weeping");
	}
}

public class Main2 {
	public static void main(String[] args) {
		cat c=new cat();
				c.weep();
				c.bark();
				c.eat();
				
				
	}

}
