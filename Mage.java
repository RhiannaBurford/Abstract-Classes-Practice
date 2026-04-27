public class Mage extends GameCharacter {

    public Mage(){
        super(60);
        // don't know how to set a specific value
    }

    @Override
    public void attack(){
        System.out.println("Casting a spell!");
    }
}
