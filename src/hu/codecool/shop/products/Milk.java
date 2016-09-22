package hu.codecool.shop.products;

import java.util.Date;

public abstract class Milk extends Food {

	public static final int LITER = 1000;
	public static final int HALFLITER = 500;
	public static final int GLASS = 250;
	public static final double FAT = 2.8;
	public static final double SEMISKIMMED = 1.5;
	protected double fatContent;
	
	public Milk(long barCode, String producer, Date expiration, double fatContent) {
		super(barCode, producer, expiration);
		this.fatContent = fatContent;
	}

	public double getFatContent() {
		return fatContent;
	}

	@Override
	public String toString() {
		return "Milk [producer=" + producer + ", expiration=" + expiration + ", fatContent="
				+ fatContent + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)){
			Milk otherMilk = (Milk) obj;
			return otherMilk.getFatContent() == this.fatContent;
		}
		return false;
	}
}
