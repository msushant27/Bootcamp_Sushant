package assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mandasu on 7/25/2017.
 */
public class EmployeeSalary {
    public static void main(String[] args) {
        List<Double> Salary = new ArrayList<>(10);
        Salary.add(76234.99);
        Salary.add(234234.99);
        Salary.add(766734.99);
        Salary.add(65234.99);
        Salary.add(634234.99);
        Salary.add(5234.99);
        Salary.add(876234.99);
        Salary.add(733134.99);
        Salary.add(3244.99);
        Salary.add(0.0);

        Iterator<Double> itr = Salary.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next()* 0.4);
        }
    }
}
