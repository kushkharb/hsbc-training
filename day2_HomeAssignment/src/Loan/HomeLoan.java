package Loan;

public class HomeLoan {
	double loanPercentage;
	double loanAmount;
	int months;
	Person p;
	public HomeLoan(double loanPercentage, double loanAmount, int months,Person p) {
		this.loanPercentage = loanPercentage;
		this.loanAmount = loanAmount;
		this.months = months;
		this.p=p;
	}
	public String getHomeLoaninfo()
	{
		return p.getName()+" "+p.getAge()+" "+ months+" "+loanPercentage+" "+loanAmount;
			
	}
	
}
