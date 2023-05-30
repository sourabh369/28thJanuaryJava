package constructor;

public class Sample8 {
	
	 String sname;
	 int age;
	 double sal;
	 
	 Sample8(String a , int b , double c)
	 {
		 sname = a;
		 age = b;
		 sal = c;
	 }
	 
	 public void information() {
		System.out.println("Employee info : " + sname + " " + age + " " + sal);
	}
	 
	 public static void main(String[] args) {
		Sample8 s8 = new Sample8("Sourabh", 30, 3000000);
		s8.information();
	}

}
