package hu.codecool.shop.product;

import java.util.Date;

import hu.codecool.shop.Milk;

public class LongLifeMilk extends Milk {

	public LongLifeMilk(long barCode, int quantity, String producer, Date expiration, double fatContent) {
		super(barCode, quantity, producer, expiration, fatContent);
	}

}
