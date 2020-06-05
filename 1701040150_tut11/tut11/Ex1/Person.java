package tut11.Ex1;

public class Person {

	protected int age;
	protected String name;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	protected void setAge(int age){
		if (age < 1) {
			throw new IllegalArgumentException("Age must be positive!");
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
		}
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name = " + name + ", age = " + age + "]";
	}
}
