package tut11.Ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String continueChoice = "y";
		while (continueChoice.equals("y")) {

			System.out.println("Enter your option: \n" + "1 - Student \n" + "2 - Worker");

			String choice = scanner.nextLine();

			if (choice.equals("1")) {
				try {
					System.out.println("firstName: ");
					String firstName = scanner.nextLine();
					System.out.println("lastName: ");
					String lastName = scanner.nextLine();
					System.out.println("facultyNumber: ");
					String facultyNumber = scanner.nextLine();
					Student student = new Student(firstName, lastName, facultyNumber);

					System.out.println(student.toString());
				} catch (IllegalArgumentException error) {
					System.out.println(error.getMessage());
				}
			} else if (choice.equals("2")) {
				try {
					System.out.println("firstName: ");
					String firstName = scanner.nextLine();
					System.out.println("lastName: ");
					String lastName = scanner.nextLine();
					System.out.println("weekSalary: ");
					double weekSalary = Double.valueOf(scanner.nextLine());
					System.out.println("workHoursPerDay: ");
					int workHoursPerDay = Integer.valueOf(scanner.nextLine());
					Worker worker = new Worker(firstName, lastName, weekSalary, workHoursPerDay);

					System.out.println(worker.toString());
				} catch (IllegalArgumentException error) {
					System.out.println(error.getMessage());
				}
			}
			System.out.println("Do you want to continue? y/n: ");
			continueChoice = scanner.next();
			choice = "0";
		}
		System.out.println("Goodbye!!!");
	}
}