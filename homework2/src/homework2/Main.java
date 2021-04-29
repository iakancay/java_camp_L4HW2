package homework2;

public class Main {

	public static void main(String[] args) {
		UserManager userManager= new UserManager();
		Student student1=new Student();
		Student student2= new Student();
		Instructor instructor1= new Instructor();
		Instructor instructor2= new Instructor();
		
		student1.setId(1);
		student1.setFirstName("Ali");
		student1.setLastName("Ak");
		student1.setStudentNumber("A1001");
		
		student2.setId(2);
		student2.setFirstName("Veli");
		student2.setLastName("Kara");
		student2.setStudentNumber("A1002");
		
		instructor1.setId(11);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setProfession("Programmer");
		
		instructor2.setId(12);
		instructor2.setFirstName("Ibrahim");
		instructor2.setLastName("Akancay");
		instructor2.setProfession("Mathematician");
		User[] users= {student1,student2,instructor1,instructor2};
		
		for(User user: users) {
		userManager.Add(user);
		}
		// @ override
		new InstructorManager().Add(instructor2);
		
		
		

	}

}
