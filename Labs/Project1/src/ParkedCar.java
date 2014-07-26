
public class ParkedCar {
	public static void main(String[] args){
		
	}
	private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    public ParkedCar(String make, String model, String color,
            String licenseNumber, int minutes) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.minutesParked = (minutes > 0) ? minutes : 0;
    }

    public ParkedCar(ParkedCar other) {
        this.make = other.make;
        this.model = other.model;
        this.color = other.color;
        this.licenseNumber = other.licenseNumber;
        this.minutesParked = other.minutesParked;
    }

    public String getMake() {
        return make; 
    }
   
    public String getModel() {
        return model;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getLicenseNumber() {
        return licenseNumber;
    }
    
    public int getMinutesParked() {
        return minutesParked;
    }
    
    public String toString() {
        return "Make: " + make + "\n" +
               "Model: " + model + "\n" +
               "Color: " + color + "\n" +
               "License Number: " + licenseNumber + "\n" +
               "Minutes Parked: " + minutesParked;
    }
}



