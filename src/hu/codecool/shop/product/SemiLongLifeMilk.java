package hu.codecool.shop.product;

import java.util.Date;

import hu.codecool.shop.Milk;

public class SemiLongLifeMilk extends Milk {

	public SemiLongLifeMilk(long barCode, String producer, Date expiration, double fatContent) {
		super(barCode, producer, expiration, fatContent);
	}

}
