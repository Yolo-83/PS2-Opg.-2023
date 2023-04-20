public class DieselCar extends AFuelCar {
    final boolean hasParticleFilter;

    public DieselCar (String make, String model, String registrationNumber, int numberOfDoors, int kmPrLitre,
                     boolean hasParticleFilter) {
        super (make, model, registrationNumber, numberOfDoors, kmPrLitre);
        this.hasParticleFilter = hasParticleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    public boolean hasParticleFilter() {
        return hasParticleFilter;
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee = 0;
        if (getKmPrLitre() >= 20 && getKmPrLitre() < 50){
            registrationFee = 330+130;
        } else if (getKmPrLitre() >= 15 && getKmPrLitre() < 20) {
            registrationFee = 1050+1390;
        } else if (getKmPrLitre() >= 10 && getKmPrLitre() < 15) {
            registrationFee = 2340+1850;
        } else if (getKmPrLitre() >= 5 && getKmPrLitre() < 10 ) {
            registrationFee = 5500+2770;
        } else if (getKmPrLitre() < 5 ) {
            registrationFee = 10470+15260;
        } if (!hasParticleFilter) {
            return registrationFee + 1000;
        } else {
            return registrationFee;
        }

    }

    @Override
    public String toString() {
        return getFuelType() + " Car Details:" +
                "\n Brand: " + getMake() +
                "\n Model: " + getModel() +
                "\n Number plate: " + getRegistrationNumber() +
                "\n Number of doors: " + getNumberOfDoors() +
                "\n Particle filter: " + hasParticleFilter() +
                "\n Registration fee: " + getRegistrationFee() +
                "\n";
    }
}
