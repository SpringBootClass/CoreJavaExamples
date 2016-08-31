package com.corejava.examples.collections.exception;

/**
 * Exception class for duplicate item errors in search tree insertions.
 * 
 * 
 */
public class DuplicateItemException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Construct this exception object.
	 */
	public DuplicateItemException() {
		super();
	}

	/**
	 * Construct this exception object.
	 * 
	 * @param message
	 *            the error message.
	 */
	public DuplicateItemException(String message) {
		super(message);
	}
}