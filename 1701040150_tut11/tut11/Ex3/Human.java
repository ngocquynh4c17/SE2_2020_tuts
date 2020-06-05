package tut11.Ex3;

public class Human {

	protected String firstName;
	protected String lastName;

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		char[] charAray = firstName.toCharArray();
		boolean isUpper = Character.isUpperCase(charAray[0]);
		if (!isUpper) {
			throw new IllegalArgumentException("Expected upper case letter! Argument: firstName");
		} else if (firstName.length() < 4) {
			throw new IllegalArgumentException("Expected length at least 4 symbols! Argument: firstName");
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		char[] charAray = lastName.toCharArray();
		boolean isUpper = Character.isUpperCase(charAray[0]);
		if (!isUpper) {
			throw new IllegalArgumentException("Expected upper case letter! Argument: lastName");
		} else if (lastName.length() < 3) {
			throw new IllegalArgumentException("Expected length at least 3 symbols! Argument: lastName");
		}
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "FirstName: " + firstName + "\nLastName: " + lastName + "\n";
	}

}
