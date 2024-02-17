import entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new LinkedList<>();

        employeeList.add(new Employee(1, "ali", "test"));
        employeeList.add(new Employee(2, "veli", "test"));
        employeeList.add(new Employee(3, "ayşe", "test"));
        employeeList.add(new Employee(4, "fatma", "test"));
        employeeList.add(new Employee(1, "ali", "test"));
        employeeList.add(new Employee(5, "çağrı", "test"));
        employeeList.add(new Employee(5, "çağrı", "test"));
        employeeList.add(new Employee(6, "yusuf", "test"));
        employeeList.add(new Employee(6, "yusuf", "test"));
        employeeList.add(new Employee(7, "ahmet", "test"));
        employeeList.add(new Employee(8, "mehmet", "test"));

        Map<Long, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();

        System.out.println("Mevcut: ");
        System.out.println(employeeList);

        Iterator<Employee> iterator = employeeList.iterator();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employeeIsNull(employee)) continue;
            if (employeeMap.containsKey(employee.getId())) {
                removedEmployees.add(employee);
                iterator.remove();
            } else {
                employeeMap.put(employee.getId(),employee);
            }
        }


        System.out.println("Tekiller:");
        System.out.println(employeeMap);
        System.out.println("Silinenler: ");
        System.out.println(removedEmployees);

    }

    private static boolean employeeIsNull(Employee employee) {
        if (employee == null) {
            System.out.println("employee is null");
            return true;
        }
        return false;
    }
}