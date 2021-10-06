package ie.itcarlow.lab1;

//Cian Fox
//Lab1Q1
//06/10/21	

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();
		Thermometer tempB = new Thermometer();// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		tempB.setCelsius(10.0);
		System.out.println("Temp. of Thermometer B is " + tempB.getCelsius() );
	} // end main
} // end class ThermTest