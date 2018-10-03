package compositor;

import java.util.ArrayList;
import java.util.List;

public class HeadManager implements Employee {

    private String name;
    private List<Employee> resourceManagers;

    public HeadManager(String name) {
        this.name = name;
        this.resourceManagers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println("Head manager care about company ...");
    }

    public void addManager(Employee employee) {
        if (employee instanceof ResourceManager) {
            resourceManagers.add(employee);
        } else throw new RuntimeException("Wrong hierarchy!");
    }

    public ResourceManager getManager(String name) {
        return (ResourceManager) resourceManagers.stream().filter(rm ->rm.getName().equals(name)).findFirst().get();
    }

    @Override
    public String toString() {
        return "HeadManager{" +
                "name='" + name + '\'' +
                ", resourceManagers=" + resourceManagers +
                '}';
    }
}

