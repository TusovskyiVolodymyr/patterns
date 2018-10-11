package proxy;

import java.util.List;

public class Explorer implements Solder {

    @Override
    public void investigateEnemyArea(List<String> area) {
        System.out.println("Solder investigate enemy area and report to headquarters...");
        for (int i = 0; i < area.size(); i++) {
            System.out.println(String.format("Researched %d - [%s] zones, problems not found", i + 1, area.get(i)));
        }
    }
}
