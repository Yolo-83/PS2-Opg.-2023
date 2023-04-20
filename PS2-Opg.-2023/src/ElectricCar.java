public class ElectricCar extends ACar {

    private int batteryCapacityKWh; // returns the battery capacity in kilowatt-hours
    private int maxRangeKm; // returns the maximum range in kilometres.
    private int whPrKm; // returns the power consumption in watt-hours per driven kilometre.

    public ElectricCar (String make, String model, String registrationNumber, int numberOfDoors,
                        int batteryCapacityKWh, int maxRangeKm) {
        super (make, model, registrationNumber, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;
        this.whPrKm = batteryCapacityKWh/maxRangeKm;
    }

    @Override
    public String getFuelType() {
        return "Electric";
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public int getMaxRangeKm() {
        return maxRangeKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }


    @Override
    public int getRegistrationFee() {
        return 0;
    }
}
