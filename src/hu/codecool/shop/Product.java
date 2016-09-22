package hu.codecool.shop;

import java.util.Date;

public abstract class Product {

	protected Long barCode;
	protected String producer;
	protected Date expiration;
	
	public Product(Long barCode, String producer, Date expiration) {
		this.barCode = barCode;
		this.producer = producer;
		this.expiration = expiration;
	}
	
	public long getBarCode() {
		return barCode;
	}

	public boolean isUnExpired(){
		return expiration.before(new Date());
	}
	
	public String getProducer() {
		return producer;
	}

	public Date getExpiration() {
		return expiration;
	}

	@Override
	public String toString() {
		return "Product [barCode=" + barCode + ", producer=" + producer + ", expiration=" + expiration + "]";
	}
}
