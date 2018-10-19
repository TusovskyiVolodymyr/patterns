package strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee.Builder()
                .setName("John")
                .setAge(30)
                .setLocation("Lviv")
                .setPosition("Dev")
                .setSallary(BigDecimal.valueOf(2000))
                .build();
        Employee employee2 = new Employee.Builder()
                .setName("Bill")
                .setAge(30)
                .setLocation("Lviv")
                .setPosition("Dev")
                .setSallary(BigDecimal.valueOf(2000))
                .build();
        Employee employee3 = new Employee.Builder()
                .setName("Nick")
                .setAge(30)
                .setLocation("Lviv")
                .setPosition("Dev")
                .setSallary(BigDecimal.valueOf(1000))
                .build();
        Employee employee4 = new Employee.Builder()
                .setName("Dave")
                .setAge(30)
                .setLocation("YLviv")
                .setPosition("Dev")
                .setSallary(BigDecimal.valueOf(2000))
                .build();
        Employee employee5 = new Employee.Builder()
                .setName("Dave")
                .setAge(30)
                .setLocation("New York")
                .setPosition("Dev")
                .setSallary(BigDecimal.valueOf(2000))
                .build();

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.sort(new NameComparator());
        System.out.println(employees);

        EmployeePicker.printEmployee(employees, new NamePicker(), "i");
        EmployeePicker.printEmployee(employees, new SallaryPicker(), "1000");
    }
}
