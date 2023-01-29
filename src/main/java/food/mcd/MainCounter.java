package food.mcd;

import food.mcd.drivethru.Car;
import food.mcd.headset.Till;

import java.sql.SQLOutput;
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
        customer.set(1,"hamburger");
        System.out.println("the burger after swapping with cheeseburger is "+customer.get(1));
        for(int d=0;d<customer.size();d++){
            System.out.println(customer.get(d));
        }
        Till till = new Till();



    }
}
