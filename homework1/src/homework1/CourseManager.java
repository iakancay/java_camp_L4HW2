package homework1;

public class CourseManager {
	
	public void joinToCourse(Course course) {
		System.out.println("You joined the "+course.name+" course successfully.");
		}
	public void progressOfCourse(Course course) {
		System.out.println("You completed %"+course.progress+" of "+ course.name+" course.");
	}
	public void successRate(Course course) {
	if(course.progress<50) {System.out.println("Work harder...");}
	else if(course.progress<75) {System.out.println("Well Done...");}
	else {System.out.println("Exellent.You are hero...");}
	}

}
