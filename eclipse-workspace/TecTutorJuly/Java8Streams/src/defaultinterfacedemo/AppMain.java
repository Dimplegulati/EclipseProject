package defaultinterfacedemo;

public class AppMain {
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.EducationDetails();
		c1.personalDetails();
		
		Student student=new Student();
		student.EducationDetails();
		student.personalDetails();
	}

}
