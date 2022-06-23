package shop.forum.clothing;

import lombok.Data;

@Data
public class Zara {
    public String shirts= "Fabric";
    public String pants= "jeans";
    public String kurthis;
    public Zara(String shirts,String kurthis){
        this.shirts=shirts;
        this.kurthis=kurthis;
        System.out.println("shirts "+shirts);
        System.out.println("kurthis "+kurthis);


    }
}
