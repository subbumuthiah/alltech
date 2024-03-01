package bank;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BankOperations implements IBankAccountOperation {
	
	private float balance = 0;
	
	public BankOperations() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public void ProcessOperation(String message) {
		// TODO Auto-generated method stub
		int choice = parse_message(find(split(message)));
		switch(choice) {
			//See, show, BALANCE
			case 1:
				System.out.println("Balance is: "+balance);
				break;
			//deposit, DEPOSIT
			case 2:
				System.out.println("Balance before deposit: "+balance);
				Deposit(parse_value(split(message)));
				System.out.println("Balance after deposit: "+balance);
				break;
			//withdraw, WITHDRAW
			case 3:
				System.out.println("Balance before withdrawal: "+balance);
				Withdraw(parse_value(split(message)));
				System.out.println("Balance after withdrawal: "+balance);
				break;
		}
	}



	@Override
	public void Deposit(float d) {
		// TODO Auto-generated method stub
		balance += d;
	}



	@Override
	public void Withdraw(float d) {
		// TODO Auto-generated method stub
		float temp = balance - d;
		if(temp < 0) {
			System.out.println("No Changes made, insufficient funds");
		} else {
			balance -= d;
		}
		
	}

	public int parse_message(String inp) {
		if(inp.equalsIgnoreCase("See") || inp.equalsIgnoreCase("Show")) {
			return 1;
		} else if(inp.equalsIgnoreCase("Deposit") || inp.equalsIgnoreCase("Put") || inp.equalsIgnoreCase("Invest") || inp.equalsIgnoreCase("Transfer")) {
			return 2;
		} else if(inp.equalsIgnoreCase("Withdraw") || inp.equalsIgnoreCase("Pull")) {
			return 3;
		} else {
			return 0;
		}
	}
	
	public String [] split(String inp) {
		String [] ret = inp.split(" ");
		return ret;
	}
	
	public String find(String[] i) {
		String ret = "Not";
		for(String inp : i) {
			if(				inp.equalsIgnoreCase("See") 
							|| inp.equalsIgnoreCase("Show") 
							|| inp.equalsIgnoreCase("Deposit")
							|| inp.equalsIgnoreCase("Put")
							|| inp.equalsIgnoreCase("Invest") 
							|| inp.equalsIgnoreCase("Transfer") 
							|| inp.equalsIgnoreCase("Withdraw") 
							|| inp.equalsIgnoreCase("Pull")
							) {
				return inp;
			}
		}
	
		return ret;
	}
	
	public int parse_value(String[] i) {
		int ret = -1;
		for(String inp : i) {
			try {
				Integer x = Integer.parseInt(inp);
				return x;
			} catch(NumberFormatException n) {
				
			}
		}
	
		return ret;
	}
}
