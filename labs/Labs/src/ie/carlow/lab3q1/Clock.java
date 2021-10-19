package ie.carlow.lab3q1;

import java.util.Calendar;

public class Clock {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		
		long current = System.currentTimeMillis();
		
		
		t.tick();
		while(t.getSecond() != 0) {
		long current2 = System.currentTimeMillis();  
		
												//Tick the time 
		if (current2 - current >= 1000) {
		t.tick();
		System.out.println(t.toString());
		current = current2;
		
		}
		
		}
	


	}

}
