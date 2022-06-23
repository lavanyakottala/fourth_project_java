package subject.maths.multiplication;

public class Multiples {
    public int a = 1;
    public int b = 7;

    public int e;
    public int multiple;

    public Multiples() {
        int c = a * b;
        System.out.println("multiplication of a and b is " + c);
        if (a > b) {
            System.out.println("a value is bigger than b value");

        } else {
            System.out.println("b value is smaller than a value");
        }
        while (a <5) {
            a++;
            System.out.println("the number is " + a);
        }
        int e=5;
        for (a = 1; a <= 10; a++) {
            System.out.println(e + "*" + a + "=" + multiple);

            multiple = e * a;
        }
        int a = 5;
        do {

            System.out.println("Hi lavanya");
            a++;
        } while (a <= 10);
        int number = 32;
        String size;
        switch (number) {
            case 12:
                size = "small";
                break;
            case 22:
                size = "medium";
                break;
            case 32:
                size = "large";
                break;
            case 42:
                size = "extra large";
                break;
            default:
                size = "unknown";
                break;
        }
        System.out.println("size: " + size);
        int num;
        int reminder;



    }
}




