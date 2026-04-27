public abstract class Animal2 {
    
    private String name;

    public Animal2(String name){
        this.name = name;
    }

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }

    public abstract void makeSound();
}
