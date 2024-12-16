package animals;
import animals.models.*;

public class MainWithPolymorphism {
    public static void withPolymorphism() {
        Animal[] animals = {
                new Elephant("Dumbo", 10, 5000),
                new Tiger("Shera", 5, 300),
                new Sparrow("Chirpy", 1, 0.02),
                new Owl("Hooty", 3, 1.5),
                new Crucian("Goldie", 2, 0.5),
                new Shark("Jaws", 7, 800)
        };

        for (Animal animal : animals) {
            animal.whoAmI();
            animal.eat();
            animal.sleep();

            // проверяем тип и вызываем специфичные методы
            switch (animal) {
                case Mammal mammal -> mammal.walk();
                case Bird bird -> bird.fly();
                case Fish fish -> fish.swim();
                default -> {}
            }

            if (animal instanceof Carnivorous) {
                ((Carnivorous) animal).hunt();
            }

            System.out.println("----------------------");
        }
    }
}

