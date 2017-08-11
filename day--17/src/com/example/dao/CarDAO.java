package com.example.dao;

import com.example.model.Car;
import org.springframework.stereotype.Repository;

@Repository
public class CarDAO {

    public Car selectByVin(int vin) {
        // JDBC logic

        return new Car(1000,"X5", "BMW",4500000.0,5);
    }
}
