package footballteam;

public class None implements CardType {
    @Override
    public int BoostStats(Defender def) {
        return 0;
    }

    @Override
    public int BoostStats(Attacker att) {
        return 0;
    }

    @Override
    public int BoostStats(Midfielder mid) {
        return 0;
    }
}
