
public class PoliceOfficer {
	
	private String name, badgeNum;
	
	
	
public PoliceOfficer(String n, String bn){
		this.name = n;
		this.badgeNum = bn;
}
public PoliceOfficer (PoliceOfficer officer2){
		
}

public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {
    if (car.getMinutesParked() > meter.getMinutesPurchased()) {
        return new ParkingTicket(this,car,meter);
    }
    return null;
}
		 

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}

	public String getBadgeNum() {
		return badgeNum;
	}

	public void setBadgeNum(String bn) {
		this.badgeNum = bn;
	}


	
}
