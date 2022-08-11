package Animals;
public class Chicken {

    private int height;
    private int weight;
    private int heightOfFly;
    private String eyeColor;

    public Chicken (int height, int weight, int heightOfFly, String eyeColor) {
        
        this.height = height;
        this.weight = height;
        this.height = heightOfFly;
        this.eyeColor = eyeColor;

    }

    public void Fly() {
        System.out.println(String.format("%s %d", "лечу на бреющем полете, высота ",this.heightOfFly));
    }
}
