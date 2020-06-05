package tut11.Ex2;

public class Book {

	protected String title;
	protected String author;
	protected double price;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, double price) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setPrice(price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title.length() < 3) {
			throw new IllegalArgumentException("Title not valid!");
		}
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		if (author.contains(" ")) {
			String[] sp = author.split(" ");
			char[] charAray = sp[1].toCharArray();
			boolean check = Character.isDigit(charAray[0]);
			if (check) {
				throw new IllegalArgumentException("Author not valid!");
			}
		}
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price <= 0) {
			throw new IllegalArgumentException("Price not valid!");
		}
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book: \n" 
				+ "Title: " + title + "\n"
				+ "Author: " + author +"\n" 
				+ "Price: " + price + "\n";
	}

}
