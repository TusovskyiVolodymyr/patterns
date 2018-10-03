package Proxy;

import java.util.List;

public class RemoteRobot implements Solder {

    private Solder explorer;

    public RemoteRobot() {
        this.explorer = new Explorer();
    }

    @Override
    public void investigateEnemyArea(List<String> area) {
        if (area.contains("landmine")) {
            try {
                area.remove("landmine");
                throw new RuntimeException("Wait, there's a bomb, i cared about it");
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        explorer.investigateEnemyArea(area);
    }
}
