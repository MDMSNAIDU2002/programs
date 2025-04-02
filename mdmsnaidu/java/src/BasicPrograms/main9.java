package BasicPrograms;
class banks{
	float getrateofintrest() {
		return 0;
	}
}
class SBII extends banks{
	float getrateofinterst() {
		return 8.4f;
	}
}
class ICICI extends banks{
	float getrateofinterst() {
		return 7.3f;
	}
}
class AXISS extends banks{
	float getrateofintrest() {
		return 9.3f;
	}
}
public class main9 {
	public static void main(String args[]) {
		banks b; 
		b=new SBII();
		System.out.println("SBI rate of intrest"+b.getrateofintrest());
		b=new ICICI();
		System.out.println("ICIC rate of intrest"+b.getrateofintrest());
		b=new AXISS();
		System.out.println("AXIS rate of intrest"+b.getrateofintrest());
	}
}

