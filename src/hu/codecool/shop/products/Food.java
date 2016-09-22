package hu.codecool.shop.products;

import java.util.Date;

import hu.codecool.shop.Product;

public abstract class Food extends Product {

	public Food(Long barCode, String producer, Date expiration) {
		super(barCode, producer, expiration);
	}

	@Override
	public String toString() {
		return "Food [barCode=" + barCode + ", producer=" + producer + ", expiration=" + expiration + "]";
	}
}
