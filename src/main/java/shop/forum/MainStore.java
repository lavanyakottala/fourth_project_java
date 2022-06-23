package shop.forum;

import shop.forum.clothing.Zara;
import shop.forum.electronics.Bajaj;
import shop.forum.food.Mehfil;
import shop.forum.shoezone.Bata;

public class MainStore {
    public static void main(String[] args) {
        Zara zara=new Zara("rawsilk","silk");
        Mehfil mehfil=new Mehfil();
       int a= mehfil.lunch("manchuria",200);
        System.out.println("returned value from lunch method ="+a);
        Bajaj bajaj=new Bajaj();
        int items= bajaj.getItems("samsung",false);
        System.out.println("returned value from items method= "+items);
        Bata bata = new Bata();

    }
}
