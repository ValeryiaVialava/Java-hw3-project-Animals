package animals.models;

public class Shark extends Fish implements Carnivorous{
    public Shark(String name, int age, double weight) {
        super (name, age, weight);
    }

    @Override
    public void hunt() {
        System.out.println(name + " is hunting");
    }
}