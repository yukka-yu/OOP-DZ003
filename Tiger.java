// III. Реализовать класс тигр, содержащий слелующие поля: Юлия
// 1. Рост животного
// 2. Вес животного
// 3. Цвет глаз животного
// 4. Место обитания
// 5. Дата нахождения
// И методами:
// 1. Издавать звук

public class Tiger {
    private int height;
    private int weight;
    private String eyesColor;
    private String liveArea;
    private int dateOfFound;

    public Tiger (int height, int weight, String eyesColor, String liveArea, int dateOfFound){
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
        this.liveArea = liveArea;
        this.dateOfFound = dateOfFound;
    }

        public void MakeSound(){
        System.out.println("Рычу");
    }
}