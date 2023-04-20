
//// Abstrakt klasse ACar skal implementere Car interfacet og alle metoderne i dette, undtagen getRegistrationFee().
public abstract class ACar implements Car {
    String registrationNumber;
    String make;
    String model;
    int numberOfDoors;


    //// Lav klassen attributter til at holde styr på registreringsnummer, mærke, model og antal døre.
    public ACar (String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }


    public String getRegistrationNumber() {
        return "";
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public abstract String getFuelType();
}