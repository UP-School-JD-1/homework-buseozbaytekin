package Chapter1;

public class TestOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RegistrationOffice registrationOffice = new RegistrationOffice();
		
		Student student = registrationOffice.getAStudent();
		
		registrationOffice.registerStudent(student);
		
//		System.out.println(student.toString());
		
		
		
		
		
	}

}
