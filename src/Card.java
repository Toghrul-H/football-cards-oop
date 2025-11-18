package footballteam;

public class Card {
    protected int cost;
    protected int defense;
    protected int passes; 
    protected int shots;
    protected Player player;
    protected CardType type;
    
    public Card(int cost, int defense, int passes, int shots, Player pl, CardType t){
        if (cost>0 && defense>0 && passes >0 && shots>0){
            this.cost=cost;
            this.defense=defense;
            this.passes=passes;
            this.shots=shots;            
            this.player = pl;
            this.type = t;
        }
        else{
            throw new IllegalArgumentException("Invalid card attributes: cost, defense, passes, and shots must be non-negative.");
        }
    }
    public int rating(){
        return 0;
    }
    
    public String getType(){
        return " ";
    }
    public Player getPlayer(){
        return player;
    }
    public int cost(){
        return cost;
    }
    public CardType type(){
        return type;
    }
}
