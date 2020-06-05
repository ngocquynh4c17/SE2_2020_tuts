package model;

public class Acessories {
	protected int acessID;
	protected String acessStyle;
	protected String acessName;
	protected double Price;
	
	public Acessories(int acessID, String acessStyle, String acessName, double price) {
		super();
		this.acessID = acessID;
		this.acessStyle = acessStyle;
		this.acessName = acessName;
		Price = price;
	}

	public Acessories() {
		// TODO Auto-generated constructor stub
	}

	public int getAcessID() {
		return acessID;
	}

	public void setAcessID(int acessID) {
		this.acessID = acessID;
	}

	public String getAcessStyle() {
		return acessStyle;
	}

	public void setAcessStyle(String acessStyle) {
		this.acessStyle = acessStyle;
	}

	public String getAcessName() {
		return acessName;
	}

	public void setAcessName(String acessName) {
		this.acessName = acessName;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

}
