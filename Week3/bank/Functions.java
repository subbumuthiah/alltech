package bank;

public class Functions {

	public Functions() {
		// TODO Auto-generated constructor stub
	}
	
	public int parse(String inp) {
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

}
