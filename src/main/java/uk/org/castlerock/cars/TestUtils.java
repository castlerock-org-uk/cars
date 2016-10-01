package uk.org.castlerock.cars;

public class TestUtils {

	public static String driveCar(String instructions){
		
		String[] coordinates = instructions.split(":")[0].split(",");
		String commands = instructions.split(":")[1];
		Position startingPosition = new Position(Integer.parseInt(coordinates[0]),Integer.parseInt(coordinates[1]));
		World world = new World(15,15);
		try {
			Car testCar = new Car(world, startingPosition, Direction.N);
			commands.chars().mapToObj(c->(char)c).forEach(c->{
				if (c.equals('F')) testCar.forward();
				else testCar.turn(TurnCommand.valueOf(String.valueOf(c)));
			});
			return testCar.getPosition().toString();
		} catch (NotInWorldException e) {
			return "For this test your car's starting position must be within a 15 x 15 area";
		}
	}
}
