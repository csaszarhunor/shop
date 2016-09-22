package hu.codecool.shop.exceptions;

public class NonExistingProductException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NonExistingProductException(String message) {
		super(message);
	}
}
