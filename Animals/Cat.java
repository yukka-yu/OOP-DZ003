package Animals;

public class Cat extends HomeAnimal {

    protected Boolean isBald;

    public Cat(int height, int weight, String eyesColor, String color, String dateOfBirth, Boolean vaccinated, String name, String breed, Boolean isBald) {
        super(height, weight, eyesColor, color, dateOfBirth, name, breed, vaccinated);
        this.isBald = isBald;

    }

    @Override
    public void makeSound(){
        System.out.println("Miiiayyyy");
    }

    @Override
    public void love() {
        System.out.println("I love you, miiiayyy");;
    }

    @Override
    public String printInfo() {
        return getClass().getSimpleName() + String.format(" [ %s\nThe cat is bald: %b ]", super.printInfo(), this.isBald);
    }
}

