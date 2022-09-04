package Animals;
public class Dog extends HomeAnimal {
    
    protected Boolean trained;

    /**Конструктор */
    //public Dog(int height, int weight, String eyeColor, String name, String breed, String color, String dateOfBirth, Boolean vaccinated, Boolean trained){
        //super(height, weight, eyeColor, name, breed, color, dateOfBirth, vaccinated);
        //
    //}

    public Dog(int height, int weight, String eyesColor, String color, String dateOfBirth, String name, String breed, Boolean vaccinated, Boolean trained) {
        super(height, weight, eyesColor, color, dateOfBirth, name, breed, vaccinated);
        this.trained = trained;
        
    }


    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }
    
    public void love(){
        System.out.println("I love you");
    }

    public void training(){
        trained = true;
    }
    @Override
    public String printInfo(){
        return getClass().getSimpleName() + String.format(" [ %s, trained: %b ] ", super.printInfo(), this.trained);
    }

}
