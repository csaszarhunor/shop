package hu.codecool.shop;

import java.util.Hashtable;

public class Shop {

	private String name;
	private String address;
	private String owner;
	private Hashtable<Long, Milk> milkBar;
	
	public Shop(String name, String address, String owner, Hashtable<Long, Milk> milkBar) {
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
		Long barCode = generateBarCode();
		milkBar.put(barCode, m);
	}
	
	private long generateBarCode(){
		long result = 0;
		if (milkBar.size() > 0){
			for (Long barCode : milkBar.keySet()) {
				result = (barCode > result) ? barCode : result;
			}
			result++;
		}
		return result;
	}
}
