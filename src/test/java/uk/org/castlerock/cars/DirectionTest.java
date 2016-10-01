package uk.org.castlerock.cars;

import org.junit.Test;
import static org.junit.Assert.*; 
import static org.hamcrest.core.Is.*;

public class DirectionTest {
	
	/*
	 *These tests make sure that the next and previous methods on the direction
	 * enum work correctly
	 */
	
	@Test
	public void whenDirectionIsNorthThenNextDirectionIsEast(){
		assertThat(Direction.N.next(), is(Direction.E));
	}
	
	@Test
	public void whenDirectionIsWestThenNextDirectionIsNorth(){
		//checks that enum wraps round correctly
		assertThat(Direction.W.next(), is(Direction.N));
	}
	
	@Test
	public void whenDirectionIsSouthThenPreviousDirectionISEast(){
		assertThat(Direction.S.previous(), is(Direction.E));
	}
	
	@Test
	public void whenDirectionISNorthThenPreviousDirectionIsWest(){
		//checks that the enum also wraps backwards correctly
		assertThat(Direction.N.previous(), is(Direction.W));
		
	}

}
