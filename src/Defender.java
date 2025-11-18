package footballteam;

public class Defender extends Card{
    int a = type.BoostStats(this);
    public Defender(int cost, int defense, int passes, int shots, Player pl, CardType t){
        super(cost,defense,passes,shots,pl,t);  
        this.cost=cost+a;
    }
    @Override
    public String getType(){
        return "defender";
    }
    @Override
    public int rating(){
        return defense + a;
    }
    
}
