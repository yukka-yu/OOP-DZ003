package Animals;
public class Dog extends HomeAnimal{
    Boolean trained;

    /**Конструктор */
    public Dog(int height, int weight, String eyeColor, String name, String breed, Boolean vaccinated, String color, String dateOfBirth, Boolean trained){
        super(height, weight, eyeColor, name, breed, vaccinated, color, dateOfBirth); 
        this.trained = trained;
    }

    public void makeSound(){
        System.out.println("Woof!");
    }
    
    public void love(){
        System.out.println("I love you");
    }

    @Override
    public String printInfo(){
        return String.format("%s\ntrained: ", super.printInfo(), this.trained);
    }

    public void training(){
        trained = true;
    }

}
