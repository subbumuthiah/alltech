package bank;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOperations bo = new BankOperations();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		
		while(exit == false) {
			System.out.println("Please enter your request, or exit to exit: ");
			String inp = sc.nextLine();
			if(inp.equalsIgnoreCase("Exit")) {
				exit = true;
				break;
			} else {
				bo.ProcessOperation(inp);
			}
			
		}
		
	}

}
