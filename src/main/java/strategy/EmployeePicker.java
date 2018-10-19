package strategy;

import java.util.List;

public class EmployeePicker {
     public static void printEmployee(List<Employee> employees, Picker picker, String param) {
         System.out.println(picker.getEmployee(employees, param));
     }
}
