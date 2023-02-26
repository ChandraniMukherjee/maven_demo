package food.dimpi.model;

import java.util.UUID;

//POJO
public class Item {

	// Universally Unique Identifier
	/*
	 * Java UUID Class
	 * 
	 * A UUID is a class that represents an immutable Universally Unique Identifier
	 * (UUID). A UUID represents a 128-bit long value that is unique to all
	 * practical purpose. It is used to identify information in the computer system.
	 * The UUID class belongs to java.util package. The UUID class implements
	 * Serializable and Comparable interface and extends Object class. There exist
	 * many variants of these global identifiers. The methods of the UUID class are
	 * for manipulating the Leach-Salz variant.
	 * 
	 * It is used to create the following:
	 * 
	 * Session ID for web application Transaction ID Random file name The primary
	 * key for database table
	 */

	private UUID id;
	private String itemname;
	private double price;

	public Item(UUID id, String itemname, double price) {
		this.id = id;
		this.itemname = itemname;
		this.price = price;
	}

	public Item(UUID id, String itemname) {
		this.id = id;
		this.itemname = itemname;
	}

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemname=" + itemname + ", price=" + price + "]";
	}

}
