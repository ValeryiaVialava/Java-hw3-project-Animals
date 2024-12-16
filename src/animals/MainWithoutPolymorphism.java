package animals;
import animals.models.*;

public class MainWithoutPolymorphism {
    public static void withoutPolymorphism() {
        Elephant elephant = new Elephant("Dumbo", 10, 5000);
        Tiger tiger = new Tiger("Shera", 5, 300);
        Sparrow sparrow = new Sparrow("Chirpy", 1, 0.02);
        Owl owl = new Owl("Hooty", 3, 1.5);
        Crucian crucian = new Crucian("Goldie", 2, 0.5);
        Shark shark = new Shark("Jaws", 7, 800);

        elephant.whoAmI();
        elephant.walk();
        elephant.eat();
        elephant.sleep();

        System.out.println("----------------------");

        tiger.whoAmI();
        tiger.walk();
        tiger.eat();
        tiger.sleep();
        tiger.hunt();

        System.out.println("----------------------");

        sparrow.whoAmI();
        sparrow.fly();
        sparrow.eat();
        sparrow.sleep();

        System.out.println("----------------------");

        owl.whoAmI();
        owl.fly();
        owl.eat();
        owl.sleep();
        owl.hunt();

        System.out.println("----------------------");

        crucian.whoAmI();
        crucian.swim();
        crucian.eat();
        crucian.sleep();

        System.out.println("----------------------");

        shark.whoAmI();
        shark.swim();
        shark.eat();
        shark.sleep();
        shark.hunt();
    }
}
