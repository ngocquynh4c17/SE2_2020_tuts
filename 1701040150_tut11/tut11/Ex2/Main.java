package tut11.Ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Author: ");
			String author = scanner.nextLine();
			System.out.println("Title: ");
			String title = scanner.nextLine();
			System.out.println("Price: ");
			double price = Double.valueOf(scanner.nextLine());
			
			Book book = new Book(author, title, price);
			
			GoldenEditionBook goldenEditionBook = new GoldenEditionBook(title, author, price);
			
			System.out.println(book.toString());
			System.out.println(goldenEditionBook.toString());
		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage());
		}
	}

}
