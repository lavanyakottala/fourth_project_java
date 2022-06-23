package forest.animal.animals1;

public class BiggerAnimal {
    public String name;
    public int age;
    public boolean king;
    public double height;
    public boolean amphibian;
    public String colour;
    public String dog;
    public String colour1;
    public int age1;
    public boolean pet;


    public BiggerAnimal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.print("the name of the animal is " + name);
        System.out.println(" and its age is " + age);
    }

    public BiggerAnimal(boolean king, double height) {
        this.king = king;
        this.height = height;
        System.out.print("is it a king of animals " + king);
        System.out.println(" and its height is " + height);

    }

    public BiggerAnimal(boolean amphibian, String colour) {
        this.amphibian = amphibian;
        this.colour = colour;
        System.out.println("lion is an amphibian = " + amphibian);
        System.out.println("the colour of the lion is " + colour);
    }

    public BiggerAnimal(String dog, boolean pet) {
        this.dog = dog;
        this.pet = pet;
        System.out.println("the name of the dog is " + dog);
        System.out.println("is it a pet " + pet);
    }

    /*public BiggerAnimals(int age1, String colour1) {
        this.colour1 = colour1;
        this.age1 = age1;
        System.out.println("the colour of the zoey is " + colour1);
        System.out.println("the age of the zoey is " + age1);
    }*/


}

