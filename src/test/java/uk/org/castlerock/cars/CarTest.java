package uk.org.castlerock.cars;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

	World world;

	@Before
	public void createWorld() {
		world = new World(15, 15);
	}

	@Test(expected = NotInWorldException.class)
	public void whenNewCarIsCreatedOutsideTheBoundariesOfTheKnownWorldThenAnExceptionIsThrown()
			throws NotInWorldException {
		Position position = new Position(20, 20);
		@SuppressWarnings("unused")
		Car car = new Car(world, position, Direction.N);
	}

	@Test(expected = NotInWorldException.class)
	public void whenNewCarIsCreatedOutsideTheNorthOfTheKnownWorldThenAnExceptionIsThrown() throws NotInWorldException {
		Position position = new Position(5, 20);
		@SuppressWarnings("unused")
		Car car = new Car(world, position, Direction.N);
	}

	@Test(expected = NotInWorldException.class)
	public void whenNewCarIsCreatedOutsideTheEastOfTheKnownWorldThenAnExceptionIsThrown() throws NotInWorldException {
		Position position = new Position(20, 5);
		@SuppressWarnings("unused")
		Car car = new Car(world, position, Direction.N);
	}

	@Test(expected = NotInWorldException.class)
	public void whenNewCarIsCreatedOutsideTheSouthOfTheKnownWorldThenAnExceptionIsThrown() throws NotInWorldException {
		Position position = new Position(20, -1);
		@SuppressWarnings("unused")
		Car car = new Car(world, position, Direction.N);
	}

	@Test(expected = NotInWorldException.class)
	public void whenNewCarIsCreatedOutsideTheWestOfTheKnownWorldThenAnExceptionIsThrown() throws NotInWorldException {
		Position position = new Position(-1, 20);
		@SuppressWarnings("unused")
		Car car = new Car(world, position, Direction.N);
	}

	@Test
	public void whenCarIsFacingNorthAndReceivesCommandToTurnRightThenItWillBeFacingEast() throws NotInWorldException {
		Position position = new Position(5, 5);
		Car car = new Car(world, position, Direction.N);
		car.turn(TurnCommand.R);
		assertThat(car.getDirection(), is(Direction.E));
	}

	@Test
	public void whenCarIsFacingNorthAndReceivesCommandToTurnLeftThenItWillBeFacingWest() throws NotInWorldException {
		Position position = new Position(5, 5);
		Car car = new Car(world, position, Direction.N);
		car.turn(TurnCommand.L);
		assertThat(car.getDirection(), is(Direction.W));
	}

	@Test
	public void whenCarMovesForwardNorthThenYCoordinateIncreasesByOne() throws NotInWorldException {
		Position position = new Position(5, 5);
		Car car = new Car(world, position, Direction.N);
		car.forward();
		assertEquals("(5,6)", car.getPosition().toString());
	}

	@Test
	public void whenCarMovesForwardEastThenXCoordinateIncreasesByOne() throws NotInWorldException {
		Position position = new Position(5, 5);
		Car car = new Car(world, position, Direction.E);
		car.forward();
		assertEquals("(6,5)", car.getPosition().toString());
	}

	@Test
	public void whenCarMovesForwardSouthThenYCoordinateDecreasesByOne() throws NotInWorldException {
		Position position = new Position(5, 5);
		Car car = new Car(world, position, Direction.S);
		car.forward();
		assertEquals("(5,4)", car.getPosition().toString());
	}

	@Test
	public void whenCarMovesForwardWestThenXCoordinateDecreasesByOne() throws NotInWorldException {
		Position position = new Position(5, 5);
		Car car = new Car(world, position, Direction.W);
		car.forward();
		assertEquals("(4,5)", car.getPosition().toString());
	}

	@Test
	public void whenCarHitsTheNorthEdgeOfTheWorldThenItGoesNoFurther() throws NotInWorldException {
		Position position = new Position(5, 14);
		Car car = new Car(world, position, Direction.N);
		car.forward();
		car.forward();
		car.forward();
		assertEquals("(5,15)", car.getPosition().toString());
	}

	@Test
	public void whenCarHitsTheEastEdgeOfTheWorldThenItGoesNoFurhter() throws NotInWorldException {
		Position position = new Position(14, 5);
		Car car = new Car(world, position, Direction.E);
		car.forward();
		car.forward();
		car.forward();
		assertEquals("(15,5)", car.getPosition().toString());
	}

	@Test
	public void whenCarHitsTheSouthEdgeOfTheWorldThenItGoesNoFurhter() throws NotInWorldException {
		Position position = new Position(5, 1);
		Car car = new Car(world, position, Direction.S);
		car.forward();
		car.forward();
		car.forward();
		assertEquals("(5,0)", car.getPosition().toString());
	}

	@Test
	public void whenCarHitsTheWestEdgeOfTheWorldItGoesNoFurther() throws NotInWorldException {
		Position position = new Position(1, 5);
		Car car = new Car(world, position, Direction.W);
		car.forward();
		car.forward();
		car.forward();
		assertEquals("(0,5)", car.getPosition().toString());
	}

}
