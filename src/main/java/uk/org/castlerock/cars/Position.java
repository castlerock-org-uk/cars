package uk.org.castlerock.cars;


public class Position {
	
	private final int xCoordinate;
	private final int yCoordinate;

	public Position(int x, int y) {
		this.xCoordinate = x;
		this.yCoordinate = y;
	}

	public int getXCoordinate() {
		return xCoordinate;
	}

	public int getYCoordinate() {
		return yCoordinate;
	}

	@Override
	public String toString() {
		return "(" + xCoordinate + "," + yCoordinate + ")";
	}
	
	

}
