package uk.org.castlerock.cars;


/**
 * @author scottchamberlain
 * Class to model a car that drives in the {@link uk.org.castlerock.cars.World}
 * The Car has a {@link uk.org.castlerock.cars.Position} and a {@link uk.org.castlerock.cars.Direction}
 * It has a method turn() to make it turn either left or right, it turns on the spot so is probably a tracked vehicle.
 * It has a method forward() to make it move forward in the direction it is facing.
 * The car cannot move outside the boundaries of the world but it doesn't explode or drift into space when it gets to
 * the edge of the world, it just won't go any further.
 * 
 */
public class Car {
	
	private Position position;
	private Direction direction;
	private World world;
	
	public Car(World world, Position position, Direction direction) throws NotInWorldException {
		if(!world.inWorld(position)){
			throw new NotInWorldException();
		} else {
			this.position = position;
			this.direction = direction;
			this.world = world;
		}
	}
	
	public void turn(TurnCommand command){
		if(command == TurnCommand.R){
			this.direction = this.direction.next();
		} else if(command == TurnCommand.L){
			this.direction = this.direction.previous();
		}
	}
	
	public void forward(){
		
		if(this.direction == Direction.N){
			if(!world.hitNorthBoundary(this.position)){
				Position newPosition = new Position(this.position.getXCoordinate(),this.position.getYCoordinate()+1);
				this.position = newPosition;
			}
		}
		
		if(this.direction == Direction.E){
			if(!world.hitEastBoundary(this.position)){
				Position newPosition = new Position(this.position.getXCoordinate()+1,this.position.getYCoordinate());
				this.position = newPosition;
			}
		}
		
		if(this.direction == Direction.S){
			if(!world.hitSouthBoundary(this.position)){
				Position newPosition = new Position(this.position.getXCoordinate(),this.position.getYCoordinate()-1);
				this.position = newPosition;
			}
		}
		
		if(this.direction == Direction.W){
			if(!world.hitWestBoundary(this.position)){
				Position newPosition = new Position(this.position.getXCoordinate()-1,this.position.getYCoordinate());
				this.position = newPosition;
			}
		}
	}

	public Position getPosition() {
		return position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	
	
	

}
