package BasicPrograms;

abstract class vani {
	abstract int roi();
		
	}
class rani extends vani{
	int roi() {
		return 7;
	}
}
class fani extends vani{
	int roi(){
		return 8;
	}
	public static void main(String[] args) {
		fani fani=new fani();
		
		System.out.println(fani.roi());
		
	}
	
}

