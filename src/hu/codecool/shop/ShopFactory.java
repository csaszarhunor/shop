package hu.codecool.shop;

import java.util.Date;

import hu.codecool.shop.products.Cheese;
import hu.codecool.shop.products.Milk;
import hu.codecool.shop.products.Soap;
import hu.codecool.shop.products.milk.LongLifeMilk;
import hu.codecool.shop.products.milk.SemiLongLifeMilk;

public class ShopFactory {

	public Milk getMilk (String milkType, long barCode, String producer, Date expiration, double fatContent){
		if (milkType.equalsIgnoreCase("LONG LIFE")){
			return new LongLifeMilk(barCode, producer, expiration, fatContent);
		}
		else if (milkType.equalsIgnoreCase("SEMI LONG LIFE")){
			return new SemiLongLifeMilk(barCode, producer, expiration, fatContent);
		}
		return null;
	}
	
	public Milk getLongLifeMilk(long barCode, String producer, Date expiration, double fatContent){
		return new LongLifeMilk(barCode, producer, expiration, fatContent);
	}
	
	public Milk getSemiLongLifeMilk(long barCode, String producer, Date expiration, double fatContent){
		return new LongLifeMilk(barCode, producer, expiration, fatContent);
	}

	public Milk getSemiSkimmedLongLifeMilk(long barCode, String producer, Date expiration){
		return new LongLifeMilk(barCode, producer, expiration, Milk.SEMISKIMMED);
	}

	public Milk getFatLongLifeMilk(long barCode, String producer, Date expiration){
		return new LongLifeMilk(barCode, producer, expiration, Milk.FAT);
	}

	public Milk getSemiSkimmedSemiLongLifeMilk(long barCode, String producer, Date expiration){
		return new SemiLongLifeMilk(barCode, producer, expiration, Milk.SEMISKIMMED);
	}

	public Milk getFatSemiLongLifeMilk(long barCode, String producer, Date expiration){
		return new SemiLongLifeMilk(barCode, producer, expiration, Milk.FAT);
	}
	
	public Cheese getCheese(long barCode, String producer, Date expiration){
		return new Cheese(barCode, producer, expiration);
	}

	public Soap getSoap(long barCode, String producer, Date expiration){
		return new Soap(barCode, producer, expiration);
	}
}
