package ie.itcarlow.lab6;

public class Student extends Person {
	
private int numCourses;
private String[] courses = new String [10];
private int[] grades = new int [10]; 

	public Student(String name, String address) {
		super(name, address);
	}
	public String toString() { 
		return "Student [numCourses=" + numCourses + " , "
				+ super.toString() + "]";
		
	}
	
	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		numCourses++;
		
	}
	
	public void printGrades() {
		System.out.println("Student Grades");
		for (int i = 0; i < numCourses; i++) {
			System.out.println(courses[i] + ":" + grades[i]);
		}
		
	public double AverageGrade() { 
		double total = 0;
		for(int i = 0;i < numCourses, i++) {
			total + 
		}
		
	}
	
	}
	public double getAverageGrade() {
		return 0.0;
		
	}
	
	
}