package BasicPrograms;

public class inhere {
	int salary=30000;
	public char[] bouns;
	 }
class employee extends inhere{
	 int bouns=30000;
public static void main(String[] args) {
	 
	inhere e1=new inhere();
	System.out.println(e1.salary);
	System.out.println(e1.bouns);
	
}
}
