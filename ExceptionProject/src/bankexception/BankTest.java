package bankexception;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BankAccount a = new BankAccount(101, "nischal", 5000);
			a.withdraw(2000);
			
			BankAccount b = new BankAccount(101, "nisc", 40000);
			b.withdraw(30000);
		} catch(OpeningBalanceException ex) {
			System.out.println(ex);
		} catch(InsufficientBalanceException ex) {
			System.out.println(ex);
		} catch(InvalidNameException ex) {
			System.out.println(ex);
		}
	}

}

class BankAccount {
	String regex = "^[aA-zZ ]*$";
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public BankAccount(int accountNumber, String accountHolder, double balance) throws OpeningBalanceException, InvalidNameException {
		super();
		this.accountNumber = accountNumber;
		
		if(accountHolder.matches(regex)) {
			this.accountHolder = accountHolder;
		} else {
			throw new InvalidNameException("invalid name");
		}
		
		if(balance < 3000) {
			throw new OpeningBalanceException("min 3000 balance required to open the account");
		} else {
			this.balance = balance;
		}
	}
	
	void withdraw(double amount) {
		if(amount > 50000) {
			throw new IncomeProofException("please provide income proof");
		}
		
		if(balance < amount) {
			throw new InsufficientBalanceException("insufficient balance");
		} else {
			this.balance = balance - amount;
			System.out.println("remaining balance ===> " + this.balance);
		}
	}
}