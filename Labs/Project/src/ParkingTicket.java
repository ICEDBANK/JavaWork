public class ParkingTicket {
	
	private parkedcar car;
	private PoliceOfficer officer;
	private ParkingMeter meter;
	private double fine;
	private int minutes;
	public double BASE_FINE = 25.0;
	public double HOURLY_FINE = 10.0;
	

public ParkingTicket(ParkingTicket ticket2){
	
}
	
public parkedcar getCar() {
	return car;
}


public void setCar(parkedcar acar) {
	this.car = acar;
}


public PoliceOfficer getOfficer() {
	return officer;
}


public void setOfficer(PoliceOfficer anOfficer) {
	this.officer = anOfficer;
}


public int getMinutes() {
	return minutes;
}


public void setMinutes(int min) {
	min = car.getminutesParked() - meter.minutesPurchased;
	this.minutes = min;
}
public void calculateFine(){
	if(car.getminutesParked() > meter.getMinutesPurchased()){
		if (car.getminutesParked() - meter.getMinutesPurchased() <= 60)
			fine = 25;
		else
			fine = 25 + (10 *((car.getminutesParked() - meter.getMinutesPurchased())/60));
	}
}
public String toString(){
	String display  = 
			"Car Info: " + car +
			"\nParking Meter Info: " + meter +
			"\nAmount Of Fine: $ " + fine;
	return display;
			
			
}
public ParkingMeter getMeter() {
	return meter;
}
public void setMeter(ParkingMeter meter) {
	this.meter = meter;
}
}