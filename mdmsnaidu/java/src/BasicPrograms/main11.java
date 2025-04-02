package BasicPrograms;
class Animal2{
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal2{
	void eat() {
		System.out.println("eating fruits .");
	}
}
class BabyDog extends Dog{
	void eat() {
		System.out.println("drinking water");
	}
}

public class main11 {
	public static void main(String[] args) {
		Animal2 a1,a2,a3;
		a1=new Animal2();
		a2=new Dog();
		a3=new BabyDog();
		a1.eat();
		a2.eat();
		a3.eat();
	}

}






