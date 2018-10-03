package compositor;

import java.util.ArrayList;
import java.util.List;

public class ResourceManager implements Employee {

    private String name;
    private List<Employee> employees;

    public ResourceManager(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }


    public void work() {
        System.out.println("Resource manager care about sub employees");
    }

    public String getName() {
        return name;
    }

    public void addToPull(Employee employee) {
        if (employee instanceof SubEmployee) {
            employees.add(employee);
        }
    }

    public Employee getSubEmployee(String name) {
        return employees.stream().filter(employee -> employee.getName().equals(name)).findFirst().get();
    }

    @Override
    public String toString() {
        return "ResourceManager{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
