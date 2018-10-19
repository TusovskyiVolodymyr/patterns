package strategy;

import java.util.List;
import java.util.stream.Collectors;

public class NamePicker implements Picker {
    @Override
    public Object getEmployee(List<Employee> employees, String param) {
        List<Employee> employee = employees.stream().filter(employee1 -> employee1.getName().contains(param)).collect(Collectors.toList());
        if (employee.size() == 0) {
            throw new RuntimeException("No such employee");
        }
        if (employee.size() > 1) {
            return employee;
        } else return employee.get(0);
    }
}
