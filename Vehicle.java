public abstract class Vehicle {

    protected String label;
    protected double fuelCost;

    public Vehicle(String label, double fuelCost){
        this.label = label;
        this.fuelCost = fuelCost;
    }

    public void displayInfo(){
        System.out.println("The car is called " + label + " and the fuel cost is " + fuelCost);
    }

    abstract double totalCost();
}
