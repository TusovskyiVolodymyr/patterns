package proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MineField {
    public static void main(String[] args) {
        List<String> area = new ArrayList<>();
        area.addAll(Arrays.asList("ground", "house", "car", "landmine", "rock"));
        Solder proxy = new RemoteRobot();
        proxy.investigateEnemyArea(area);
    }
}
