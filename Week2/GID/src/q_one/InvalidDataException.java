package q_one;
//import java.lang.exception;

public class InvalidDataException extends Exception {

	public InvalidDataException() {
		// TODO Auto-generated constructor stub
		System.out.println("Error, number of patients must be between 1 and 15");
	}

}
