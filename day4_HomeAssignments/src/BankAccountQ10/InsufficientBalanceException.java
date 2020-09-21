package BankAccountQ10;

public class InsufficientBalanceException extends Exception {
	
	@Override
	public String toString() {
		return "less balance";
	}

}
