package hu.codecool.shop;

import java.util.Date;

import hu.codecool.shop.products.Milk;
import hu.codecool.shop.products.milk.LongLifeMilk;
import hu.codecool.shop.products.milk.SemiLongLifeMilk;

public class MilkFactory {

	public Milk getMilk (String milkType, long barCode, String producer, Date expiration, double fatContent){
		if (milkType.equalsIgnoreCase("LONG LIFE")){
			return new LongLifeMilk(barCode, producer, expiration, fatContent);
		}
		else if (milkType.equalsIgnoreCase("SEMI LONG LIFE")){
			return new SemiLongLifeMilk(barCode, producer, expiration, fatContent);
		}
		return null;
	}
}
