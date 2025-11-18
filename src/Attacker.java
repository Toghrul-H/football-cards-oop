package footballteam;

public class Attacker extends Card{
    int a = type.BoostStats(this);
    public Attacker(int cost, int defense, int passes, int shots, Player pl, CardType t){
        super(cost,defense,passes,shots,pl,t);  
        this.cost=cost+a;

    }
    
    
    @Override
    public String getType(){
        return "attacker";
    }
    @Override
    public int rating(){
        return shots + a;
    }
}
    