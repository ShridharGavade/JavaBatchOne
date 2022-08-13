package Abstraction;

public  class StudentDetails extends Students{

	public static void main(String[] args) {
      StudentDetails abc = new StudentDetails();
      abc.marks();
		
	}

	@Override
	public void marks() {
		
		System.out.println("student A got 50 marks");
		
		
	}

	@Override
	public void result() {
		System.out.println("Student A is pass with second class");
		
	}

	@Override
	public void personalInfo() {
		
		System.out.println("888888888888 is the mobile number of student A");
		
	}

}
