package BasicPrograms;

class Bank{
	int getrateofintrest() {
		return 0;
	}
}
class SBI extends Bank{
	int getrateofintrest() {
		return 8;
	}
}
class ICIC extends Bank{
	int getrateofintrest() {
		return 7;
	}
}
class AXIS extends Bank{
	int getrateofintrest() {
		return 9;
	}
}
public class main8 {
	public static void main(String[] args) {
		SBI s=new SBI();
		ICIC i=new ICIC();
		AXIS a=new AXIS();
		System.out.println("SBI rate of intrest :"+s.getrateofintrest());
		System.out.println("ICIC rate of intrest :"+i.getrateofintrest());
		System.out.println("AXIS rate of intrest :"+a.getrateofintrest());
	}
}
