package schl.cardiff;

import schl.cardiff.clas.subjects.maths.Addition;
import schl.cardiff.clas.subjects.maths.SubName;
import schl.cardiff.clas.subjects.maths.Substraction;

public class Performance {
    public static void main(String[] args) {
        System.out.println("Creating instance for Addition class ");
        Addition addition = new Addition();
        System.out.println("creating instance for substraction class");
        Substraction substraction= new Substraction();
        System.out.println("creating instance for subname class");
        SubName subname= new SubName();
        subname.subjct();



    }
}
