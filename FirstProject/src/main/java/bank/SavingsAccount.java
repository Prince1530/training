package bank;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SavingsAccount {
	@Id
private int accno;
private String accHolder;
private double balance;
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getAccHolder() {
	return accHolder;
}
public void setAccHolder(String accHolder) {
	this.accHolder = accHolder;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

	
}
