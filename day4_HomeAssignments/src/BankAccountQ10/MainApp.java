package BankAccountQ10;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount a=new BankAccount(5000);
		try {
			System.out.println(a.getBalance());
		}catch(AccountBlockedException e) {
			System.out.println(e);
		}
		try {
			System.out.println(a.deposite(2000));
		} catch (AccountBlockedException e) {
			System.out.println(e);
		}
		try {
			System.out.println(a.withdraw(3000));
		} catch (AccountBlockedException | InsufficientBalanceException e) {
			System.out.println(e);
		}
		a.blockAccount();
		try {
			System.out.println(a.getBalance());
		}catch(AccountBlockedException e) {
			System.out.println(e);
		}
		try {
			System.out.println(a.deposite(2000));
		} catch (AccountBlockedException e) {
			System.out.println(e);
		}
		try {
			System.out.println(a.withdraw(3000));
		} catch (AccountBlockedException | InsufficientBalanceException e) {
			System.out.println(e);
		}
		a.isBlocked=false;
		try {
			System.out.println(a.withdraw(10000));
		} catch (AccountBlockedException | InsufficientBalanceException e) {
			System.out.println(e);
		}
		
	}

}
