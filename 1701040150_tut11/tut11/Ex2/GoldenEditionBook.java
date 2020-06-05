package tut11.Ex2;

public class GoldenEditionBook extends Book{

	public GoldenEditionBook() {
		// TODO Auto-generated constructor stub
	}
	
	public GoldenEditionBook(String title, String author, double price){
        super(title,author,price);
        this.setPrice(price);
    }
	
    @Override
    public double getPrice(){
        return super.getPrice() + super.getPrice()*0.3;
    }
    
    @Override
    public void setPrice(double price) {
    	this.price = price + price*0.3;
    }

	@Override
	public String toString() {
		return "GoldenEditionBook: \n" 
				+ "Title: " + title + "\n"
				+ "Author: " + author +"\n" 
				+ "Price: " + price + "\n";
	}
    
}
