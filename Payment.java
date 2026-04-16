public abstract class Payment {

    protected double amount;

    public Payment(double amount){
        this.amount = amount;
    }

    public void showAmount(){
        System.out.println("Original Amount: " + amount);
    }

    abstract double calculateFee();
}
