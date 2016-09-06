package hu.codecool.shop;

import java.util.Date;

public abstract class Milk extends Food {

	final int LITER = 1000;
	final int HALFLITER = 500;
	final int GLASS = 250;
	final double FAT = 2.8;
	final double SEMISKIMMED = 1.5;
	protected int quantity;
	protected double fatContent;
	
	public Milk(long barCode, int quantity, String producer, Date expiration, double fatContent) {
		super(barCode, producer, expiration);
		this.quantity = quantity;
		this.fatContent = fatContent;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getFatContent() {
		return fatContent;
	}

	@Override
	public String toString() {
		return "Milk [quantity=" + quantity + ", producer=" + producer + ", expiration=" + expiration + ", fatContent="
				+ fatContent + "]";
	}
}
