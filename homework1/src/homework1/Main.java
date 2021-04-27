package homework1;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"C#+Angular","Engin Demirog",55);
		Course course2=new Course(2,"Java+React","Engin Demirog",33);
		Course[] courses= {course1,course2};
		System.out.println("> COURSES <");
		for(Course course:courses) {
			System.out.println(course.name);
		}
		
		System.out.println("-------------------------------");
		CourseManager courseManager=new CourseManager();
		for(Course course:courses) {
			courseManager.joinToCourse(course);
			courseManager.progressOfCourse(course);
			courseManager.successRate(course);
			System.out.println("------------------------------------");
		}
	}

}
