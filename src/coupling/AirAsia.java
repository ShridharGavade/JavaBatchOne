package coupling;

public class AirAsia implements TicketBookingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void bookTheTicket() {
		System.out.println("your ticket is boooked");
		
	}

	@Override
	public void cancelTheTicket() {
		System.out.println("your ticket is cancelled ");		
		
	}

	@Override
	public void checkPrice() {
		System.out.println("price is 40000");		
		
	}

}
