package hu.codecool.shop.exceptions;

public class TooMuchDecrementException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9217439820437691524L;

	public TooMuchDecrementException(String message){
		super(message);
	}
}
