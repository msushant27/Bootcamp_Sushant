package assignment5;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by mandasu on 7/26/2017.
 */
public class CarTest {
    public static void main(String[] args) {

        TreeSet<Car> carSet = new TreeSet<Car>(new BrandComparator());
        carSet.add(new Car(10200, 25, "Maruti"));
        carSet.add(new Car(10300, 40, "BMW"));
        carSet.add(new Car(10100, 20, "Renault"));
        carSet.add(new Car(11000, 30, "Toyota"));
        carSet.add(new Car(10900, 50, "Rolls Royce"));
        carSet.add(new Car(10700, 40, "Toyota"));
        carSet.add(new Car(10600, 42, "Audi"));
        carSet.add(new Car(10800, 34, "Ford"));
        carSet.add(new Car(11200, 23, "Volvo"));
        carSet.add(new Car(10400, 35, "Mercedes"));
        carSet.add(new Car(11700, 65, "Volkswagen"));
        carSet.add(new Car(10500, 45, "Honda"));
        carSet.add(new Car(11600, 60, "Jaguar"));
        carSet.add(new Car(11300, 43, "Aston Martin"));
        carSet.add(new Car(11900, 37, "Chevrolet"));
        carSet.add(new Car(11100, 68, "Fiat"));
        carSet.add(new Car(11800, 73, "Dodge"));
        carSet.add(new Car(11500, 39, "Bentley"));
        carSet.add(new Car(12000, 55, "Ferrari"));
        carSet.add(new Car(11400, 56, "Porsche"));

//        PriceComparator priceComparator = new PriceComparator();
//        IdsComparator idComparator = new IdsComparator();
//        BrandComparator brandComparator = new BrandComparator();

        for (Car car:carSet) {
            System.out.println(car);
        }


    }

}
