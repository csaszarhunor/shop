package hu.codecool.shop.exceptions;

import hu.codecool.shop.ShopException;

public class TooMuchDecrementException extends ShopException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9217439820437691524L;

	public TooMuchDecrementException(String message){
		super(message);
	}
}
