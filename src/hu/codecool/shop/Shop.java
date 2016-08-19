package hu.codecool.shop;

public class Shop {

	private String name;
	private String address;
	private String owner;
	private Milk[] milkBar;
	private int flag;
	
	public Shop(String name, String address, String owner, Milk[] milkBar) {
		super();
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.milkBar = milkBar;
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
		return milkBar.length < 0;
	}
	
	public Milk buyMilk(Milk m){
		Milk result = null;
		for (int i=0; i<milkBar.length; i++)
	    {
	        if (milkBar[i] != null && milkBar[i].equals(m)) {
	        	result = milkBar[i];
	        	milkBar[i] = null;
	        }
	    }

	    return result;
	}
}
