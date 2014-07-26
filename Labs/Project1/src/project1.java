
public class project1 {
	

public static void main (String[ ] args){
	ParkedCar car = new ParkedCar("Volkswagen", "1972", "Red", "15asdf", 125 );
	ParkingMeter meter = new ParkingMeter(60);
	PoliceOfficer officer = new PoliceOfficer("Jos Friday", "1244");
	
	ParkingTicket ticket = officer.patrol(car, meter);
	
	
	
	
	
	
	if (ticket != null){
		System.out.println(ticket);
	}else{
		System.out.println("No Crimes Commited");
	}
	
	
	}
}
