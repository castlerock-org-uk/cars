package uk.org.castlerock.cars;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GridTest {
	
	Grid grid;
	
	@Before
	public void createWorld(){
		grid = new Grid(15,15);
	}
	
	@Test
	public void whenYCordinateIsMaximumThenPositionAtNorthBoundaryIsTrue(){
		Position testPosition = new Position(5,15);
		assertTrue(grid.isPositionAtNorthBoundary(testPosition));
	}
	
	@Test
	public void whenYCordinateIsNotMaximumThenPositionAtNorthBoundaryIsFalse(){
		Position testPosition = new Position(5,14);
		assertFalse(grid.isPositionAtNorthBoundary(testPosition));
	}
	
	@Test
	public void whenXCordinateIsMaximumThenPositionAtEastBoundaryIsTrue(){
		Position testPosition = new Position(15,5);
		assertTrue(grid.isPositionAtEastBoundary(testPosition));
	}
	
	@Test
	public void whenXCordinateIsNotMaximumThenPositionAtEastBoundaryIsFalse(){
		Position testPosition = new Position(14,5);
		assertFalse(grid.isPositionAtEastBoundary(testPosition));
	}
	
	@Test
	public void whenYCordinateIsZeroThenPositionAtSouthBoundaryIsTrue(){
		Position testPosition = new Position(5,0);
		assertTrue(grid.isPositionAtSouthBoundary(testPosition));
	}
	
	@Test
	public void whenYCordinateIsNotZeroThenPositionAtSouthBoundaryIsFalse(){
		Position testPosition = new Position(5,1);
		assertFalse(grid.isPositionAtSouthBoundary(testPosition));
	}
	
	@Test
	public void whenXCordinateIsZeroThenPositionAtWestBoundaryIsTrue(){
		Position testPosition = new Position(0,5);
		assertTrue(grid.isPsoitionAtWestBoundary(testPosition));
	}
	
	@Test
	public void whenXCordinateIsNotZeroThenPositionAtWestBoundaryIsFalse(){
		Position testPosition = new Position(5,5);
		assertFalse(grid.isPsoitionAtWestBoundary(testPosition));
	}
	
}
