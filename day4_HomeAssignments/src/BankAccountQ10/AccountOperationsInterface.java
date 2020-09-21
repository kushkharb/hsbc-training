package BankAccountQ10;

public interface AccountOperationsInterface {
	
	public double deposite(double amt) throws AccountBlockedException;
	public double withdraw(double amt) throws AccountBlockedException,InsufficientBalanceException;
	public double getBalance() throws AccountBlockedException;
	public void blockAccount();

}
