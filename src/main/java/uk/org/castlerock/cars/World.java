package uk.org.castlerock.cars;

/**
 * @author scottchamberlain 
 * Representation of the world that the cars drive in
 * including various tests so the car can ask if it's hit the edge
 * or has materialised outside the world.
 *
 */
public class World {

	private final Integer width;
	private final Integer height;

	public World(Integer width, Integer height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Boolean hitNorthBoundary(Position position) {
		return position.getYCoordinate() == this.height;
	}

	public Boolean hitEastBoundary(Position position) {
		return position.getXCoordinate() == this.width;
	}

	public Boolean hitSouthBoundary(Position position) {
		return position.getYCoordinate() == 0;
	}

	public Boolean hitWestBoundary(Position position) {
		return position.getXCoordinate() == 0;
	}

	public Boolean inWorld(Position position) {
		return position.getXCoordinate() <= this.width && position.getXCoordinate() >= 0
				&& position.getYCoordinate() >= 0 && position.getYCoordinate() <= height;
	}

}
