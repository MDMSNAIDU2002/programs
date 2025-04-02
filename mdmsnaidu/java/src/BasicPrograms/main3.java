package BasicPrograms; 
import java.lang.*;
class Animal{
	void bark() {
		System.out.println("barking");
	}
}
class dog extends Animal{
	void eat() {
		System.out.println("eating");
	}
}

public class main3 {
 public static void main(String[] args) {
	 dog d=new dog();
	 d.bark();
	 d.eat();
	
}

}
