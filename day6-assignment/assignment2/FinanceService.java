package assignment2;

public class FinanceService {
    private final EmployeeService employeeService;

    public FinanceService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    void updateSalary() {
        employeeService.setSalary(employeeService.getSalary() + 1000);
    }

    double calculateTDS(double salary) {
        return 0.1 * salary;
    }
}