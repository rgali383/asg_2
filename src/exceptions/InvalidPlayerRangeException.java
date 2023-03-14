package exceptions;
/**

The InvalidPlayerRangeException class represents a custom exception for invalid player range input.
It extends the Exception class to create a custom exception.
It includes a constructor that takes a message parameter to describe the exception.
*/


public class InvalidPlayerRangeException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public InvalidPlayerRangeException() {
		super();
	}
	public InvalidPlayerRangeException(String message) {
        super(message);
    }
}