
package exceptions;
/**

The NegativePriceException class represents a custom exception for negative price input.
It extends the Exception class to create a custom exception.
It includes a constructor that takes a message parameter to describe the exception.
*/
public class NegativePriceException extends NumberFormatException{

	private static final long serialVersionUID = 1L;

	public NegativePriceException() {
		super();
	}
	public NegativePriceException(String message) {
        super(message);
	}

}