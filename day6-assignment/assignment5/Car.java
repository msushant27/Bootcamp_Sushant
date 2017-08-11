package assignment5;

/**
 * Created by mandasu on 7/26/2017.
 */
public class Car implements Comparable<Car> {
    private int price;
    private int ids;
    private String brand;

    public Car(int price, int ids, String brand) {
        this.price = price;
        this.ids = ids;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int compareTo(Car car) {
        if (this.price == car.price) {
            return 0;
        } else if (this.price > car.price) {
            return -1;
        }
        return 1;
    }


    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", ids=" + ids +
                ", brand='" + brand + '\'' +
                '}';
    }
}

