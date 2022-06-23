package food.mcd;

import food.mcd.drivethru.Car;
import food.mcd.headset.Till;

import java.util.ArrayList;
import java.util.List;

public class MainCounter {
    public static void main(String[] args) {
        Car car=new Car("bmw",124);
        System.out.println("the number plate number is "+car.numplate);
        List customer = new ArrayList();
        customer.add("lady");
        customer.add("cheeseburger");
        customer.add(1);
        System.out.println("lady is in the index "+customer.indexOf("lady"));
        System.out.println(customer.);
        Till till = new Till();



    }
}
