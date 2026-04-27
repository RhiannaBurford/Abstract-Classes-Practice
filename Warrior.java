public class Warrior extends GameCharacter {

    public Warrior(){
        super(100);
    }

    @Override
    public void attack(){
        System.out.println("Swinging a sword");
    }
}
