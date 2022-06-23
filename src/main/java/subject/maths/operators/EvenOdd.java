package subject.maths.operators;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        if(scanner.hasNextInt()){
            System.out.println("The value u have entered is Integer"+scanner.nextInt());
        } else {
            System.out.println("The value is String");
        }


        //int number = reader.nextInt();

        /*if(number % 2 == 0){
            System.out.println("The value you entered ="+number+" is Even number");
        }else{
            System.out.println("The value you entered="+number+" is Odd number");
        }*/
        // println() prints the following line to the output screen
        //System.out.println("You entered: " + number);
    }
}
