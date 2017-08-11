package assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mandasu on 7/29/2017.
 */
public class EmployeeService {
    public static void main(String[] args) {
        System.out.println("------------------------");
        moreThan50k();
        System.out.println("------------------------");
        calculateTDS();
        System.out.println("------------------------");
        averageSal();
        System.out.println("------------------------");
        findMaxMin();
        System.out.println("------------------------");

    }

    public static  void findMaxMin() {
        List<Employee> EList = createEmployeeList();
        EList.stream().
        max((emp1, emp2)-> {if(emp1.getSalary()>emp2.getSalary()) {return 1;}
                                else if (emp1.getSalary()<emp2.getSalary()) {return -1;}
                                else {return 0; } });
        System.out.println( "maximum salary =  " + EList.get(0).getSalary());
        System.out.println( "minimum salary =  " + EList.get(9).getSalary());
    }


    public static void averageSal() {
        List<Employee> EList = createEmployeeList();
        double sum = EList.stream().
                map((employee) -> employee.getSalary()).
                reduce((x, y) -> x + y).get();
        System.out.println("total salary =  " + sum);
        System.out.println("------------------------");
        System.out.println("total number of Employees =  " + EList.size());
        System.out.println("------------------------");
        System.out.println("average salary =  " + sum / EList.size());
    }

    public static void moreThan50k() {
        List<Employee> EList = createEmployeeList();
        EList.stream().
                filter((employee) -> employee.getSalary() > 50000.00)
                .forEach((employee) -> {
                    System.out.println(employee.getEmpId() + " " + employee.getName() + " " + employee.getSalary());
                });
    }

    public static void calculateTDS() {
        List<Employee> EList = createEmployeeList();
        Double totalTDS = EList.stream().
                filter((employee) -> employee.getSalary() > 50000.00).
                map((employee) -> employee.getSalary() * 0.2).
                reduce((x, y) -> x + y).get();
        System.out.println("total TDS = " + totalTDS);
    }

    public static List<Employee> createEmployeeList() {
        List<Employee> EList = new ArrayList<>();
        EList.add(new Employee(1, "AA", 200000.00));
        EList.add(new Employee(2, "BB", 100000.00));
        EList.add(new Employee(3, "CC", 50000.00));
        EList.add(new Employee(4, "DD", 20000.00));
        EList.add(new Employee(5, "EE", 30000.00));
        EList.add(new Employee(6, "FF", 40000.00));
        EList.add(new Employee(7, "GG", 60000.00));
        EList.add(new Employee(8, "HH", 80000.00));
        EList.add(new Employee(9, "II", 90000.00));
        EList.add(new Employee(10, "JJ", 200.00));
        return EList;
    }
}
