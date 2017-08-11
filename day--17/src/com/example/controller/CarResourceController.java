package com.example.controller;

import com.example.dao.CarDAO;
import com.example.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.*;

@RestController
public class CarResourceController {

    @Autowired
    CarDAO carDAO;


    @RequestMapping(value = "/car",produces = APPLICATION_JSON_VALUE ,method = RequestMethod.GET)
    public Car readCarAsJson() {
        Car car =carDAO.selectByVin(1000);
        return car;
    }


//    @RequestMapping(value = "/car",produces = APPLICATION_JSON_VALUE ,method = RequestMethod.GET)
//    public String readCarAsJson() {
//        return "{\"vin\":100,\"model\":\"Q7\",\"make\":\"Audi\"}";
//    }

    @RequestMapping(value = "/car",produces = APPLICATION_XML_VALUE ,method = RequestMethod.GET)
    public Car readCarAsXML() {
        Car car =carDAO.selectByVin(1000);
        return car;
    }

//    @RequestMapping(value = "/car",produces = APPLICATION_XML_VALUE ,method = RequestMethod.GET)
//    public String readCarAsXML() {
//        return "<car><vin>100</vin><model>Q7</model><make>Audi</make></car>";
//    }

    @RequestMapping(value = "/car",produces = "text/plain",method = RequestMethod.GET)
    public String readCar() {
        return "vin-100,model-Q7, make-Audi";
    }
}
