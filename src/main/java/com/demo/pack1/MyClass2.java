package com.demo.pack1;

/**
 * Created by Sridhar on 07-06-2017.
 */
public class MyClass2 {
    String name;
    String city;

    @Override
    public String toString() {
        return "MyClass{" +
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
   /* public static void main(String[] arg){
        System.out.println("Welcome");
    }*/

}
