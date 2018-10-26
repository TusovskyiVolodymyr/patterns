package proxy;

import java.util.List;

public class Proxy {

    private Solder explorer;

    public Proxy() {

    }

    private void loadSolder() {
        if (explorer == null) {
            explorer = new Explorer();
        }
    }

    public void investigateEnemyArea(List<String> area) {
        if (area.contains("landmine")) {
            try {
                area.remove("landmine");
                throw new RuntimeException("Wait, there's a bomb, i cared about it");
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        loadSolder();
        explorer.investigateEnemyArea(area);
    }
}
