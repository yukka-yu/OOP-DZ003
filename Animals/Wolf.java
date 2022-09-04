package Animals;

public class Wolf extends WildAnimal{

    protected String packLeader;

    public Wolf(int height,  int weight, String eyeColor, String lifeArea, String dateOfFound, String packLeader) {
        super(height, weight, eyeColor, lifeArea, dateOfFound);
        this.packLeader = packLeader;
    }

    @Override
    public void makeSound() {
        System.out.println("RRR");
    }

    @Override
    public String printInfo(){
        return getClass().getSimpleName() + String.format(" [%s, %s ] ", super.printInfo(), packLeader);
    }
}