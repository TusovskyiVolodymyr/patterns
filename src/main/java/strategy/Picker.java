package strategy;

import java.util.Comparator;
import java.util.List;

public interface Picker {
    Object getEmployee(List<Employee> employees, String param);
}
