package Animals;
public class Dog {
    int height;
    int weight;
    String eyeColor;
    String name;
    String breed;
    Boolean vaccinated;
    String color;
    String dateOfBirth;

    /**Конструктор */
    public Dog(int height, int weight, String eyeColor, String name, String breed, Boolean vaccinated, String color, String dateOfBirth){
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.name = name;
        this.breed = breed;
        this.vaccinated = vaccinated;
        this.color = color;
        this.dateOfBirth = dateOfBirth;
    }

    public void makeSound(){
        System.out.println("Woof!");
    }
    
    public void love(){
        System.out.println("I love you");
    }

}
