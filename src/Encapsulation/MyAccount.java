package Encapsulation;

public class MyAccount {
	
	
   private double balance;
   public void setBalance(double balance) {
	this.balance = balance;
}

public void setAccName(String accName) {
	AccName = accName;
}

private String AccName;
   
   
   public void getBalance() {
	   System.out.println(this.balance);
   }
   
   public void getAccName() {
	   System.out.println(this.AccName);
   }
   
   public static void main(String[] args) {
	   
	   MyAccount abc = new MyAccount();
	   abc.getAccName();
	   abc.getBalance();
	
	   
}
   
   
   
   
	
	
	
}
