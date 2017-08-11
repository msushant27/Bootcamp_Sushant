package org.cdk.annotation;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    int id;
    String name;
    String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Employee(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public Employee() {}
}
