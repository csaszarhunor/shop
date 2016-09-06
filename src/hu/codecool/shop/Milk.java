package hu.codecool.shop;

import java.util.Date;

public class Milk {

	final int LITER = 1000;
	final int HALFLITER = 500;
	final int GLASS = 250;
	final double FAT = 2.8;
	final double SEMISKIMMED = 1.5;
	protected long barCode;
	protected int quantity;
	protected String producer;
	protected Date expiration;
	protected double fatContent;
	
	public Milk(long barCode, int capacity, String producer, Date expiration, double fatContent) {
		this.barCode = barCode;
		this.quantity = capacity;
		this.producer = producer;
		this.expiration = expiration;
		this.fatContent = fatContent;
	}
	
	public long getBarCode() {
		return barCode;
	}

	public boolean isConsumable(){
		return expiration.before(new Date());
	}

	public int getQuantity() {
		return quantity;
	}

	public String getProducer() {
		return producer;
	}

	public Date getExpiration() {
		return expiration;
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
