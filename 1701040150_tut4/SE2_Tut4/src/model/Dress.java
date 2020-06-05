package model;

public class Dress {
	protected int dressID;
	protected String dressStyle;
	protected String dressName;
	protected double Price;
	
	
	public Dress(int dressID, String dressStyle, String dressName, double price) {
		super();
		this.dressID = dressID;
		this.dressStyle = dressStyle;
		this.dressName = dressName;
		Price = price;
	}


	public Dress() {
		// TODO Auto-generated constructor stub
	}


	public int getDressID() {
		return dressID;
	}


	public void setDressID(int dressID) {
		this.dressID = dressID;
	}


	public String getDressStyle() {
		return dressStyle;
	}


	public void setDressStyle(String dressStyle) {
		this.dressStyle = dressStyle;
	}


	public String getDressName() {
		return dressName;
	}


	public void setDressName(String dressName) {
		this.dressName = dressName;
	}


	public double getPrice() {
		return Price;
	}


	public void setPrice(double price) {
		Price = price;
	}

}
