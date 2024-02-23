package q_one;

import java.util.Calendar;

public class Appointment {

	private Calendar appDate;
	private int noOfPatients;

	public Appointment(int Day, int Month, int Year, int noOfPatients) throws InvalidDataException {
		this.appDate = Calendar.getInstance();
		this.appDate.set(Year, Month, Day);
		if (noOfPatients < 1 || noOfPatients > 15) {
			throw new InvalidDataException();
		} else {
			this.noOfPatients = noOfPatients;
		}
	}

	public Appointment(int Day, int Month, int Year) {
		this.appDate = Calendar.getInstance();
		this.appDate.set(Year, Month, Day);
	}

	@Override
	public String toString() {
		return "Appointment [appDate=" + appDate.getTime() + ", noOfPatients=" + noOfPatients + "]";
	}

	public Calendar getAppDate() {
		return appDate;
	}

	public void setAppDate(int Month, int Day, int Year) {
		this.appDate.set(Year, Month, Day);
	}

	public int getNoOfPatients() {
		return noOfPatients;
	}

	public void setNoOfPatients(int noOfPatients) throws InvalidDataException {
		if (noOfPatients < 1 || noOfPatients > 15) {
			throw new InvalidDataException();
		} else {
			this.noOfPatients = noOfPatients;
		}
	}

	public Appointment() {
		// TODO Auto-generated constructor stub
	}

}
