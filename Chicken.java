public class Chicken {

    private double height;
    private double weight;
    private double heightOfFly;
    private String eyeColor;

    public Chicken (double height, double weight, double heightOfFly, String eyeColor) {
        
        this.height = height;
        this.weight = height;
        this.height = heightOfFly;
        this.eyeColor = eyeColor;

    }

    public void toFly() {
        System.out.println(String.format("%s %4.2f", "лечу на бреющем полете, высота ",this.heightOfFly));
    }
}
