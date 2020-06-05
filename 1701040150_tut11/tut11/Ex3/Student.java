package tut11.Ex3;

public class Student extends Human {

	protected String facultyNumber;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName, String lastName, String facultyNumber) {
		super(firstName, lastName);
		this.setFacultyNumber(facultyNumber);
	}

	public String getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(String facultyNumber) {
		if ((facultyNumber.length() < 5) || (facultyNumber.length() > 10) || (facultyNumber.contains(" "))) {
			throw new IllegalArgumentException("Invalid faculty number!");
		}
		this.facultyNumber = facultyNumber;
	}

	@Override
	public String toString() {
		System.out.println("----STUDENT----");
		return super.toString() + "Faculty Number: " + facultyNumber + "\n";
	}

}
