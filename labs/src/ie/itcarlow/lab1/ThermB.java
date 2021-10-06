package ie.itcarlow.lab1;

//Cian Fox 
//Lab1Q1
//06/10/21
public class ThermB {


private double celsius;	
public ThermB()		// constructor method #1
{
setCelsius(0);		
}

public ThermB(double cel)	// constructor method #2
{
setCelsius(cel);
}

public void setCelsius(double cel)
{
celsius = cel;		
}

public double getCelsius()
{
return celsius;
}
} // end class Thermometer
