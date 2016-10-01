package uk.org.castlerock.cars;


import static org.junit.Assert.*;

import org.junit.Test;

public class CarTests {
	
	@Test
	public void wheMoreThanOneCharacterIsSentThenAnExceptionIsThrown() {
		
	}
	
	@Test
	public void whenAnInvalidMovementCommandIsSentThenAnExceptionIsThrown(){
		
	}
	
	@Test
	public void whenCarHitsTheNorthEdgeOfTheWorldThenItGoesNoFurther() {
		assertTrue( true );
	}
	
	@Test
	public void whenCarHitsTheSouthEdgeOfTheWorldThenItGoesNoFurhter() {
	
		assertTrue( true );
	}
	
	@Test
	public void whenCarHitsTheEastEdgeOfTheWorldThenItGoesNoFurhter() {
		
		assertTrue( true );
	}
	
	@Test
	public void whenCarHitsTheWestEdgeOfTheWorldItGoesNoFurther() {
		
		assertTrue( true );
	}

}
