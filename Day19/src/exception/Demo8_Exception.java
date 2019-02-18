package exception;

public class Demo8_Exception {

}
class AgeOutofBounceException extends Exception{

	/**
	 * 
	 */
	public AgeOutofBounceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public AgeOutofBounceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AgeOutofBounceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public AgeOutofBounceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public AgeOutofBounceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}