package uk.org.castlerock.cars;

import static org.junit.Assert.*;

import org.junit.Test;

public class PositionTest {
	
	@Test
	public void whenAPositionIsCreatedItCanPrintItsCoordinates(){
		Position aPosition = new Position(7,9);
		assertEquals("9,7",aPosition.toString());
	}

}
