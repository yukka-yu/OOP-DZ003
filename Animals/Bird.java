package Animals;

public abstract class Bird extends Animal{

    protected int heightOfFlight; //protected оно для того, чтобы эта величина была видна из аиста и курицы

    public Bird(int height, int weight, String eyeColor, int heightOfFlight){
        super(height, weight, eyeColor);
        this.heightOfFlight = heightOfFlight;
    }

    public abstract void makeSound();

    public void Fly(){
        System.out.println("Я лечу на высоте" + this.heightOfFlight);
    }

    public String printInfo(){
        return getClass().getSimpleName() + String.format(" [ %s, height of fly: %d ] ", super.printInfo(), this.heightOfFlight);

    }

}