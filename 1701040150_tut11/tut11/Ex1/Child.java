package tut11.Ex1;

public class Child extends Person{

	protected int height;
	
	public Child() {}

	public Child(String name, int age, int heght) {
		super(name, age);
	}
	
	@Override
	protected void setAge(int age){
		if (age > 15) {
			throw new IllegalArgumentException("Child's age must be lesser than 15!");
		}
		super.setAge(age);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Child [name = " + name + ", age= " + age + ", height = " + height + "]";
	}
}
