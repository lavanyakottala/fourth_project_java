package clge.bvrit.cse;

import lombok.Data;

@Data
public class Student {
    public String name="lavanya";
    public int rollnum;
    public float marks= 74.5f;
    public int age= 25;

    public Student(){
        rollnum = 6;
    }
    public void name(){
        System.out.println(marks);
    }

    public String myData(){
        return  "prem";
    }
}
