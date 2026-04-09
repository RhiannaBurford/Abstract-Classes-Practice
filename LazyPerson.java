public class LazyPerson extends Person{

    @Override
    public void eat(){
        System.out.println("I am going to order another takeaway");
    }

    @Override
    public void exercise(){
        System.out.println("I am not going to exercise, I am just going to lounge around and watch TV");
    }
}
