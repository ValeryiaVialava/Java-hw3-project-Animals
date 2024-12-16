package animals.models;

public class Owl extends Bird implements Carnivorous {
    public Owl(String name, int age, double weight) {
        super(name, age, weight);
    }
    @Override
    public void hunt() {
        System.out.println(name + " is hunting");
    }
}
