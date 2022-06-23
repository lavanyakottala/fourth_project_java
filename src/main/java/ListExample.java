import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> rollnum= new ArrayList<Integer>();
        rollnum.add(5);
        rollnum.add(10);
        rollnum.add(15);
        System.out.println("the value which is in the index 2 is "+rollnum.get(2));
        rollnum.set(1,25);
        System.out.println("the value before swapping in the index 1 is 10 and after swapping the " +
                "value is "+rollnum.get(1));
        List details=new ArrayList();
        details.add("name");
        details.add(25);
        details.add(5.6);
        if(details.contains(25)){
            System.out.println("the age of the person exists");
        }
        else {
            System.out.println("the age of the person does not exist");
        }
        details.add(2,6.1);
        System.out.println("the height of the person is "+details.get(2));
        System.out.println("person age is in index "+details.indexOf(6.1));
        details.remove(2);
        System.out.println("the value in index 2 after changing is "+details.get(2));
        int x=details.size();
        System.out.println("the size of details object is "+details.size());
       /* for(int d=0; d < details.size();   d++ ){
            System.out.println(details.get(d));
        }*/
        details.forEach(detail -> {
            System.out.println(detail);
        });

    }
}
