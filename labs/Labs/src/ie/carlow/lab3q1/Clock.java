package ie.carlow.lab3q1;

import java.util.Calendar;

public class Clock {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		
		long current = System.currentTimeMillis();
		
				
		for(int i=0; i < 60; i++);{
		long current2 = System.currentTimeMillis();
														//Tick the time 
		t.tick();
		System.out.println(t.toString());
		current = current;
		
		
		
		}
	


	}

}
