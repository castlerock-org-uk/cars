package uk.org.castlerock.cars;

/**
 * Representation of the grid that the cars drive in
 * including various tests to see if positions are on the boundaries of the grid
 * and a test to see if a new position is created outside the grid.
 * positions are immutable so can't move outside the grid once created.
 *
 */
public class Grid {

	private final Integer width;
	private final Integer height;

	public Grid(Integer width, Integer height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Boolean isPositionAtNorthBoundary(Position position) {
		return position.getYCoordinate() == this.height;
	}

	public Boolean isPositionAtEastBoundary(Position position) {
		return position.getXCoordinate() == this.width;
	}

	public Boolean isPositionAtSouthBoundary(Position position) {
		return position.getYCoordinate() == 0;
	}

	public Boolean isPsoitionAtWestBoundary(Position position) {
		return position.getXCoordinate() == 0;
	}

	public Boolean isPositionOnGrid(Position position) {
		return position.getXCoordinate() <= this.width && position.getXCoordinate() >= 0
				&& position.getYCoordinate() >= 0 && position.getYCoordinate() <= height;
	}

}
