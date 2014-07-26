
public class parkedcar {

	private String make, model, color, licenseNum;
	private int minutesParked;
	
public parkedcar(){
	
}

public parkedcar(String mk, String md, String cL, String ln, int mP){
	
}

public parkedcar(parkedcar car2){
	make = car2.make;
	model = car2.model;
	color = car2.color;
	licenseNum = car2.licenseNum;
	minutesParked = car2.minutesParked;
}

public String getmake(){
	return make;
}
public void setmake(String mk){
	make = mk;
}
public String getmodel(){
	return model;
}
public void setmodel(String md){
	model = md;
}
public String getcolor(){
	return color;
}
public void setcolor(String cL){
	model = cL;
}
public String getlicenseNum(){
	return licenseNum;
}
public void setlicenseNum(String ln){
	model = ln;
}
public int getminutesParked(){
	return minutesParked;
}
public void setMinutesParked(int mP){
	minutesParked = mP;
}
public String toString(){
	String display = 
			"Parked car make: " + make +
			"\nParked car Model: " + model +
			"\nParked car Color: " + color +
			"\nParked car's license plate number : " + licenseNum +
			"\nMinutes that the car has been parked: " + minutesParked;
	return display;
}
}
