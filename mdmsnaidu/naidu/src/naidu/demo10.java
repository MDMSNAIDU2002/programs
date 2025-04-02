package naidu;

 class demo10 {
	 int rollno;
	 String name;
	 String city;
	 demo10(int rollno,String name,String city){
		 this.rollno=rollno;
		 this.name=name;
		 this.city=city;
		 
	 }
	
	public static void main(String[] args) {
		demo10 d1=new demo10(101,"raj","kadapa");
		demo10 d2=new demo10(102,"vijay","karnool");
		System.out.println(d1);
		System.out.println(d2);
	
		
	}

}
