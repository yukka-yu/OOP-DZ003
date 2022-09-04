package Animals;

public abstract class WildAnimal extends Animal{

    private String lifeArea;
    private String dateOfFound;


public WildAnimal (int height, int weight, String eyeColor, String lifeArea, String dateOfFound) {
    super(height, weight, eyeColor);
    this.lifeArea = lifeArea;
    this.dateOfFound = dateOfFound;
}

@Override
public String printInfo (){
    return String.format ("%s, life area: %s, date of found: %s", super.printInfo(), this.lifeArea, this.dateOfFound);

}
}