public abstract class GameCharacter {

    private int health;

    public GameCharacter(int health){
        this.health = health;
    }

    public void takeDamage(int amount){
        health -= amount;
        if (health < 0){
            health = 0;
        }
    }

    public abstract void attack();

}
