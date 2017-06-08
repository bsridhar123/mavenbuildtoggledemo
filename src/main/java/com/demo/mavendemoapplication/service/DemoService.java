package com.demo.mavendemoapplication.service;

/**
 * Created by Sridhar on 07-06-2017.
 */
public class DemoService {

    String name;
    String city;

    @Override
    public String toString() {
        return "DemoService{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String sayHello(){
        return "Hello" + name;
    }


}
