package uk.org.castlerock.cars;

public class NotOnGridException extends Exception {

	private static final long serialVersionUID = 5684228303502608814L;

	public NotOnGridException() {
	}

	public NotOnGridException(String message) {
		super(message);
	}


}
