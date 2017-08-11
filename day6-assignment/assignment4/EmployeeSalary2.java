package assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mandasu on 7/25/2017.
 */
public class EmployeeSalary2 {
    public static void main(String[] args) {
        List<Double> salary = new ArrayList<>(10);
        salary.add(96234.99);
        salary.add(24234.99);
        salary.add(766734.99);
        salary.add(15234.99);
        salary.add(63424.99);
        salary.add(52344.99);
        salary.add(76234.99);
        salary.add(33134.99);
        salary.add(3244.99);
        salary.add(0.0);

        Iterator<Double> itr = salary.iterator();
        while(itr.hasNext()) {
            Double d= itr.next();
            if(d<20000.00) {
                System.out.println(d*1.2);
            } else {
                System.out.println(d);
            }
        }
    }

}
