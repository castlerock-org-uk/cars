package uk.org.castlerock.cars;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

	Grid grid;

	@Before
	public void createGrid() {
		grid = new Grid(15, 15);
	}

	@Test(expected = NotOnGridException.class)
	public void whenNewCarIsCreatedOutsideTheBoundariesOfTheGridThenAnExceptionIsThrown()
			throws NotOnGridException {
		Position position = new Position(20, 20);
		@SuppressWarnings("unused")
		Car car = new Car(grid, position, Direction.N);
	}

	@Test(expected = NotOnGridException.class)
	public void whenNewCarIsCreatedOutsideTheNorthOfTheGridThenAnExceptionIsThrown() throws NotOnGridException {
		Position position = new Position(5, 20);
		@SuppressWarnings("unused")
		Car car = new Car(grid, position, Direction.N);
	}

	@Test(expected = NotOnGridException.class)
	public void whenNewCarIsCreatedOutsideTheEastOfTheGridThenAnExceptionIsThrown() throws NotOnGridException {
		Position position = new Position(20, 5);
		@SuppressWarnings("unused")
		Car car = new Car(grid, position, Direction.N);
	}

	@Test(expected = NotOnGridException.class)
	public void whenNewCarIsCreatedOutsideTheSouthOfTheGridThenAnExceptionIsThrown() throws NotOnGridException {
		Position position = new Position(20, -1);
		@SuppressWarnings("unused")
		Car car = new Car(grid, position, Direction.N);
	}

	@Test(expected = NotOnGridException.class)
	public void whenNewCarIsCreatedOutsideTheWestOfTheGridThenAnExceptionIsThrown() throws NotOnGridException {
		Position position = new Position(-1, 20);
		@SuppressWarnings("unused")
		Car car = new Car(grid, position, Direction.N);
	}

	@Test
	public void whenCarIsFacingNorthAndReceivesCommandToTurnRightThenItWillBeFacingEast() throws NotOnGridException {
		Position position = new Position(5, 5);
		Car car = new Car(grid, position, Direction.N);
		car.turn(TurnCommand.R);
		assertThat(car.getDirection(), is(Direction.E));
	}

	@Test
	public void whenCarIsFacingNorthAndReceivesCommandToTurnLeftThenItWillBeFacingWest() throws NotOnGridException {
		Position position = new Position(5, 5);
		Car car = new Car(grid, position, Direction.N);
		car.turn(TurnCommand.L);
		assertThat(car.getDirection(), is(Direction.W));
	}

	@Test
	public void whenCarMovesForwardNorthThenYCoordinateIncreasesByOne() throws NotOnGridException {
		Position position = new Position(5, 5);
		Car car = new Car(grid, position, Direction.N);
		car.forward();
		assertEquals("6,5", car.getPosition().toString());
	}

	@Test
	public void whenCarMovesForwardEastThenXCoordinateIncreasesByOne() throws NotOnGridException {
		Position position = new Position(5, 5);
		Car car = new Car(grid, position, Direction.E);
		car.forward();
		assertEquals("5,6", car.getPosition().toString());
	}

	@Test
	public void whenCarMovesForwardSouthThenYCoordinateDecreasesByOne() throws NotOnGridException {
		Position position = new Position(5, 5);
		Car car = new Car(grid, position, Direction.S);
		car.forward();
		assertEquals("4,5", car.getPosition().toString());
	}

	@Test
	public void whenCarMovesForwardWestThenXCoordinateDecreasesByOne() throws NotOnGridException {
		Position position = new Position(5, 5);
		Car car = new Car(grid, position, Direction.W);
		car.forward();
		assertEquals("5,4", car.getPosition().toString());
	}

	@Test
	public void whenCarHitsTheNorthEdgeOfTheGridThenItGoesNoFurther() throws NotOnGridException {
		Position position = new Position(5, 14);
		Car car = new Car(grid, position, Direction.N);
		car.forward();
		car.forward();
		car.forward();
		assertEquals("15,5", car.getPosition().toString());
	}

	@Test
	public void whenCarHitsTheEastEdgeOfTheGridThenItGoesNoFurhter() throws NotOnGridException {
		Position position = new Position(14, 5);
		Car car = new Car(grid, position, Direction.E);
		car.forward();
		car.forward();
		car.forward();
		assertEquals("5,15", car.getPosition().toString());
	}

	@Test
	public void whenCarHitsTheSouthEdgeOfTheGridThenItGoesNoFurhter() throws NotOnGridException {
		Position position = new Position(5, 1);
		Car car = new Car(grid, position, Direction.S);
		car.forward();
		car.forward();
		car.forward();
		assertEquals("0,5", car.getPosition().toString());
	}

	@Test
	public void whenCarHitsTheWestEdgeOfTheGridItGoesNoFurther() throws NotOnGridException {
		Position position = new Position(1, 5);
		Car car = new Car(grid, position, Direction.W);
		car.forward();
		car.forward();
		car.forward();
		assertEquals("5,0", car.getPosition().toString());
	}

}
