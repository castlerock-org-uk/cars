package uk.org.castlerock.cars;

/**
 * Represents direction as cardinal points, 
 * including two methods {@link #next() next} to move clockwise
 * around the compass and {@link #previous()} to move
 * anticlockwise.
 *
 */
public enum Direction {
	
	N,E,S,W;
	
	public Direction next(){
		return values()[(ordinal() + 1) % values().length];
	}

	public Direction previous() {
		if(ordinal() == 0){
			return values()[values().length - 1];
		} else {
			return values()[ordinal() - 1];
		}
	}
}
