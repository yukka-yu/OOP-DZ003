package Animals;
import java.util.ArrayList;

public class Zoo {
    protected ArrayList <Animal> animalCollection;

//Конструктор

    public Zoo (ArrayList <Animal> animalCollection) {
        this.animalCollection = animalCollection;
    }   

    public Zoo(){
        this.animalCollection = new ArrayList<>();
    }

//Методы

    public void addAnimal (Animal animal) {
        animalCollection.add(animal);
    }

    public void deleteAnimal(int i) {
        animalCollection.remove(i);
    }

    public void printInfo(int i) {
        System.out.println(animalCollection.get(i).printInfo()); 
    }

    public void makeSound(int i) {
        animalCollection.get(i).makeSound();
    }

    public void printAllInfo() {
        for (Animal animal: animalCollection){
            System.out.println(animal.printInfo());
        }
    }

    public void makeAllSound() {
        for (Animal animal: animalCollection){
            animal.makeSound();
        }
    }
    
}
