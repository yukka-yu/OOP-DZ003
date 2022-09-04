package Animals;

public class Chicken extends Bird{
    
    public Chicken (int height, int weight,  String eyeColor, int heightOfFlight) {
        
        super (height, weight, eyeColor, heightOfFlight);
    }
    
    @Override
    public void makeSound() {
        System.out.println("кудах-тах-тах");
    }

    @Override
    public void Fly() {
        System.out.println(String.format("%s %d", "лечу на бреющем полете, высота ", this.heightOfFlight));
    }
}
