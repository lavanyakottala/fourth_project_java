package clge.bvrit;

import clge.bvrit.cse.Student;
import clge.bvrit.ece.ClassRepresentative;
import clge.bvrit.ece.Person;
import clge.bvrit.eee.Machine;

public class MainBranch {
    public static void main(String[] args) {

        System.out.println("I am going to create Machine Instance");
        Machine machine=new Machine();

        System.out.println("I am goint to create Person Instance");
        Person person=new Person();

        System.out.print("My name is lavanya, ");
        Student member = new Student();
        System.out.print("my marks are " + member.rollnum);
        System.out.println(" and my age is " + member.age);
        ClassRepresentative student = new ClassRepresentative();
        System.out.println("Class representative name is " + student.name);
        System.out.println("and their score is " + student.score);
        System.out.println("is she a topper " + student.topper);
        System.out.println("is she eligible for placements " + student.eligible);
        member.name();
        int value=student.cased();
        System.out.println("Returned value="+value);
    }
}
