package hu.codecool.shop;

import java.util.Vector;

public class Shop {

	private String name;
	private String address;
	private String owner;
	private Vector<Milk> milkBar;
	private int flag;
	
	public Shop(String name, String address, String owner, Vector<Milk> milkBar) {
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
		return milkBar.size() < 0;
	}
	
	public Milk buyMilk(Milk m){
		if (milkBar.contains(m)){
			Milk result = milkBar.elementAt(milkBar.indexOf(m));
			milkBar.remove(m);
			return result;
		}

	    return null;
	}
	
	public void supplyWithMilk(Milk m){
		milkBar.addElement(m);
	}
}
