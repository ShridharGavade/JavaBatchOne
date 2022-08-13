package Encapsulation;

public class SchoolInfo {

	public static void main(String[] args) {
		
		School abc = new School();
		abc.setStudentName("SaiPrasad");
		
		System.out.println(abc.getStudentName());
		
		abc.setMobileNumber(9999999);
		
		
		System.out.println(abc.getMobileNumber());

	}

}
