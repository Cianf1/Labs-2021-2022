package ie.carlow.lab3q1;

public class TimeTest {
	public static void main (String args[])
	{
		Time t = new Time (23, 59, 59);
		System.out.println(t.toMilitaryString());
		System.out.println(t.toString());
		t.tick();
		System.out.println(t.toMilitaryString());
		System.out.println(t.toString());
	}

}
