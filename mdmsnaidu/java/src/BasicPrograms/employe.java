package BasicPrograms;

public class employe {
	int id;
	String name;
	void insert(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public class Testemploye{
		public static void main(String[] args) {
			employe s1=new employe();
			employe s2=new employe();
			employe s3=new employe();
			s1.insert(101,"raja");
			s2.insert(102,"durga");
			s3.insert(103,"vasu");
			s1.display();
			s2.display();
			s3.display();
		
		}
	}

}
