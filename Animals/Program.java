package Animals;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
        public static void main (String[] args) {

        Tiger tigerLeo = new Tiger(80, 120, "yellow", "Asia", "April 18");
        Tiger tigerTig = new Tiger(92, 150, "yellow", "Asia", "April 18");
        Chicken chickenKu = new Chicken(30, 2, "black", 1);
        Dog dogBouncy = new Dog(50, 28, "brown", "brown", "August 4" , "Bouncy", "spaniel", true,  true);
        Stork stork1 = new Stork(150, 15, "black", 15);

        Zoo AntverpenZoo = new Zoo();
        AntverpenZoo.addAnimal(tigerLeo);
        AntverpenZoo.addAnimal(dogBouncy);
        AntverpenZoo.addAnimal(stork1);

        while (true) {
            System.out.println("Choose an action: \n" +
                    "1 - add animal \n" +
                    "2 - del animal \n" +
                    "3 - View information about the animal \n" +
                    "4 - Make the animal make a sound \n" +
                    "5 - Print information about ALL the animals that are currently in the zoo \n" +
                    "6 - Make ALL the animals that are currently in the zoo make a sound \n" +
                    "7 - EXIT");

            Scanner scanner = new Scanner(System.in);
            int choise1 = scanner.nextInt();

            if (choise1 == 1) {
                System.out.println(
                        "1 - tigerLeo \n" +
                        "2 - tigerTig \n" +
                        "3 - chickenKu \n" +
                        "4 - dogBouncy \n" +
                        "5 - stork1");

                int choise2 = scanner.nextInt();
                switch (choise2) {
                    case 1 -> AntverpenZoo.addAnimal(tigerLeo);
                    case 2 -> AntverpenZoo.addAnimal(tigerTig);
                    case 3 -> AntverpenZoo.addAnimal(chickenKu);
                    case 4 -> AntverpenZoo.addAnimal(dogBouncy);
                    case 5 -> AntverpenZoo.addAnimal(stork1);
                }

            }

            if (choise1 == 2) {

                for (int i = 0; i < AntverpenZoo.animalCollection.size(); i++) {
                    System.out.printf((i + 1) + ": " + AntverpenZoo.animalCollection.get(i).getClass().getSimpleName() + "\n");
                }

                System.out.println("Enter the number of the animal to delete: ");
                int choise3 = scanner.nextInt();
                if (choise3 <= AntverpenZoo.animalCollection.size()){
                    AntverpenZoo.deleteAnimal(choise3 - 1);
                }
                else System.out.println("There's no animal with such number in this Zoo");
                
            }

            if (choise1 == 3) {
                for (int i = 0; i < AntverpenZoo.animalCollection.size(); i++) {
                    System.out.printf((i + 1) + ": " + AntverpenZoo.animalCollection.get(i).getClass().getSimpleName() + "\n");
                }
                System.out.println("Enter the number of the animal to view the information: ");
                int choise4 = scanner.nextInt();
                if (choise4 <= AntverpenZoo.animalCollection.size()){
                    AntverpenZoo.printInfo(choise4 - 1);
                }
                else System.out.println("There's no animal with such number in this Zoo");
                
            }
            if (choise1 == 4){

                for (int i = 0; i < AntverpenZoo.animalCollection.size(); i++) {
                    System.out.printf((i + 1) + ": " + AntverpenZoo.animalCollection.get(i).getClass().getSimpleName() + "\n");
                }

                System.out.println("Enter the number of the animal to make sound: ");
                int choise5 = scanner.nextInt();
                if (choise5 <= AntverpenZoo.animalCollection.size()){
                    AntverpenZoo.makeSound(choise5 - 1);
                }
                else System.out.println("There's no animal with such number in this Zoo");
                
            }

            if (choise1 == 5){
                AntverpenZoo.printAllInfo();
            }

            if (choise1 == 6){
                AntverpenZoo.makeAllSound();
            }

            if (choise1 == 7){
                break;
            }

            scanner.close();

        }
    }

}
