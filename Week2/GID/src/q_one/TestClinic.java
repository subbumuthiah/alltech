package q_one;

import java.util.Arrays;
import java.util.Scanner;

public class TestClinic {

	public static void main(String[] args) {
		Doctor[] docs = new Doctor[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {

			System.out.println("Please enter the ID of the doctor: ");
			String docId = sc.nextLine();
//			sc.nextLine();
			System.out.println("Please enter the name of the doctor: ");
			String docName = sc.nextLine();
			docs[i] = new Doctor(docId, docName);
			for (int n = 0; n < 2; n++) {

				boolean ex_flag = false;
				boolean flag = false;

				System.out.println("Please enter the Month of the appointment: ");
				int appMonth = sc.nextInt();
				System.out.println("Please enter the Day of the appointment: ");
				int appDay = sc.nextInt();
				System.out.println("Please enter the Year of the appointment: ");
				int appYear = sc.nextInt();
				sc.nextLine();
				Appointment app = new Appointment(appDay, appMonth-1, appYear);
				while (flag == false) {
					System.out.println("Please enter the number of patients: ");
					int appNo = sc.nextInt();
					sc.nextLine();
					try {
						app.setNoOfPatients(appNo);
						ex_flag = false;
					} catch (InvalidDataException e) {
						ex_flag = true;
					} finally {
						if (ex_flag == true) {
							flag = false;
						} else {
							flag = true;
						}
					}
				}
				docs[i].addAppointment(app);
			}
		}
		
		System.out.println("Please enter the ID of the doctor you want the appointment info for:");
		String input = sc.nextLine();
		boolean inp_flag = false;
		for(int i = 0; i < 2; i++) {
			if(docs[i].getDocId().equalsIgnoreCase(input)) {
				docs[i].printAppointment();
				inp_flag = true;
			}
		}
		if(!inp_flag) {
			System.out.println("Doctor ID doesn't exist");
		}
	}
}
