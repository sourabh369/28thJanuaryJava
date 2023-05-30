package constructor;

public class Sample17 
{
   String sname;
   int age;
   
   Sample17()
   {
	   sname = "Sourabh";
	   age = 30;
   }
   
   public void info()
   {
      System.out.println("Name is " + sname + " age is " +age);
   }
   
   public static void main(String[] args) 
   {
      Sample17 s17 = new Sample17();
      s17.info();
   }
   
   
}
