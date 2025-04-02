package BasicPrograms;

public class throughmethod {
	int rollno;
	String name;
	void insertRecord(int r,String n) {
		rollno=r;
		name=n;
	}
	void displayinformation() {
		System.out.println(rollno+name);
	}
	class teststudent{
		public static void main(String[] args) {
			throughmethod s1=new throughmethod();
			throughmethod s2=new throughmethod();
			s1.insertRecord(88,"ram");
			s2.insertRecord(0, "durga");
			s1.displayinformation();
			s2.displayinformation();
			
		}
	}

}
