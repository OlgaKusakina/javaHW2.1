public class BonusMilesService {

    public int calculate(int cost) {
        int bonus;
        if (cost < 20) {
            bonus = 0;
        } else {
            bonus = cost / 20;
        }
        return bonus;
    }
}
