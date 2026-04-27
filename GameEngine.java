public class GameEngine {

    public void combatRound(GameCharacter[] party){

        for (int i = 0; i < party.length; i++){
            party[i].attack();
            party[i].setHealth(party[i].getHealth() - 10);
        }
    }
}
