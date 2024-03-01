package bank;

import java.math.BigDecimal;


public interface IBankAccountOperation {

	public void Deposit(float d);
	public void Withdraw(float d);
	public void ProcessOperation(String message);
}
