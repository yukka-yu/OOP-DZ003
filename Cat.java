public class Cat {
    private int height;
    private int weight;
    private String eyesColor;
    private String name;
    private String breed;
    private boolean vaccinated;
    private String color;
    private String dateOfBith;

    public Cat(int height, int weight, String eyesColor, String name,
               String breed, boolean vaccinated, String color, String dateOfBith){
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
        this.name = name;
        this.breed = breed;
        this.vaccinated = vaccinated;
        this.color = color;
        this.dateOfBith = dateOfBith;
    }


    public void makeSound(){
        System.out.println("Miiiayyyy");
    }

    public void love(){
        System.out.println("Tenderness");
    }

}
