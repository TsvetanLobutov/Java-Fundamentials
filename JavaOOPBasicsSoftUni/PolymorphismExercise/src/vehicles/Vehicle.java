package vehicles;

public class Vehicle {
    private double fuelQuantity;
    private double fuelConsumptionPerKilometer;

    public Vehicle(double fuelQuantity, double fuelConsumptionPerKilometer) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumptionPerKilometer(fuelConsumptionPerKilometer);
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumptionPerKilometer(double fuelConsumptionPerKilometer) {
        this.fuelConsumptionPerKilometer = fuelConsumptionPerKilometer;
    }

    public boolean drive(double distance){
        double neededFuel = distance * this.fuelConsumptionPerKilometer;
        if(this.fuelQuantity < neededFuel){
            return false;
        }
        this.fuelQuantity -= neededFuel;
        return true;
    }

    public void refuel(double fuelQuantity){
        this.fuelQuantity += fuelQuantity;
    }

    public String toString(){
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }

}
