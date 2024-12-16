package animals.models;

public abstract class Mammal extends Animal {
    private final int numberOfLegs;
    public Mammal(String name, int age, double weight, int numberOfLegs) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.numberOfLegs = numberOfLegs;
        this.species = "mammal";
    }

    public void walk() {
        System.out.println(name + " walks on " + numberOfLegs + " legs");
    }

    @Override
    public void whoAmI() {
        System.out.println("name: " + name + " age: " + age + " weight: " + weight + " species: " + species);
    }
}
