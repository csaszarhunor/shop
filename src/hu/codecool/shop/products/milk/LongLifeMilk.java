package hu.codecool.shop.products.milk;

import java.util.Date;

import hu.codecool.shop.products.Milk;

public class LongLifeMilk extends Milk {

	public LongLifeMilk(long barCode, String producer, Date expiration, double fatContent) {
		super(barCode, producer, expiration, fatContent);
	}

}
