package assignment5;

import java.util.Comparator;

/**
 * Created by mandasu on 7/26/2017.
 */
public class IdsComparator implements Comparator<Car>{
    @Override
    public int compare(Car c1, Car c2) {
        return c1.getIds() - c2.getIds();
    }
}
