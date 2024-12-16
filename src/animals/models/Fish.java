package animals.models;

public abstract class Fish extends Animal {
    public Fish(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = "fish";
    }
    public void swim (){
        System.out.println("I'm swimming");
    }

    @Override
    public void whoAmI() {
        System.out.println("name: " + name + " age: " + age + " weight: " + weight + " species: " + species);
    }
}