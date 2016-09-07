package hu.codecool.shop;

import java.util.Hashtable;
import java.util.Iterator;

public class Shop {

	private String name;
	private String address;
	private String owner;
	private Hashtable<Long, ShopRegistry> foodBar;
	
	/* !!! ShopRegistry doesn't distinguish foods by their expiration date:
	 * Food items with the same barCode but different expiration date will count as equal,
	 * which is all the same for me, the programmer, but it harms the business logic, 
	 * since expired Milk objects will not differ from consumable Milk objects */
	class ShopRegistry {
		private Food food;
		private long quantity;
		long price;
		
		public ShopRegistry(Food food, long quantity, long price) {
			super();
			this.food = food;
			this.quantity = quantity;
			this.price = price;
		}

		public Food getFood() {
			return food;
		}

		public void setFood(Food food) {
			this.food = food;
		}

		public long getQuantity() {
			return quantity;
		}

		public void setQuantity(long quantity) {
			this.quantity = quantity;
		}
		
		public void incrementQuantity(long quantity) {
			this.quantity += quantity;
		}

		public void decrementQuantity(long quantity) {
			this.quantity -= quantity;
		}

		public long getPrice() {
			return price;
		}

		public void setPrice(long price) {
			this.price = price;
		}
	}
	
	public Shop(String name, String address, String owner, Hashtable<Long, ShopRegistry> foodBar) {
		super();
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.foodBar = foodBar;
	}
	
	public Shop(String name, String address, String owner) {
		super();
		this.name = name;
		this.address = address;
		this.owner = owner;
		foodBar = new Hashtable<>();
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
	
	private boolean hasGivenProduct(Class<? extends Food> o){
		Iterator<ShopRegistry> regs = foodBar.values().iterator();
		while (regs.hasNext()){
			Class<? extends Food> c = regs.next().getFood().getClass();
			if (o.isAssignableFrom(c)){
				return true;
			}
		}
		return false;
	}
	
	public boolean hasMilk(){
		return hasGivenProduct(Milk.class);
	}

	public boolean hasCheese(){
		return hasGivenProduct(Cheese.class);
	}
	
	public void supplyWithFood(Long barCode, long quantity){
		ShopRegistry reg = foodBar.get(barCode);
		reg.incrementQuantity(quantity);
	}
	
	public void supplyWithNewFood(Food f, long quantity, long price){
		ShopRegistry reg = new ShopRegistry(f, quantity, price);
		foodBar.put(f.getBarCode(), reg);
	}
	
	public void removeFood(Long barCode){
		foodBar.remove(barCode);
	}

	public void buyFood(Long barCode, long quantity){
		foodBar.get(barCode).decrementQuantity(quantity);
	}
	
}
