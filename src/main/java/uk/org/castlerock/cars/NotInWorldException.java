package uk.org.castlerock.cars;

public class NotInWorldException extends Exception {

	private static final long serialVersionUID = 5684228303502608814L;

	public NotInWorldException() {
	}

	public NotInWorldException(String message) {
		super(message);
	}


}
