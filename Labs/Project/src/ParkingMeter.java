public class ParkingMeter{

public int minutesPurchased;

public ParkingMeter(ParkingMeter park1){
	minutesPurchased = park1.minutesPurchased;
}
public ParkingMeter(int mp){
	minutesPurchased = mp;
}
public void set(int pm){
	minutesPurchased = pm;
}

public int getMinutesPurchased(){
	return minutesPurchased;
}
}