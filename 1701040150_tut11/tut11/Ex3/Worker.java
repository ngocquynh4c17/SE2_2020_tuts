package tut11.Ex3;

import java.text.DecimalFormat;

public class Worker extends Human {

	private static DecimalFormat df2 = new DecimalFormat("#.##");

	protected double weekSalary;
	protected int workHoursPerDay;

	public Worker() {
		// TODO Auto-generated constructor stub
	}

	public Worker(String firstName, String lastName, double weekSalary, int workHoursPerDay) {
		super(firstName, lastName);
		this.setWeekSalary(weekSalary);
		this.setworkHoursPerDay(workHoursPerDay);
	}

	public double getWeekSalary() {
		return weekSalary;
	}

	public void setWeekSalary(double weekSalary) {
		if (weekSalary <= 10) {
			throw new IllegalArgumentException("Expected value mismatch! Argument: weekSalary");
		}
		this.weekSalary = weekSalary;
	}

	public int getworkHoursPerDay() {
		return workHoursPerDay;
	}

	public void setworkHoursPerDay(int workHoursPerDay) {
		if ((workHoursPerDay < 1) || (workHoursPerDay > 12)) {
			throw new IllegalArgumentException("Expected value mismatch! Argument: workHoursPerDay");
		}
		this.workHoursPerDay = workHoursPerDay;
	}

	@Override
	public void setLastName(String lastName) {
		if (lastName.length() <= 3) {
			throw new IllegalArgumentException("Expected length more than 3 symbols! Argument: lastName");
		}
		super.setLastName(lastName);
	}

	protected double getSalaryPerHour(double weekSalary, int workHoursPerDay) {
		double salaryPerHour = (weekSalary / 7) / workHoursPerDay;
		return salaryPerHour;
	}

	@Override
	public String toString() {
		double salaryPerHour = getSalaryPerHour(weekSalary, workHoursPerDay);
		System.out.println("----WORKER----");
		return super.toString() + "Week Salary: " + df2.format(weekSalary) + "\nWorking Hours per day = "
				+ workHoursPerDay + "\nSalary per hour = " + df2.format(salaryPerHour) + "\n";
	}

}
