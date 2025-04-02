package BasicPrograms;
class Animal1{
	void eat() {
		System.out.println("eating");
	}
}
class dog1 extends Animal1{
	void bark() {
		System.out.println("barking");
	}
}
class baby extends Animal1{
	void swap() {
		 System.out.println("swaping");
	}
}
public class main4 {
public static void main(String[] args) {
	baby bd=new baby();
	bd.swap();
    bd.eat();
    
	}


}
