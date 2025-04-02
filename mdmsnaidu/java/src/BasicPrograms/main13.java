package BasicPrograms;

abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw()
	{
		System.out.println("drawing rectangel");
	}
}
class Circle extends Shape{
	void draw()
	{
		System.out.println("drawing Circle");
	}
}
public class main13 {
	 public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
	}

}
