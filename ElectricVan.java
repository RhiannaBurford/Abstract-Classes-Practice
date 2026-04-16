public class ElectricVan extends Vehicle {
    public ElectricVan(String label, double fuelCost){
        super(label, fuelCost);
    }

    @Override
    public double totalCost(){
        return fuelCost * 0.60;
    }
}
