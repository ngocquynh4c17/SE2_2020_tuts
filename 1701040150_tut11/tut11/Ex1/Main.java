package tut11.Ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String continueChoice = "y";
		while (continueChoice.equals("y")) {

			System.out.println("Enter your option: \n" + "1 - Person \n" + "2 - Student");

			String choice = scanner.nextLine();

			if (choice.equals("2")) {
				try {
					System.out.println("-------- Child --------");
					System.out.println("Child's name: ");
					String name1 = scanner.nextLine();
					System.out.println("Child's age: ");
					int age1 = Integer.valueOf(scanner.nextLine());
					System.out.println("Child's height: ");
					int height = Integer.valueOf(scanner.nextLine());

					Child child = new Child(name1, age1, height);
					System.out.println(child.toString());
				} catch (IllegalArgumentException error) {
					System.out.println(error.getMessage());
				}
			} else if (choice.equals("1")) {
				try {
					System.out.println("-------- Person --------");
					System.out.println("Person's name: ");
					String name2 = scanner.nextLine();
					System.out.println("Person's age: ");
					int age2 = Integer.valueOf(scanner.nextLine());

					Person Person = new Person(name2, age2);
					System.out.println(Person.toString());
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
