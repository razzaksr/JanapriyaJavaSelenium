package core.javanapriiya.JanaPriyaJava.oop;

public class KartItem 
{
	private String item, brand;
	private Integer cost, quantity;
	
	public void setItem(String item)
	{
		this.item=item;
	}
	public String getItem()
	{
		return item;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public KartItem() {
		//super();
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor invoked");
	}
	public KartItem(String item, String brand, Integer cost, Integer quantity) {
		//super();
		System.out.println("Parameterized constructor invoked");
		this.item = item;
		this.brand = brand;
		this.cost = cost;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "KartItem [item=" + item + ", brand=" + brand + ", cost=" + cost + ", quantity=" + quantity + "]";
	}
	
	/*
	 * public KartItem() { System.out.println("Default constructor invoked"); }
	 * 
	 * public KartItem(String item,String brand,Integer cost, Integer quantity) {
	 * System.out.println("Parameterized constructor invoked");
	 * this.item=item;this.brand=brand;this.cost=cost;this.quantity=quantity; }
	 */
	
}
