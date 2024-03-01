package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class RegistrationPortal {
	
	
	
	List<Student> registeredStudents;
	static volatile RegistrationPortal curr;
	public void setRegisteredStudents(List<Student> registeredStudents) {
		this.registeredStudents = registeredStudents;
	}

	@Override
	public String toString() {
		return "RegistrationPortal [registeredStudents=" + registeredStudents + "]";
	}

	
	
	//using vector for thread safe
	public RegistrationPortal() {
		// TODO Auto-generated constructor stub
		registeredStudents = new Vector<Student>();
	}

	//using synchronized and static(for one common instance
	public static synchronized RegistrationPortal getRegistrationPortal() {
		if(curr != null) {
			return curr;
		} else {
			//new portal
			return new RegistrationPortal();
		}
	}
	
	//using synch
	public synchronized void register(Student student) {
		registeredStudents.add(student);
	}
	
	//create copy so its not overwritten
	public List<Student> getRegisteredStudents(){
		List<Student> arr = new ArrayList<Student>(this.registeredStudents);
		return arr;
	}
}
