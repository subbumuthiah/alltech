package q_one;

import java.util.ArrayList;
import java.util.Iterator;

public class Doctor {

	private String docId;
	private String docName;
	private ArrayList<Appointment> appList = new ArrayList<Appointment>();

	public Doctor(String docId, String docName, ArrayList<Appointment> appList) {
		this.docId = docId;
		this.docName = docName;
		this.appList = appList;
	}

	public Doctor(String docId, String docName) {
		this.docId = docId;
		this.docName = docName;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public ArrayList<Appointment> getAppList() {
		return appList;
	}

	public void setAppList(ArrayList<Appointment> appList) {
		this.appList = appList;
	}

	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", docName=" + docName + ", appList=" + appList + "]";
	}

	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public void addAppointment(Appointment a) {
		this.getAppList().add(a);
	}

	public void printAppointment() {
		Iterator<Appointment> itr = this.appList.iterator();
		while (itr.hasNext()) {
			System.out.println("The appointment date is: " + itr.next().getAppDate().getTime());
		}
	}

}
