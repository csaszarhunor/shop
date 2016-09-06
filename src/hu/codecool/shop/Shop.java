package hu.codecool.shop;

import java.util.Hashtable;

public class Shop {

	private String name;
	private String address;
	private String owner;
	private Hashtable<ShopRegistry, Milk> milkBar;
	
	class ShopRegistry {
		private Milk milk;
		private int quantity;
		int price;
		
		public ShopRegistry(Milk milk, int capacity, int price) {
			super();
			this.milk = milk;
			this.quantity = capacity;
			this.price = price;
		}

		public Milk getMilk() {
			return milk;
		}

		public void setMilk(Milk milk) {
			this.milk = milk;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		public void incrementQuantity(int quantity) {
			this.quantity += quantity;
		}

		public void decrementQuantity(int quantity) {
			this.quantity -= quantity;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
	}
	
	public Shop(String name, String address, String owner, Hashtable<ShopRegistry, Milk> milkBar) {
		super();
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.milkBar = milkBar;
	}
	
	public Shop(String name, String address, String owner) {
		super();
		this.name = name;
		this.address = address;
		this.owner = owner;
		milkBar = new Hashtable<>();
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getOwner() {
		return owner;
	}
	
	public boolean hasMilk(){
		return milkBar.size() > 0;
	}
	
	public Milk buyMilk(long barCode){
		if (milkBar.contains(barCode)){
			Milk result = milkBar.get(barCode);
			milkBar.remove(barCode);
			return result;
		}

	    return null;
	}
	
	public void supplyWithMilk(Milk m){
		ShopRegistry reg = new ShopRegistry(m, m.getQuantity(), 0);
		milkBar.put(reg, m);
	}
}
