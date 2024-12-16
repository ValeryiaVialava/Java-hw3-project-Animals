package animals.models;

public abstract class Bird extends Animal {
    public Bird(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = "bird";
    }
    public void fly (){
        System.out.println("I'm flying");
    }

    @Override
    public void whoAmI() {
        System.out.println("name: " + name + " age: " + age + " weight: " + weight + " species: " + species);
    }
}
