package Animals;

public abstract class HomeAnimal extends Animal {
    String dateOfBirth;
    Boolean vaccinated;
    String name;
    String breed;

    public HomeAnimal(int height, int weight, String eyesColor, String color, String dateOfBirth, 
    Boolean vaccinated, String name, String breed){
        super(height, weight, eyesColor, eyesColor);
        this.dateOfBirth = dateOfBirth;
        this.vaccinated = vaccinated;
        this.name = name;
        this.breed = breed;
    }

    public void love(){
        System.out.println("I love you");
    }

}
