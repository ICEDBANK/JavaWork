
public class ParkingMeter {
	public static void main(String[] args){
		
	}
	private int minutesPurchased;

    public ParkingMeter(int minutes) {
        minutesPurchased = (minutes > 0) ? minutes : 0;
    }
    
    public ParkingMeter(ParkingMeter other) {
        this.minutesPurchased = other.minutesPurchased;
    }

    public int getMinutesPurchased() {
        return minutesPurchased;
    }
    
    public String toString() {
        return "Minutes Purchased: " + minutesPurchased;
    }
}



