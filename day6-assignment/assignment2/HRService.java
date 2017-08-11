package assignment2;

public class HRService {
    private final EmployeeService employeeService;

    public HRService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    boolean eligibleForPromotion() {
        if (employeeService.getDesig().equals("engineer")) {
            return true;
        } else {
            return false;
        }
    }

    boolean changeProject() {
        if (employeeService.getName().equals("Sushant")) {
            return true;
        } else {
            return false;
        }
    }

    String changeDesignation() {
        if (eligibleForPromotion()) {
            employeeService.setDesig("SD");
            return ("desig == " + employeeService.getDesig());
        } else {
            return ("not eligible");
        }
    }
}