package by.htp.inventory.web.util;

public class ValidateNullParamException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4156052163888103485L;
	

	public ValidateNullParamException() {
		
	}

	public ValidateNullParamException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ValidateNullParamException(String message) {
		super(message);
		
	}

	public ValidateNullParamException(Throwable cause) {
		super(cause);
		
	}

}
