package Module2;

import java.util.Scanner;

public class reverseStringProgramm {
	
//	public static void reverseTheString(String str) {
//		
//		String s = str;
//		int a = s.length();
//		for(int b = a-1; b>=0;b--) {
//			
//			System.out.print(s.charAt(b));
//		}
//	}
//	   ""+s+sa
	

	public static String reverseTheString1(String str) {
		
		String s = str;
		int a = s.length();
		String ss = "";
		for(int b = a-1; b>=0;b--) {
			 ss= ss+s.charAt(b);
	
		}
		return ss;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is your String");
		
		String str = sc.nextLine();
		
		String reverrsedString = reverseStringProgramm.reverseTheString1(str);
		System.out.println(reverrsedString);
		
	}
	
	

}
