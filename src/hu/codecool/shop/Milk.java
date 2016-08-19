package hu.codecool.shop;

import java.util.Date;

public class Milk {

	private int capacity;
	private String producer;
	private Date expiration;
	private double fatContent;
	private long price;
	
	public Milk(int capacity, String producer, Date expiration, double fatContent, long price) {
		super();
		this.capacity = capacity;
		this.producer = producer;
		this.expiration = expiration;
		this.fatContent = fatContent;
		this.price = price;
	}
	
	public boolean isConsumable(){
		return expiration.before(new Date());
	}

	public int getCapacity() {
		return capacity;
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

	public long getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Milk [capacity=" + capacity + ", producer=" + producer + ", expiration=" + expiration + ", fatContent="
				+ fatContent + ", price=" + price + "]";
	}
}
