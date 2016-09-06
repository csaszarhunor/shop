package hu.codecool.shop;

import java.util.Date;

public class SemiLongLifeMilk extends Milk {

	public SemiLongLifeMilk(long barCode, int quantity, String producer, Date expiration, double fatContent) {
		super(barCode, quantity, producer, expiration, fatContent);
	}

}
