
public class Student {
	private String name;
	private int rollNo;
	
//	public Student(){
//	   this.name="ram";
//	   this.rollNo=101;
//	}
	public Student(String name,int rollNo) {
		this.name = name;
		this.rollNo=rollNo;
		
	}

   public void getStudentInfo()
   {
	   System.out.println(name+" "+rollNo);
   }
}
