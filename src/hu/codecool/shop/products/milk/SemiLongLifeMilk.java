package hu.codecool.shop.products.milk;

import java.util.Date;

import hu.codecool.shop.products.Milk;

public class SemiLongLifeMilk extends Milk {

	public SemiLongLifeMilk(long barCode, String producer, Date expiration, double fatContent) {
		super(barCode, producer, expiration, fatContent);
	}

}
