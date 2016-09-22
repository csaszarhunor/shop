package hu.codecool.shop.exceptions;

import hu.codecool.shop.ShopException;

public class NonExistingProductException extends ShopException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NonExistingProductException(String message) {
		super(message);
	}
}
