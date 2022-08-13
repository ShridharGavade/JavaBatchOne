package Module1;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AND Operator 
		boolean a = true;
		boolean b= true;
		boolean c = false;
		
		System.out.println(a&&b);
		System.out.println(a&&c);
		
		
//		OR operator;
		boolean d = false;
		boolean e = true;
		boolean f= false;

		System.out.println(d||e);
		System.out.println(e||f);
		System.out.println(d||f);
		
//		not operator "!"
		
		System.out.println(!f);

	}

}
