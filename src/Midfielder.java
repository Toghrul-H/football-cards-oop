package footballteam;

public class Midfielder extends Card{
    int a = type.BoostStats(this);
    public Midfielder(int cost, int defense, int passes, int shots, Player pl, CardType t){
        super(cost,defense,passes,shots,pl,t);  
        this.cost=cost+a;
    }
    @Override
    public String getType(){
        return "midfielder";
    }
    @Override
    public int rating(){
        return passes+ a;
    }
}
    