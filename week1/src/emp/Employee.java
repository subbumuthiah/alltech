package emp;

public class Employee {

	int empId;
	String empName;
	String grade;
	
	public Employee(int empId, String empName, String grade) throws InvalidGradeException{
		if( (grade.equals("U1") || grade.equals("U2") || grade.equals("U3") || grade.equals("U4") || grade.equals("P1") || grade.equals("P2")) == false){
			throw new InvalidGradeException("Grade must be U1, U2, U3, U4, P1, or P2");
		}
		this.empId = empId;
		this.empName = empName;
		this.grade = grade;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String toString(){
		return "The Employee's ID is: "+this.empId+". \tThe Employee's Name is: "+this.empName+". \tThe Employee's Grade is: "+this.grade+".\n";
	}
	
}
