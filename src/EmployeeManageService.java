import java.util.ArrayList;
import java.util.List;

/**
 * The type Employee manage service.
 */
public class EmployeeManageService implements ManageService {
    /**
     * The Employee list.
     */
    List<Employee> employeeList;

    /**
     * Instantiates a new Employee manage service.
     */
    public EmployeeManageService() {
        employeeList = setEmployee();

    }

    /**
     * Sets employee.
     *
     * @return the employee
     */
    public List<Employee> setEmployee() {

        Employee employee1 = new Employee("Nadzirah", "Manager", 4600,
                "nadzirah@destinationservice.com", "0123456789");
        Employee employee2 = new Employee("Azmar", "Supervisor", 2600,
                "azmar@destinationservice.com", "0123456789");
        Employee employee3 = new Employee("Isyak", "Tour Guide", 1600,
                "isyak@destinationservice.com", "0123456789");
        Employee employee4 = new Employee("Kwan", "Logistics", 2600,
                "kwan@destinationservice.com", "0123456789");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        return employeeList;
    }

    @Override
    public double calculateFee() {
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    @Override
    public void printMessage() {
        System.out.println("\n\nEmployee List:- \n");
        for (Employee employee : employeeList) {
            System.out.println("Name: " + employee.getEmpName());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Salary: RM" + employee.getSalary());
            System.out.println("Email: " + employee.getEmail());
            System.out.println("Phone Number: " + employee.getPhone() + "\n");
        }
    }
}

