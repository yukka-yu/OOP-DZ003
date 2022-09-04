package Animals;

public class Tiger extends WildAnimal {
    
    public Tiger (int height, int weight, String eyesColor, String lifeArea, String dateOfFound){
        super(height, weight, eyesColor, lifeArea, dateOfFound);
        
    }

    // public Tiger(){

    // }

    @Override
    public void makeSound() {
        System.out.println("RRR");
    }

    @Override
    public String printInfo() {
        return getClass().getSimpleName() + " [ " + super.printInfo() + " ]";
    }

}