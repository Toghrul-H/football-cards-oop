package footballteam;

public class POTY implements CardType {
    @Override
    public int BoostStats(Defender def) {
        return 10;
    }

    @Override
    public int BoostStats(Attacker att) {
        return 7;
    }

    @Override
    public int BoostStats(Midfielder mid) {
        return 6;
    }
}
