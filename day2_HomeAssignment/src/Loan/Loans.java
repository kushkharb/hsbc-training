package Loan;

public class Loans {

	public static void main(String[] args) {
		
		Person p1 = new Person("kush",23,"PersonalLoan");
		
		String loanType = p1.getLoanType();
		if(loanType.equals("PersonalLoan"))
		{
			PersonalLoan pl = new PersonalLoan(5,200000,24,p1);
		System.out.println(pl.getPersonalLoaninfo());	
		}
		else
		{
			HomeLoan hl = new HomeLoan(5,200000,24,p1);
			System.out.println( hl.getHomeLoaninfo());
		     
		}
	}
}
