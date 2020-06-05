package model;

/**
 * This is a model class represents a Shirt entity for the table Shirt in database
 */

public class Shirt {
	protected int shirtID;
	protected String shirtStyle;
	protected String shirtName;
	protected double Price;
	
	public Shirt(int shirtID, String shirtStyle, String shirtName, double price) {
		super();
		this.shirtID = shirtID;
		this.shirtStyle = shirtStyle;
		this.shirtName = shirtName;
		Price = price;
	}

	public Shirt() {
	}

	public int getShirtID() {
		return shirtID;
	}

	public void setShirtID(int shirtID) {
		this.shirtID = shirtID;
	}

	public String getShirtStyle() {
		return shirtStyle;
	}

	public void setShirtStyle(String shirtStyle) {
		this.shirtStyle = shirtStyle;
	}

	public String getShirtName() {
		return shirtName;
	}

	public void setShirtName(String shirtName) {
		this.shirtName = shirtName;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}
	
	
}
