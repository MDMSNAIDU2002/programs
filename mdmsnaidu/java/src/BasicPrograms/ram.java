package BasicPrograms;

abstract class ram1 {
	abstract void draw();
}
class naidu extends ram1{
	void draw() {
		System.out.println("draw by naidu");
	}
}
class ram extends ram1{
		void draw() {
			System.out.println("draw by naidu2");
		}
		public static void main(String[] args) {
			naidu ram1=new naidu();
			ram1.draw();
			
		}
	}

