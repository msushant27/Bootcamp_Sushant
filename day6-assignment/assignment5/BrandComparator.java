package assignment5;

import java.util.Comparator;

/**
 * Created by mandasu on 7/26/2017.
 */
public class BrandComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return c1.getBrand().compareTo((c2).getBrand());
    }
}

