public class CreditCardPayment extends Payment {
    
    

    public CreditCardPayment(double amount){
        super(amount);
    }
    @Override
    public double calculateFee(){
        return this.amount * 0.03;
    }
}
