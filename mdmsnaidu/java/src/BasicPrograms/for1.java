package BasicPrograms;

public class for1 {
	public static void main(String[] args) {
		for(int i=50;i<=150;i++) {
			boolean isprime=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					isprime=false;
					break;
				}
			}
		}
	}

}
