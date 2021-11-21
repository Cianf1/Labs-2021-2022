package ie.itcarlow.lab6;

public class Teacher {

	private int numCourses;
	private String[] courses;
	
	public Teacher(String name, String address) { 
		super(name, address);
	}
	public String toString() { 
		return "Teacher[numCourses=" + numCourses + ","
				+ super.toString() + "]";
		
	}
	public boolean addcourse(String course) { 
		courses[numCourses] = course;
		numCourses++;
		return true;
	}
	public boolean removeCourse(String name) {
		return true;
	}
}
