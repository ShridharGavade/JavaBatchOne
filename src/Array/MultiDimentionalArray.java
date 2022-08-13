package Array;

public class MultiDimentionalArray {

	public static void main(String[] args) {

		int [][] Values = new int [3][3];
		
	Values[0][0]= 20;
	Values[0][1]= 30;
	Values[0][2]= 40;
	Values[1][0]= 50;
	Values[1][1]= 40;
	Values[1][2]= 60;
	Values[2][0]= 70;
	Values[2][1]= 70;
	Values[2][2]= 80;
	
	
//	int i == row
//	int j == column
	
	for(int i = 0; i<3;i++) {
		
       for(int j=0; j<3; j++) {
			
			System.out.println(Values[i][j]);
			
		}
		
		
	}
	
	
	System.out.println("double for loop ended ");
	
		
		
	}

}
