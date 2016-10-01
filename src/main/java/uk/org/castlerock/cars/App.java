package uk.org.castlerock.cars;

/**
 * A remote Controlled Cars Application
 * 
 * Ultimately a nice UI would be created perhaps in JavaFX or HTML5
 * The idea being that the user could use the cursor keys to move the car
 * around on an area of the screen this would be the car's 'world'
 * 
 * This class creates a command line app that can be used to test the functionality
 * of the car without a UI.
 * 
 * It accepts a string of commands in the format "X,Y:CCCCCCC" where X and Y
 * are the starting coordinates of the car and C are the commands that are 
 * transmitted to the car, they can be L to turn the car Left, R to turn the 
 * car Right and F to move the car forward. When the car turns it doesn't move
 * it just rotates like a tank. The list of commands can be any length
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//*** add regex check to check format of input string 
    	System.out.println("Your car has moved to: " + TestUtils.driveCar(args[0]));
    }
    
    
}
