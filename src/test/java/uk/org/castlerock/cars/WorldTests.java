package uk.org.castlerock.cars;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class WorldTests {
	
	@Before
	public void createWorld(){
		assertTrue( true );
	}
	
	@Test
	public void whenXCordinateIsMinimumThenWestBoundaryIsTrue(){
		assertTrue( true );
	}
	
	@Test
	public void whenXCordinateIsMaximumThenEastBoundaryIsTrue(){
		assertTrue ( true );
	}

	@Test
	public void whenYCordinateIsMinimumThenSouthBoundaryIsTrue(){
		assertTrue( true );
	}
	
	@Test
	public void whenYCordinateIsMaximumThenNorthBoundaryIsTrue(){
		assertTrue ( true );
	}
	
}
