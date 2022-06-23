package food.mcd.drivethru;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public String name;
    public int numplate;
    public int rate;

    public Car(String name, int numplate) {
        this.name=name;
        this.numplate=numplate;
        System.out.println(name);
        System.out.println(numplate);
    }


}
