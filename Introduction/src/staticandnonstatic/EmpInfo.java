package staticandnonstatic;

public class EmpInfo {
	
	public static void main(String[] args) {
		
		Emp e1 = new Emp();
		e1.name="Sourabh";
		e1.id=1000;
//		e1.CEOName="abc";
		Emp.CEOName="abc";
		
		Emp e2 = new Emp();
		e2.name="Shrikant";
		e2.id=1001;
//		e2.CEOName="abc";
		Emp.CEOName="abc";
		
		Emp e3 = new Emp();
		e3.name="Ashish";
		e3.id=1002;
//		e3.CEOName="xyz";
		Emp.CEOName="xyz";
		
		e1.empdetails();
		e2.empdetails();
		e3.empdetails();
		
	}

}
