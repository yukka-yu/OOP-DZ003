package Animals;

public class Stork extends Bird{
    public Stork (int height, int weight, String eyeColor, int heightOfFlight){
        super(height, weight, eyeColor, heightOfFlight);     
    }

    @Override
    public void makeSound() {
        System.out.println("Я не знаю какие звуки издают аисты, пусть каркает");
    }

}