package BasicPrograms;

public class object {
	int id ;
	String name;
	public object(int id,String name) {
		this.id=id;
		this.name=name;
	}
		public void display() {
			System.out.println("student id"+" "+id);
			System.out.println("student name "+" "+name);
	}
	}
public class ObjectConstructor{
	public static void main(String[] args) {
		object s1=new object(2222,"abdul");
		object s2=new object(3333, "rambo");
		s1.display();
		s2.display();
		
	}
}
