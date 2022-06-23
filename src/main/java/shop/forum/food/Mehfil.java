package shop.forum.food;

public class Mehfil {
    public String biryani="chicken";
    public String fastfood="noodles";
    public int cost=100;
    public int lunch(String fastfood,int cost){
        this.fastfood=fastfood;
        this.cost=cost;
        System.out.println("fastfood = "+fastfood);
        System.out.println("cost = "+cost);
        return cost;


    }
}
