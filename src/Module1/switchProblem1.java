package Module1;

import java.util.Scanner;

public class switchProblem1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("what is the floor you want to go ?? ");
		
		int floor = sc.nextInt();
		
		switch(floor) {
		
		case 1: 
			System.out.println("school is on first floor");
			break;
		case 2:
			System.out.println("college is on 2nd floor ");
			break;
		case 3:
			System.out.println("hospital is on 3rd floor");
		case 4:
			System.out.println("office");
			break;
		case 5: 
			System.out.println("hotel");
			break;
			
		default:
			System.out.println("wrong info");
		    
		}

	}

}
