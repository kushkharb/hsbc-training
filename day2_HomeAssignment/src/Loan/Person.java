package Loan;

public class Person {

	private String name;
	private int age;
	private String loanType;
	
	public Person(String name, int age,String loanType) {
		
		this.name = name;
		this.age = age;
		this.loanType=loanType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	
}
