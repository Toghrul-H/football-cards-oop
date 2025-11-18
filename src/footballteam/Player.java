package footballteam;

public class Player {
    private String name;
    private Nation nationality;
    
    public Player(String name, Nation nat){
        this.name=name;
        this.nationality=nat;
    }
    public String getName(){
        return name;
    }
    public Nation getNationality(){
        return nationality;
    }
}
