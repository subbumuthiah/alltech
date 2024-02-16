package emp;
import java.util.*;
import java.io.*;
public class TestFile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees would you like to add? ");
		int n = sc.nextInt();
		Employee [] e = new Employee[n];
		String empName;
		int empId = 0;
		String grade;
		int i = 0;
		boolean flag = true;
		boolean intflag = true;
		int err_count = 0;
		while((i < n) && (err_count <= 3)){
			flag = true;
//			err_count = 0;
			System.out.println("Please enter the Employee's ID: ");
			while(intflag == true){
				if(sc.hasNextInt()){
					int temp = sc.nextInt();
					if(temp > 0){
						empId = temp;
						intflag = false;
					} else{
						System.out.println("Please enter a positive integer");
						sc.nextLine();
					}
					
				} else{
					System.out.println("Please enter a valid employee ID");
					sc.next();
				}
			}
			
			sc.nextLine();
			System.out.println("Please enter the employees name: ");
			empName = sc.nextLine();
			System.out.println("Please enter the grade, U1, U2, U3, U4, P1, or P2: ");
			grade = sc.nextLine();
			try {
				e[i] = new Employee(empId, empName, grade);
			} catch (InvalidGradeException e1) {
				// TODO Auto-generated catch block
				System.out.println("The grade input is invalid, please try again");
				flag = false;
				err_count++;
			}
			if(flag == true){
				i++;
				err_count = 0;
				System.out.println("Succesfully created, please continue if prompted");
			}
			
		}
		String x;
		char [] c;
		if(err_count >= 3){
			System.out.println("Error with input, please restart.");
		} else{
			try {
				FileWriter fw;
				BufferedWriter bw;
				fw = new FileWriter("empdetails.txt");
				bw = new BufferedWriter(fw);
//				bw.write(5);
			
			for(int j = 0; j < n; j++){
				System.out.println(e[j]);
				x = e[j].toString();
				try {
					bw.write(x);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("err");
					System.out.println("****************");
				}
			}
			bw.close();
			fw.close();
			
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
				System.out.println("*****************");
			}
		}
	}

}
