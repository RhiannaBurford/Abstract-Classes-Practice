public class Dog extends Animal2{

    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Woof woof!");
    }
}
