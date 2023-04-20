public class GasolinCar extends AFuelCar {

    public GasolinCar (String make, String model, String registrationNumber, int numberOfDoors, int kmPrLitre) {
        super (make, model, registrationNumber, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "Gasolin";
    }


    public int getRegistrationFee() {
        int registrationFee = 0;
        if (getKmPrLitre() >= 20 && getKmPrLitre() < 50){
            registrationFee = 330;
        } else if (getKmPrLitre() >= 15 && getKmPrLitre() < 20) {
            registrationFee = 1050;
        } else if (getKmPrLitre() >= 10 && getKmPrLitre() < 15) {
            registrationFee = 2340;
        } else if (getKmPrLitre() >= 5 && getKmPrLitre() < 10 ) {
            registrationFee = 5500;
        } else if (getKmPrLitre() < 5 ) {
            registrationFee = 10470;
        }
        return registrationFee ;
    }

    @Override
    public String toString() {
        return "Gasolin Car Details:" +
                "\n Brand: " + getMake() +
                "\n Model: " + getModel() +
                "\n Number plate: " + getRegistrationNumber() +
                "\n Number of doors: " + getNumberOfDoors() +
                "\n Fuel type: " + getFuelType() +
                "\n Registration fee: " + getRegistrationFee() +
                "\n";
    }

}
