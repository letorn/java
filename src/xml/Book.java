package xml;

public class Book {

	private String name;
	private String author;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Book[name: " + name + ", author: " + author + ", price: " + price + "]";
	}

}
