package footballteam;

public class POTW implements CardType {
    @Override
    public int BoostStats(Defender def) {
        return 4;
    }

    @Override
    public int BoostStats(Attacker att) {
        return 2;
    }

    @Override
    public int BoostStats(Midfielder mid) {
        return 3;
    }
}
