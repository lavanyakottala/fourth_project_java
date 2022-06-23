import clge.bvrit.ece.Person;
import forest.animal.Location;
import forest.animal.fishes.Fish;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        String[] s=new String[4];
        s[0]="Lav";
        s[1]="sadfa";
        s[2]="kkk";
        s[3]="kumar";
//        s[4]="asdfa";
//        s[5]="asdfaadsa";
        /*for(int i=0;i<4;i++) {
            System.out.println(s[i]);
        }*/
        String kg="100Kg";

        /*Location[] locations=new Location[5];
        locations[0]=new Location();*/

        Person[] persons=new Person[4];

        List<String> list=new ArrayList();
        list.add("asdfa");
        list.add("kumar");
        list.add("new Pers");

        int index=list.indexOf("kumar");
        System.out.println("kumar is at index="+index);

        String name=list.get(1);
        list.set(2,"Premkumar");
       // list.clear();

        if(list.contains("kumar")){
            System.out.println("Kumar is avaialble in list");
        }else{
            System.out.println("Kumar is not available in list");
        }
        /*for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }*/
        list.forEach(value -> {
            System.out.println(value);
        });

        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            String s1=iterator.next();
            System.out.println(s1);
        }


        Map<String,Integer> map=new HashMap();
        map.put("name",1);
        map.put("age",6);

        map.get("name");


        Fish fish=new Fish();
        fish.setName("asdlfjlfsdjkl");
        System.out.println(fish.getName());





       /* Integer[] i=new Integer[3];
        Double[] d=new Double[5];
        Float[] f=new Float[66];*/
    }
}
