package uk.org.castlerock.cars;

/*
 * Utility class with a static method that can be used to test the functionality of a car.
 * It should be passed commands in the format "X,Y:CCCCCCC" where X and Y
 * are the starting coordinates of the car and C are the commands that are 
 * transmitted to the car, they can be L to turn the car Left, R to turn the 
 * car Right and F to move the car forward. When the car turns it doesn't move
 * it just rotates like a tank. The list of commands can be any length.
 * 
 * It returns the car's new position as a string or an error message.
 * 
 */

public class TestUtils {

	public static String driveCar(String instructions){
		if(!instructions.matches("\\d,\\d:[R,L,F]+$")){
			return "Your input string looks to be in the wrong format";
		} else {
			String[] coordinates = instructions.split(":")[0].split(",");
			String commands = instructions.split(":")[1];
			Position startingPosition = new Position(Integer.parseInt(coordinates[0]),Integer.parseInt(coordinates[1]));
			Grid grid = new Grid(15,15);
			try {
				Car testCar = new Car(grid, startingPosition, Direction.N);
				commands.chars().mapToObj(c->(char)c).forEach(c->{
					if (c.equals('F')) testCar.forward();
					else testCar.turn(TurnCommand.valueOf(String.valueOf(c)));
				});
				return testCar.getPosition().toString();
			} catch (NotOnGridException e) {
				return "For this test your car's starting position must be within a 15 x 15 area";
			}
		}
	}
}
