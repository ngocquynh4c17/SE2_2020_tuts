package demo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Shirt {
	protected int ID;
	protected String Name;
	protected String Price;
	
	public Shirt(int iD, String name, String price) {
		super();
		ID = iD;
		Name = name;
		Price = price;
	}

	public Shirt() {
		
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		this.Price = price;
	}
	
	
	
}
