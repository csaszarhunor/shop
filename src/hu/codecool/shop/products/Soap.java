package hu.codecool.shop.products;

import java.util.Date;

import hu.codecool.shop.Product;

public class Soap extends Product{

	public Soap(Long barCode, String producer, Date expiration) {
		super(barCode, producer, expiration);
	}

}
