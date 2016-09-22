package hu.codecool.shop;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import hu.codecool.shop.product.LongLifeMilk;

public class ShopHasMilkTest {

	@Test
	public void testEntryWithQuantityReturnsTrue() {
		Shop shop = new Shop("Dairy Shop", "Polymorphism Av. 0", "Hunor");
		Food milk1 = new LongLifeMilk(1l, "Doe", new Date(), 1.5);
		shop.supplyWithNewFood(milk1, 2l, 4l);
		assertTrue(shop.hasMilk());
	}
	
	@Test
	public void testEntryWithZeroQuantityReturnsFalse() {
		Shop shop = new Shop("Dairy Shop", "Polymorphism Av. 0", "Hunor");
		Food milk1 = new LongLifeMilk(1l, "Doe", new Date(), 1.5);
		shop.supplyWithNewFood(milk1, 0l, 4l);
		assertFalse(shop.hasMilk());
	}
	
	@Test
	public void testNoEntryReturnsFalse() {
		Shop shop = new Shop("Dairy Shop", "Polymorphism Av. 0", "Hunor");
		assertFalse(shop.hasMilk());
	}

}
