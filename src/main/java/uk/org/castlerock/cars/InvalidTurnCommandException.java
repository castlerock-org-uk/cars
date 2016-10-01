package uk.org.castlerock.cars;

public class InvalidTurnCommandException extends Exception {

	private static final long serialVersionUID = 2422817874648223303L;

	public InvalidTurnCommandException() {
	}

	public InvalidTurnCommandException(String message) {
		super(message);
	}

}
