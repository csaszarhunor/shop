package hu.codecool.shop;

import java.util.Date;

public class LongLifeMilk extends Milk {

	public LongLifeMilk(long barCode, int quantity, String producer, Date expiration, double fatContent) {
		super(barCode, quantity, producer, expiration, fatContent);
	}

}
