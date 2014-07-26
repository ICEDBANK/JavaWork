import java.text.DecimalFormat;

public class ParkingTicket {
	

	    private static int count = 0;
	    private PoliceOfficer officer;
	    private ParkedCar car;
	    private ParkingMeter meter;
	    private int fine;

	    public ParkingTicket(PoliceOfficer officer, ParkedCar car,
	            ParkingMeter meter) {
	        ++count;
	        this.officer = officer;
	        this.car = car;
	        this.meter = meter;
	        int hoursOver = (int)Math.ceil((car.getMinutesParked() - meter.getMinutesPurchased())/60.0);
	        fine = 25 + 10*(hoursOver-1);
	    }

	    public String toString() {
	        DecimalFormat df = new DecimalFormat("$###.00");
	        return "Parking Ticket #" + count + "\n" + car + "\n" 
	               + meter + "\nFine: " + df.format(fine) + "\n" + officer;
	    }
	}




