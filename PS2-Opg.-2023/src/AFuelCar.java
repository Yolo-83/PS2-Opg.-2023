
////   Abstrakt Klasse AFuelCar. Denne klasse skal nedarve fra Acar. Den skal tilføje to metoder:
////   tilføje to metoder:
////   abstract String getFuelType(); // should return “Gasoline” or “Diesel”
////    int kmPrLitre(); // should return how many kilometres the car can drive on 1 litre of fuel

public abstract class AFuelCar extends ACar {

    private final int kmPrLitre;


    public AFuelCar (String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }


    public int getKmPrLitre() {
        return kmPrLitre;
    }

    public abstract String getFuelType();


}

