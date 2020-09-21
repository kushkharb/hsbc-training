package BankAccountQ10;

public class BankAccount implements AccountOperationsInterface {
	
	double balance;
	boolean isBlocked=false;
	
	public BankAccount(double balance) {
		this.balance=balance;
	}

	@Override
	public double deposite(double amt) throws AccountBlockedException {
		// TODO Auto-generated method stub
		try {
			if(isBlocked==true) {
				throw new AccountBlockedException();
			}else{
				balance=balance+amt;
			}
		}catch(AccountBlockedException e) {
			throw e;
		}
		return balance;
	}

	@Override
	public double withdraw(double amt) throws AccountBlockedException, InsufficientBalanceException {
		// TODO Auto-generated method stub
		
		if(isBlocked==true) {
			throw new AccountBlockedException();
		}else if(balance<amt) {
			throw new InsufficientBalanceException();
		}else {
			balance=balance - amt;
		}
		return balance;
	}

	@Override
	public double getBalance() throws AccountBlockedException {
		// TODO Auto-generated method stub
		try {
		if(isBlocked==true) {
			throw new AccountBlockedException();
		}
		else {
			return balance;
		}}catch(AccountBlockedException e) {
			throw e;
		}
	}

	@Override
	public void blockAccount() {
		// TODO Auto-generated method stub
		isBlocked=true;

	}

}
