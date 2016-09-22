package hu.codecool.shop;

import java.util.Hashtable;
import java.util.Iterator;

import hu.codecool.shop.exceptions.NonExistingProductException;
import hu.codecool.shop.exceptions.TooMuchDecrementException;
import hu.codecool.shop.products.Cheese;
import hu.codecool.shop.products.Food;
import hu.codecool.shop.products.Milk;

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

		public void decrementQuantity(long quantity) throws TooMuchDecrementException {
			if (this.quantity < quantity){
				throw new TooMuchDecrementException("Not enough quantity to decrement");
			}
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
			ShopRegistry reg = regs.next();
			Class<? extends Food> c = reg.getFood().getClass();
			long quantity = reg.getQuantity();
			if (o.isAssignableFrom(c) && quantity > 0l){
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
	
	public void supplyWithFood(Long barCode, long quantity) throws NonExistingProductException{
		if (!foodBar.containsKey(barCode)) {
			throw new NonExistingProductException("No shop registry found with this barcode");
		}
		ShopRegistry reg = foodBar.get(barCode);
		reg.incrementQuantity(quantity);
	}
	
	public void supplyWithNewFood(Food f, long quantity, long price){
		ShopRegistry reg = new ShopRegistry(f, quantity, price);
		foodBar.put(f.getBarCode(), reg);
	}
	
	public void removeFood(Long barCode) throws NonExistingProductException {
		if (!foodBar.containsKey(barCode)) {
			throw new NonExistingProductException("No shop registry found with this barcode");
		}
		foodBar.remove(barCode);
	}

	public void buyFood(Long barCode, long quantity) throws ShopException {
		if (!foodBar.containsKey(barCode)) {
			throw new NonExistingProductException("No shop registry found with this barcode");
		}
		foodBar.get(barCode).decrementQuantity(quantity);
	}
	
}
