
public class EmpDb {
	Emp[] emps = new Emp[10];

	public EmpDb(){
	emps[0] = new Emp(101,"ram");
	emps[1] = new Emp(102,"kush");
	}
	public void SearchEmp(int empId) {
		for(int i=0;i<emps.length;i++) {
			if(emps[i]!=null && emps[i].getEmpId()==empId ) {
				System.out.println("present "+emps[i].getEmpId());
			}
		}
	}
	public String AddEmp(Emp emp) {
//		int i = emps.length;
//	 emps[i]=new Emp(emp.empId,emp.name);
		
		String messege="";
		for(int i=0;i<emps.length;i++) {
			if(emps[i]==null) {
				emps[i]=emp;
				messege = "added";
				break;
			}else {
//				continue;
				messege ="db full";
			}
		}
		return messege;
	}
	public void ListOfEmp() {
		for(int i=0;i<emps.length;i++) {
			if(emps[i]!=null) {
			System.out.println(emps[i].getEmpInfo());
			}
		}
	}
	
	public static void main(String[] args) {
		EmpDb e = new EmpDb();
		Emp emp = new Emp(103,"loki");
		e.SearchEmp(102);
		e.ListOfEmp();
		System.out.println(e.AddEmp(emp));
		e.ListOfEmp();
		
	}
	
}
