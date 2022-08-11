import java.lang.reflect.WildcardType;

public class Stork {
    private int height;
    private int weight;
    private String eyesColor;

    public Stork (int height, int weight, String eyesColor) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
        
    }

        public void Fly(){
        System.out.println("Лечу");
    }

}