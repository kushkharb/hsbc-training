package Loan;

public class PersonalLoan {

	double loanPercentage;
	double loanAmount;
	int months;
	Person p;
	public PersonalLoan(double loanPercentage, double loanAmount, int months,Person p) {
		this.loanPercentage = loanPercentage;
		this.loanAmount = loanAmount;
		this.months = months;
		this.p=p;
	}
	public String getPersonalLoaninfo()
	{
		return p.getName()+" "+p.getAge()+" "+ months+" "+loanPercentage+" "+loanAmount;
			
	}
}
