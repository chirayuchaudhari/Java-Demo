package Project;

import java.io.Serializable;

import java.util.Objects;

public class Item implements Comparable<Item>, Serializable 
{
	private int id;
	private String name;
	private float price;
	private String catagory;

	public Item() {
		super();
	}
	public Item(int id, String name, float price, String catagory) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.catagory = catagory;
	}

	void food5()
	{
		if(catagory==catagory)
			price =price + ( price * 5 /100);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(catagory, other.catagory) && id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}
	@Override
	public String toString() {
		return "Iteam [id=" + id + ", name=" + name + ", price=" + price + ", catagory=" + catagory + "]";
	}
	@Override
	public int compareTo(Item o) {
		return new Integer(this.id).compareTo(o.id);
	}


}