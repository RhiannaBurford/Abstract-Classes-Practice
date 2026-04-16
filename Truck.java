public class Truck extends Vehicle{

    public Truck(String label, double fuelCost){
        super(label, fuelCost);
    }

    @Override
    public double totalCost(){
        return fuelCost + 50.0;
    }
}
