package uk.org.castlerock.cars;


import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	
	
	/*
	 * For the input "5,5:RFLFRFLF"
	 * We should get the position "7,7"
	 */
	@Test
	public void FirstDrivingTest() {
		assertEquals("7,7",TestUtils.driveCar("5,5:RFLFRFLF"));
	}
	
	/*
	 * For the input "6,6:FFLFFLFFLFF"
	 * We should get the position "6,6"
	 */
	@Test
	public void SecondDrivingTest() {
		assertEquals("6,6",TestUtils.driveCar("6,6:FFLFFLFFLFF"));
	}
	
    /*
	 * For the input "5,5:FLFLFFRFFF"
	 * We should get the position "4,1"
	 * 
	 * This test dictates that the y coordinate is first in the returned output.
	 * which seems unusual.
	 * 
	 */
	@Test
	public void ThirdDrivingTest() {
		assertEquals("4,1",TestUtils.driveCar("5,5:FLFLFFRFFF"));
	}

}
