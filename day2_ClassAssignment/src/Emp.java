
public class Emp {
//public static void main(String[] args) {
	int empId;
	String name;
	
	public Emp(int empId,String name){
		this.empId=empId;
		this.name=name;
	}
	
	public String getEmpInfo() {
		return  name ;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
//}
}
