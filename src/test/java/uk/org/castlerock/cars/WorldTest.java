package uk.org.castlerock.cars;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WorldTest {
	
	World world;
	
	@Before
	public void createWorld(){
		world = new World(15,15);
	}
	
	@Test
	public void whenYCordinateIsMaximumThenHitNorthBoundaryIsTrue(){
		Position testPosition = new Position(5,15);
		assertTrue(world.hitNorthBoundary(testPosition));
	}
	
	@Test
	public void whenYCordinateIsNotMaximumThenHitNorthBoundaryIsFalse(){
		Position testPosition = new Position(5,14);
		assertFalse(world.hitNorthBoundary(testPosition));
	}
	
	@Test
	public void whenXCordinateIsMaximumThenHitEastBoundaryIsTrue(){
		Position testPosition = new Position(15,5);
		assertTrue(world.hitEastBoundary(testPosition));
	}
	
	@Test
	public void whenXCordinateIsNotMaximumThenHitEastBoundaryIsFalse(){
		Position testPosition = new Position(14,5);
		assertFalse(world.hitEastBoundary(testPosition));
	}
	
	@Test
	public void whenYCordinateIsZeroThenHitSouthBoundaryIsTrue(){
		Position testPosition = new Position(5,0);
		assertTrue(world.hitSouthBoundary(testPosition));
	}
	
	@Test
	public void whenYCordinateIsNotZeroThenHitSouthBoundaryIsFalse(){
		Position testPosition = new Position(5,1);
		assertFalse(world.hitSouthBoundary(testPosition));
	}
	
	@Test
	public void whenXCordinateIsZeroThenHitWestBoundaryIsTrue(){
		Position testPosition = new Position(0,5);
		assertTrue(world.hitWestBoundary(testPosition));
	}
	
	@Test
	public void whenXCordinateIsNotZeroThenHitWestBoundaryIsFalse(){
		Position testPosition = new Position(5,5);
		assertFalse(world.hitWestBoundary(testPosition));
	}
	
	

	
	
	
	
}
