package BasicPrograms;
class shape{
	void draw() {
		System.out.println("drawing..");
	}
}
class Rectangle extends shape{
  void draw() {
	  System.out.println("drawing rectangle...");
	 
  }
}
class Circle extends shape{
	void draw() {
		System.out.println("drawing circle...");
	}
}
class triangle extends shape{
	void draw() {
		System.out.println("drawing triangle...");
	}
}

public class main10 {
 public static void main(String[] args) {
	shape s;
	s=new Rectangle();
	s.draw();
	s=new Circle();
	s.draw();
	s=new triangle();
	s.draw();
}
}
